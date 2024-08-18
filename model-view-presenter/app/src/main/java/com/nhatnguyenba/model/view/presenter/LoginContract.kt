package com.nhatnguyenba.model.view.presenter

interface LoginContract {
    // interface for the View
    interface View {
        fun showInvalidCredentialsError()
        fun showLoginSuccessMessage()
    }

    // interface for the Presenter
    interface Presenter {
        fun onLoginButtonClick(email: String?, password: String?)
    }

    // interface for the Model
    interface Model {
        fun login(email: String?, password: String?): Boolean
    }
}