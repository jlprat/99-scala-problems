package com.github.jlprat.ninetynine.p05

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p05.P05._

/**
  * Created by @jlprat on 01/03/2016.
  * This class tests the problem P05: Reverse a list
  */
class P05Spec extends WordSpec {

  "reverse" when {
    val someList = List(1, 2, 3)
    "called on empty lists" should {
      "return the 'Nil' (or empty) list" in {
        val empty = List()
        assert(reverse(empty) === empty)
      }
    }
    "called on lists that contain the same element" should {
      "return the same list back" in {
        val sameElems1 = List(1,1,1)
        assert(reverse(sameElems1) === sameElems1)
        val sameElems2 = List("foo", "foo", "foo")
        assert(reverse(sameElems2) === sameElems2)
      }
    }
    "called on lists that are palindromes" should {
      "return the same list back" in {
        val palindromeEven = List(1, 2, 3, 3, 2, 1)
        assert(reverse(palindromeEven) === palindromeEven)
        val palindromeOdd = List(1, 2, 3, 2, 1)
        assert(reverse(palindromeOdd) === palindromeOdd)
      }
    }
    "called on 'random' lists" should {
      "return a list with the elements in the reverse order" in {
        assert(reverse(someList) === List(3, 2, 1))
      }
    }
    "called twice on a list" should {
      "return the same list, independently of the source list" in {
        assert(reverse(reverse(someList)) === someList)
      }
    }
  }

  "myReverse newly added function in Lists" when {
    val someList = List(1, 2, 3)
    "called on empty lists" should {
      "return the 'Nil' (or empty) list" in {
        val empty = List()
        val reversed = empty.myReverse
        assert(reversed === empty)
      }
    }
    "called on lists that contain the same element" should {
      "return the same list back" in {
        val sameElems1 = List(1,1,1)
        assert(sameElems1.myReverse === sameElems1)
        val sameElems2 = List("foo", "foo", "foo")
        assert(sameElems2.myReverse === sameElems2)
      }
    }
    "called on lists that are palindromes" should {
      "return the same list back" in {
        val palindromeEven = List(1, 2, 3, 3, 2, 1)
        assert(palindromeEven.myReverse === palindromeEven)
        val palindromeOdd = List(1, 2, 3, 2, 1)
        assert(palindromeOdd.myReverse === palindromeOdd)
      }
    }
    "called on 'random' lists" should {
      "return a list with the elements in the reverse order" in {
        assert(someList.myReverse === List(3, 2, 1))
      }
    }
    "called twice on a list" should {
      "return the same list, independently of the source list" in {
        assert(someList.myReverse.myReverse === someList)
      }
    }
  }
}
