package com.github.jlprat.ninetynine.p14

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p14.P14._

/**
  * Created by @jlprat on 21/03/2016.
  * Specs for problem P14: Duplicate the elements of a list.
  */
class P14Spec extends WordSpec {

  "duplicate" when {
    "called on empty lists" should {
      "return an empty list back" in {
        assert(duplicate(List()) === List())
      }
    }
    "called on single element lists" should {
      "return a list with the same element twice. Which is the same as concatenate a list with itself" in {
        //candidate to generator test
        val intList = List(1)
        val stringList = List("a")
        val charList = List('y')
        assert(duplicate(intList) === intList ::: intList)
        assert(duplicate(stringList) === stringList ::: stringList)
        assert(duplicate(charList) === charList ::: charList)
      }
    }
    "called on non empty lists" should {
      val l = List(1, 2, 3, 2)
      val duplicatedL = duplicate(l)
      "return a list" which {
        //candidate to generator test
        "size is double the original" in {
          assert(duplicatedL.size === (l.size * 2))
        }
        "contains each element twice" in {
          l.zipWithIndex.foreach{ e => {
            assert(e._1 === duplicatedL(e._2 * 2 + 1))
          }}
        }
      }
      "return a list with duplicated elements" in {
        assert(duplicatedL === List(1, 1, 2, 2, 3, 3, 2, 2))
      }
    }
  }

  "Newly added duplicate method in lists" when {
    "called on empty lists" should {
      "return an empty list back" in {
        assert(List[Int]().duplicate === List[Int]())
      }
    }
    "called on single element lists" should {
      "return a list with the same element twice. Which is the same as concatenate a list with itself" in {
        //candidate to generator test
        val intList = List(1)
        val stringList = List("a")
        val charList = List('y')
        assert(intList.duplicate === intList ::: intList)
        assert(stringList.duplicate === stringList ::: stringList)
        assert(charList.duplicate === charList ::: charList)
      }
    }
    "called on non empty lists" should {
      val l = List(1, 2, 3, 2)
      val duplicatedL = l.duplicate
      "return a list" which {
        //candidate to generator test
        "size is double the original" in {
          assert(duplicatedL.size === (l.size * 2))
        }
        "contains each element twice" in {
          l.zipWithIndex.foreach{ e => {
            assert(e._1 === duplicatedL(e._2 * 2 + 1))
          }}
        }
      }
      "return a list with duplicated elements" in {
        assert(duplicatedL === List(1, 1, 2, 2, 3, 3, 2, 2))
      }
    }
  }
}
