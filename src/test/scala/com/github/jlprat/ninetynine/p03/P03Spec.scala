package com.github.jlprat.ninetynine.p03

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p03.S03._

/**
  * Created by josep on 29/02/2016.
  *
  * This class tests the problem P03: Find the kth element of a list.
  */
class P03Spec extends WordSpec {

  "kth" when {
    "called on empty lists" should {
      val empty = List()
      "fail with an exception" in {
        intercept[NoSuchElementException](
          kth(empty, 1)
        )
        intercept[NoSuchElementException](
          kth(empty, 2)
        )
        intercept[NoSuchElementException](
          kth(empty, 0)
        )
      }
    }
    "called on non empty lists" should {
      val nonEmpty = List(1, 2, 3)
      "fail when the kth position is greater than the length of the list" in {
        intercept[NoSuchElementException](
          kth(nonEmpty, 3)
        )
        intercept[NoSuchElementException](
          kth(nonEmpty, 4)
        )
        intercept[NoSuchElementException](
          kth(nonEmpty, 12000)
        )
      }
      "fail when the position is negative" in {
        intercept[NoSuchElementException](
          kth(nonEmpty, -1)
        )
      }
      "succeed and return the kth element when the list is big enough" in {
        assert(kth(nonEmpty,0) === 1)
        assert(kth(nonEmpty,1) === 2)
        assert(kth(nonEmpty,2) === 3)
        val stringList = List("foo", "bar", "foz", "baz")
        assert(kth(stringList, 0) === "foo")
        assert(kth(stringList, 1) === "bar")
        assert(kth(stringList, 2) === "foz")
        assert(kth(stringList, 3) === "baz")
      }
    }
    "called on long lists" should {
      val longList = List.tabulate(10000)(x => x)
      "succeed as well" in {
        assert(kth(longList, 0) === 0)
        assert(kth(longList, 42) === 42)
        assert(kth(longList, 1142) === 1142)
        assert(kth(longList, 9999) === 9999)
      }
    }
  }
}
