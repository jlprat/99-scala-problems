package com.github.jlprat.ninetynine.p08

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p08.P08._

/**
  * Created by @jlprat on 02/03/2016.
  * Specs for the problem P08: Eliminate consecutive duplicates of list elements
  */
class P08Spec extends WordSpec {

  "compressConsecutiveDuplicates" when {
    "called on an empty list" should {
      "return the empty list again" in {
        val empty = List()
        assert(compressConsecutiveDuplicates(empty) === empty)
      }
    }
    "called on a list with no duplicates" should {
      "return the same list" in {
        val list = List(1, 2, 3)
        assert(compressConsecutiveDuplicates(list) === list)
      }
    }
    "called on a list with the same element several times" should {
      "return a list with only that element" in {
        val list = List.tabulate(50)(_ => 1)
        assert(compressConsecutiveDuplicates(list) === List(1))
      }
    }
    "called on a list with some consecutive duplicates" should {
      "compress the elements that are consecutively repeated" in {
        val list = List(1, 1, 1, 2, 2, 3, 3, 3, 4)
        assert(compressConsecutiveDuplicates(list) === List(1, 2, 3, 4))
      }
    }
    "called on a list with some consecutive duplicates that are also appearing later" should {
      "compress the elements that are consecutively repeated but not the ones that appear later" in {
        val list = List(1, 1, 1, 2, 2, 1, 3, 2)
        assert(compressConsecutiveDuplicates(list) === List(1, 2, 1, 3, 2))
      }
    }
  }

  "newly added compressConsecutiveDuplicates method in lists" when {
    "called on an empty list" should {
      "return the empty list again" in {
        val empty = List[Int]()
        assert(empty.compressConsecutiveDuplicates === empty)
      }
    }
    "called on a list with no duplicates" should {
      "return the same list" in {
        val list = List(1, 2, 3)
        assert(list.compressConsecutiveDuplicates === list)
      }
    }
    "called on a list with the same element several times" should {
      "return a list with only that element" in {
        val list = List.tabulate(50)(_ => 1)
        assert(list.compressConsecutiveDuplicates === List(1))
      }
    }
    "called on a list with some consecutive duplicates" should {
      "compress the elements that are consecutively repeated" in {
        val list = List(1, 1, 1, 2, 2, 3, 3, 3, 4)
        assert(list.compressConsecutiveDuplicates === List(1, 2, 3, 4))
      }
    }
    "called on a list with some consecutive duplicates that are also appearing later" should {
      "compress the elements that are consecutively repeated but not the ones that appear later" in {
        val list = List(1, 1, 1, 2, 2, 1, 3, 2)
        assert(list.compressConsecutiveDuplicates === List(1, 2, 1, 3, 2))
      }
    }
  }
}
