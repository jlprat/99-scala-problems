package com.github.jlprat.ninetynine.p04

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p04.P04._

/**
  * Created by josep on 01/03/2016.
  */
class P04Spec extends WordSpec {

  "size" when {
    "called on empty lists" should {
      "return 0" in {
        val empty = List()
        assert(size(empty) === 0)
      }
    }
    "called on non empty lists" should {
      "return the number of elements present in the list" in {
        val singleList = List(1)
        assert(size(singleList) === 1)
        val threeList = List(1, 2, 3)
        assert(size(threeList) === 3)
        val tenStrings = List.tabulate(10)(x => s"foo$x")
        assert(size(tenStrings) === 10)
      }
    }
    "called on very long lists" should {
      "return the number of elements and not fail" in {
        val longList = List.tabulate(10000)(x => x)
        assert(size(longList) === 10000)
      }
    }
  }

  "mySize newly added function on lists" when {
    "called on empty lists" should {
      "return 0" in {
        val empty = List()
        assert(empty.mySize === 0)
      }
    }
    "called on non empty lists" should {
      "return the number of elements present in the list" in {
        val singleList = List(1)
        assert(singleList.mySize === 1)
        val threeList = List(1, 2, 3)
        assert(threeList.mySize === 3)
        val tenStrings = List.tabulate(10)(x => s"foo$x")
        assert(tenStrings.mySize === 10)
      }
    }
    "called on very long lists" should {
      "return the number of elements and not fail" in {
        val longList = List.tabulate(10000)(x => x)
        assert(longList.mySize === 10000)
      }
    }
  }
}
