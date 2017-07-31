package com.pfariasmunoz.advanced.classes

class DirectoryExprorer(val user: String) {


    // the nested class to be inner class, we need to add the {inner} modifier
    // and then we can acces the properties of the outerclass
    inner class PersmissionCheck() {
        fun validatePermission() {
            if (user != "Pablo") {

            }
        }
    }

    fun listFolder(folder: String, user: String) {
        val permissionCheck = PersmissionCheck()
        permissionCheck.validatePermission()
    }
}

fun main(args: Array<String>) {
    val de = DirectoryExprorer("Pablo Farías")
    // because it is a inner class we can access as a inner class
    val pc = de.PersmissionCheck()
}