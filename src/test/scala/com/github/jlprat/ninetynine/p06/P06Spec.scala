package com.github.jlprat.ninetynine.p06

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p06.P06._

/**
  * Created by @jlprat on 01/03/2016.
  * Specs for problem P06: Find out if a list is a palindrome
  */
class P06Spec extends WordSpec {
  "isPalindrome" when {
    "called in empty lists" should {
      "return true" in {
        assert(isPalindrome(List()))
      }
    }
    "called in single element lists" should {
      "return true" in {
        //candidate to generator test
        assert(isPalindrome(List(1)))
        assert(isPalindrome(List("foo")))
      }
    }
    "called on lists with 2 or more elements which are not palindromes" should {
      "return false" in {
        assert(!isPalindrome(List(1, 2)))
        assert(!isPalindrome(List("foo", "bar")))
        assert(!isPalindrome(List("foo", "bar", "baz", "foo")))
      }
    }
    "called on lists with 2 or more elements which are palindromes" should {
      "return true" in {
        val part1 = List("foo", "bar", "foz", "baz")
        val palindromeListOne = part1 ::: part1.reverse
        assert(isPalindrome(palindromeListOne))
        val palindromeListTwo = part1 ::: ("zoo" :: part1.reverse)
        assert(isPalindrome(palindromeListTwo))
      }
    }
  }

  "newly isPalindrome function in lists" when {
    "called in empty lists" should {
      "return true" in {
        assert(List().isPalindrome)
      }
    }
    "called in single element lists" should {
      "return true" in {
        assert(List(1).isPalindrome)
        assert(List("foo").isPalindrome)
      }
    }
    "called on lists with 2 or more elements which are not palindromes" should {
      "return false" in {
        assert(!List(1, 2).isPalindrome)
        assert(!List("foo", "bar").isPalindrome)
        assert(!List("foo", "bar", "baz", "foo").isPalindrome)
      }
    }
    "called on lists with 2 or more elements which are palindromes" should {
      "return true" in {
        val part1 = List("foo", "bar", "foz", "baz")
        val palindromeListOne = part1 ::: part1.reverse
        assert(palindromeListOne.isPalindrome)
        val palindromeListTwo = part1 ::: ("zoo" :: part1.reverse)
        assert(palindromeListTwo.isPalindrome)
      }
    }
  }
}
