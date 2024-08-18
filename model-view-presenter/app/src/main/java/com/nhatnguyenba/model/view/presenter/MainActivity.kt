package com.nhatnguyenba.model.view.presenter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity(), LoginContract.View {
    private val etEmail: EditText by lazy {
        findViewById(R.id.emailEditText)
    }
    private val etPassword: EditText by lazy {
        findViewById(R.id.passwordEditText)
    }
    private val btnSignIn: Button by lazy {
        findViewById(R.id.loginButton)
    }
    private val loginPresenter: LoginContract.Presenter by lazy {
        LoginPresenter(this, LoginModel())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSignIn.setOnClickListener {
            val email = etEmail.text.toString().trim { it <= ' ' }
            val password = etPassword.text.toString().trim { it <= ' ' }
            loginPresenter.onLoginButtonClick(email, password)
        }
    }

    override fun showInvalidCredentialsError() {
        Toast.makeText(this, R.string.invalid_credentials_error, Toast.LENGTH_SHORT).show()
    }

    override fun showLoginSuccessMessage() {
        Toast.makeText(this, R.string.signin_success, Toast.LENGTH_SHORT).show()

        // Upon successful login, the user will be redirected to HomeActivity via Intent
        val intent = Intent(this@MainActivity, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}