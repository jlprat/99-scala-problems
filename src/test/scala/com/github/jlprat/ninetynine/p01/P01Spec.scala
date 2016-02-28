package com.github.jlprat.ninetynine.p01

import org.scalatest.WordSpec
import com.github.jlprat.ninetynine.p01.P01._


/**
  * This class tests the problem P01: Find the last element of a list.
  *
  * Created by @jlprat on 28/2/16.
  */
class P01Spec extends WordSpec {

  "myLast" when {
    "called on empty lists" should {
      val empty = List()
      "fail with an exception" in {
        intercept[NoSuchElementException](
          myLast(empty)
        )
      }
    }
    "called on lists with one element" should {
      val singleInt = List(1)
      val singleString = List("foo")
      "return that single element" in {
        assert(myLast(singleInt) === 1)
        assert(myLast(singleString) === "foo")
      }
    }
    "called on lists with multiple elements" should {
      val smallList = List.tabulate(5)(x => x)
      val mediumList = List.tabulate(100)(x => x)
      val bigList = List.tabulate(20000)(x => x)
      "return always the last element" in {
        assert(myLast(smallList) === 4)
        assert(myLast(mediumList) === 99)
        assert(myLast(bigList) === 19999)
      }
    }
    "called on lists that include lists" should {
      val table = List.tabulate(3,4)((x,y) => s"$x - $y")
      "return also the last element" in {
        assert(myLast(table) === List.tabulate(4)(x => s"2 - $x"))
      }
    }
  }


  "myLastOption" when {
    "called on empty lists" should {
      val empty = List()
      "return None" in {
        assert(myLastOption(empty) === None)
      }
    }
    "called on lists with one element" should {
      val singleInt = List(1)
      val singleString = List("foo")
      "return that single element" in {
        assert(myLastOption(singleInt) === Some(1))
        assert(myLastOption(singleString) === Some("foo"))
      }
    }
    "called on lists with multiple elements" should {
      val smallList = List.tabulate(5)(x => x)
      val mediumList = List.tabulate(100)(x => x)
      val bigList = List.tabulate(20000)(x => x)
      "return always the last element" in {
        assert(myLastOption(smallList) === Some(4))
        assert(myLastOption(mediumList) === Some(99))
        assert(myLastOption(bigList) === Some(19999))
      }
    }
    "called on lists that include lists" should {
      val table = List.tabulate(3,4)((x,y) => s"$x - $y")
      "return also the last element" in {
        assert(myLastOption(table) === Some(List.tabulate(4)(x => s"2 - $x")))
      }
    }
  }

}
