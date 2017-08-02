package com.pfariasmunoz.advanced.generics

import java.io.Serializable

open class Entity(val id: Int)

// if you want multiple restriccion, you do: <T> where T: Something, T: SomethingElse
// if you want that T can be of any object, etcept null, use Any
class Repository<T: Entity> {

    fun save(entity: T) {
        if (entity.id != 0) {

        }
    }
}

fun <T: Serializable>streamObject(obj: T) {

}

fun main(args: Array<String>) {
    val repo = Repository<CutomerEntity>()
}

class CutomerEntity: Entity(0) {

}
