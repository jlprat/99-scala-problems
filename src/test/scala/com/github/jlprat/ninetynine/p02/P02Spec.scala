package com.github.jlprat.ninetynine.p02

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p02.P02._

/**
  * Created by josep on 29/02/2016.
  *
  * This class tests the problem P02: Find the penultimate element of a list.
  */
class P02Spec extends WordSpec{

  "penultimate" when {
    "called on empty lists" should {
      val empty = List()
      "fail with an exception" in {
        intercept[NoSuchElementException](
          penultimate(empty)
        )
      }
    }
    "called on lists with one element" should {
      val singleInt = List(1)
      val singleString = List("foo")
      "fail with an exception" in {
        intercept[NoSuchElementException](
          penultimate(singleInt)
        )
        intercept[NoSuchElementException](
          penultimate(singleString)
        )
      }
    }
    "called on lists with 2 elements or more" should {
      val smallList = List.tabulate(5)(x => x)
      val mediumList = List.tabulate(100)(x => x)
      val bigList = List.tabulate(20000)(x => x)
      "return always the penultimate element" in {
        assert(penultimate(smallList) === 3)
        assert(penultimate(mediumList) === 98)
        assert(penultimate(bigList) === 19998)
      }
    }
    "called on lists that include lists" should {
      val table = List.tabulate(3,4)((x,y) => s"$x - $y")
      "return also the penultimate element" in {
        assert(penultimate(table) === List.tabulate(4)(x => s"1 - $x"))
      }
    }
  }


  "penultimateOption" when {
    "called on empty lists" should {
      val empty = List()
      "return None" in {
        assert(penultimateOption(empty) === None)
      }
    }
    "called on lists with one element" should {
      val singleInt = List(1)
      val singleString = List("foo")
      "return None" in {
          assert(penultimateOption(singleInt).isEmpty)
          assert(penultimateOption(singleString).isEmpty)
      }
    }
    "called on lists with multiple elements" should {
      val smallList = List.tabulate(5)(x => x)
      val mediumList = List.tabulate(100)(x => x)
      val bigList = List.tabulate(20000)(x => x)
      "return always the penultimate element" in {
        assert(penultimateOption(smallList) === Some(3))
        assert(penultimateOption(mediumList) === Some(98))
        assert(penultimateOption(bigList) === Some(19998))
      }
    }
    "called on lists that include lists" should {
      val table = List.tabulate(3,4)((x,y) => s"$x - $y")
      "return also the penultimate element" in {
        assert(penultimateOption(table) === Some(List.tabulate(4)(x => s"1 - $x")))
      }
    }
  }

  "The new available method 'penultimate'" when {
    "called on empty lists" should {
      val empty = List()
      "return None" in {
        assert(empty.penultimate.isEmpty)
      }
    }
    "called on lists with one element" should {
      val singleInt = List(1)
      val singleString = List("foo")
      "return None" in {
          assert(singleInt.penultimate.isEmpty)
          assert(singleString.penultimate.isEmpty)
      }
    }
    "called on lists with multiple elements" should {
      val smallList = List.tabulate(5)(x => x)
      val mediumList = List.tabulate(100)(x => x)
      val bigList = List.tabulate(20000)(x => x)
      "return always the penultimate element" in {
        assert(smallList.penultimate === Some(3))
        assert(mediumList.penultimate === Some(98))
        assert(bigList.penultimate === Some(19998))
      }
    }
    "called on lists that include lists" should {
      val table = List.tabulate(3,4)((x,y) => s"$x - $y")
      "return also the penultimate element" in {
        assert(table.penultimate === Some(List.tabulate(4)(x => s"1 - $x")))
      }
    }
  }

}
