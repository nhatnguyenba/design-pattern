package com.nhatnguyenba.model.view.presenter

import com.nhatnguyenba.model.view.presenter.LoginContract.Presenter

class LoginPresenter(private val mView: LoginContract.View, private val mModel: LoginContract.Model) : Presenter {

    override fun onLoginButtonClick(email: String?, password: String?) {
        if (mModel.login(email, password)) {
            mView.showLoginSuccessMessage()
        } else {
            mView.showInvalidCredentialsError()
        }
    }
}