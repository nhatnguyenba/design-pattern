package com.nhatnguyenba.model.view.presenter

class LoginModel : LoginContract.Model {
    // Creating an ArrayList of users
    private val users = ArrayList<User>()

    init {
        users.add(User("john@abc.com", "john123", "password123"))
        users.add(User("mike@def.com", "mike789", "password789"))
        users.add(User("paul@xyz.com", "paul01", "paulxyz01"))
        users.add(User("jane@xyz.com", "jane456", "pass456"))
    }

    override fun login(email: String?, password: String?): Boolean {
        return checkUser(email, password)
    }

    // Checking a valid user
    private fun checkUser(emailOrUsername: String?, password: String?): Boolean {

        for (user in users) {
            if ((user.username == emailOrUsername || user.email == emailOrUsername) && user.password == password) return true
        }
        return false
    }
}
