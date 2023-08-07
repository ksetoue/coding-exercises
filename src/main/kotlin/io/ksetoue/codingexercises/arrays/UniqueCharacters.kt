package io.ksetoue.codingexercises.arrays

class UniqueCharacters {

    fun hasOnlyUniqueCharacters(s: String): Boolean {
        return s.groupBy { it }.all { it.value.size == 1 }
    }

    fun hasAnyUniqueCharacters(s: String): Boolean {
        val set = s.groupBy { it }

        return set.any { it.value.size == 1 }
    }

    fun countNonUniqueCharacters(s: String): MutableMap<Char, Int> {
        val set = s.groupBy { it }

        val newSet = mutableMapOf<Char, Int>()


        set.filter { it.value.size > 1 }
            .map {
                newSet.put(it.key, it.value.size)
        }

        return newSet
    }
}