package io.ksetoue.codingexercises.arrays

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UniqueCharactersTest {
    private val uniqueCharacters = UniqueCharacters()

    @Test
    fun `#hasOnlyUniqueCharacters should return true when string contains only unique characters`() {
        val result = uniqueCharacters.hasOnlyUniqueCharacters("abcde")

        assertThat(result).isTrue()
    }


    @Test
    fun `#hasOnlyUniqueCharacters should return false when string does not contains only unique characters`() {
        val result = uniqueCharacters.hasOnlyUniqueCharacters("abcdee")

        assertThat(result).isFalse()
    }

    @Test
    fun `#hasAnyUniqueCharacters should return true when string contains any unique characters`() {
        val result = uniqueCharacters.hasAnyUniqueCharacters("abdcdee")

        assertThat(result).isTrue()
    }

    @Test
    fun `#hasAnyUniqueCharacters should return false when string does not contains any unique characters`() {
        val result = uniqueCharacters.hasAnyUniqueCharacters("aabbccdee")

        assertThat(result).isNotNull
    }

    @Test
    fun `#countNonUniqueCharacters should a list of characters with the amount of characters repeated`() {
        val result = uniqueCharacters.countNonUniqueCharacters("aabbccdee")

        assertThat(result).isNotNull
    }

    @Test
    fun `#countNonUniqueCharacters should an empty list of characters when string has only unique characters`() {
        val result = uniqueCharacters.countNonUniqueCharacters("abcde")

        assertThat(result).isEmpty()
    }
}