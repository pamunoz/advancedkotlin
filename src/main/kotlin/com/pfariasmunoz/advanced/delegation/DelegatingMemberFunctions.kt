package com.pfariasmunoz.advanced.delegation

import com.pfariasmunoz.advanced.classes.Customer

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll() {

    }
}

// we delegage the Repository to repository by the key word {by}
// so i can have acces to its methods
// This means: delegate the functionality of Repository to the intance being past in
class ControllerString(repository: Repository, logger: Logger):
        Repository by repository,
        Logger by logger
{
    fun index(): String {
        return "something"
    }
}