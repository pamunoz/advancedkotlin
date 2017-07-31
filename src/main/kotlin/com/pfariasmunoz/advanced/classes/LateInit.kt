package com.pfariasmunoz.advanced.classes

interface Repository {
    fun getAll(): List<Customer>
}

class CustomerController() {
    lateinit var repository: Repository

    fun index(): String {
        return repository.getAll().toString()
    }


}