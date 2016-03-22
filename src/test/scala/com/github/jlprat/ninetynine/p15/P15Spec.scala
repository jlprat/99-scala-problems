package com.github.jlprat.ninetynine.p15

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p15.P15._

/**
  * Created by @jlprat on 21/03/2016.
  * Specs for problem P14: Duplicate the elements of a list.
  */
class P15Spec extends WordSpec {

  "duplicateN" when {
    "called on empty lists" should {
      "return an empty list back, independently of times value" in {
        assert(duplicateN(List(), 2) === List())
        assert(duplicateN(List(), 1) === List())
        assert(duplicateN(List(), 45) === List())
      }
    }
    "called on single element lists" when {
      "times is 2" should {
        "return a list with the same element twice. Which is the same as concatenate a list with itself" in {
          //candidate to generator test
          val intList = List(1)
          val stringList = List("a")
          val charList = List('y')
          assert(duplicateN(intList, 2) === intList ::: intList)
          assert(duplicateN(stringList, 2) === stringList ::: stringList)
          assert(duplicateN(charList, 2) === charList ::: charList)
        }
      }
      "times is bigger than 2" should {
        "return a list with the same element n times" in {
          //candidate to generator test
          val list = List(1)
          assert(duplicateN(list, 80) === List.tabulate(80)(_ => 1))
        }
      }
    }
    "called on non empty lists" when {
      val list = List(1, 2, 3)
      val longList = List.tabulate(100)(x => x)
      "times is 0" should {
        //candidate to generator test
        "return return an empty list" in {
          assert(duplicateN(list, 0) === List[Int]())
          assert(duplicateN(longList, 0) === List[Int]())
        }
      }
      "times is 1" should {
        //candidate to generator test
        "return the same list back" in {
          assert(duplicateN(list, 1) === list)
          assert(duplicateN(longList, 1) === longList)
        }
      }
      "times is bigger than 2" should {
        val times = 3
        val list = List(1, 2, 3, 2)
        val duplicatedL = duplicateN(list, 3)
        "return a list" which {
          //candidate to generator test
          "size is double the original" in {
            assert(duplicatedL.size === (list.size * times))
          }
          "contains each element twice" in {
            list.zipWithIndex.foreach{ e => {
              assert(e._1 === duplicatedL(e._2 * times + 1))
            }}
          }
        }
        "return a list with duplicated elements" in {
          assert(duplicatedL === List(1, 1, 1, 2, 2, 2, 3, 3, 3, 2, 2, 2))
        }
      }
    }
  }

  "Newly added duplicateN method in lists" when {
    "called on empty lists" should {
      "return an empty list back, independently of times value" in {
        assert(List().duplicateN(2) === List())
        assert(List().duplicateN(1) === List())
        assert(List().duplicateN(45) === List())
      }
    }
    "called on single element lists" when {
      "times is 2" should {
        "return a list with the same element twice. Which is the same as concatenate a list with itself" in {
          //candidate to generator test
          val intList = List(1)
          val stringList = List("a")
          val charList = List('y')
          assert(intList.duplicateN(2) === intList ::: intList)
          assert(stringList.duplicateN(2) === stringList ::: stringList)
          assert(charList.duplicateN(2) === charList ::: charList)
        }
      }
      "times is bigger than 2" should {
        "return a list with the same element n times" in {
          //candidate to generator test
          val list = List(1)
          assert(list.duplicateN(80) === List.tabulate(80)(_ => 1))
        }
      }
    }
    "called on non empty lists" when {
      val list = List(1, 2, 3)
      val longList = List.tabulate(100)(x => x)
      "times is 0" should {
        //candidate to generator test
        "return return an empty list" in {
          assert(list.duplicateN(0) === List[Int]())
          assert(longList.duplicateN(0) === List[Int]())
        }
      }
      "times is 1" should {
        //candidate to generator test
        "return the same list back" in {
          assert(list.duplicateN(1) === list)
          assert(longList.duplicateN(1) === longList)
        }
      }
      "times is bigger than 2" should {
        val times = 3
        val list = List(1, 2, 3, 2)
        val duplicatedL = list.duplicateN(3)
        "return a list" which {
          //candidate to generator test
          "size is double the original" in {
            assert(duplicatedL.size === (list.size * times))
          }
          "contains each element twice" in {
            list.zipWithIndex.foreach { e => {
              assert(e._1 === duplicatedL(e._2 * times + 1))
            }}
          }
        }
        "return a list with duplicated elements" in {
          assert(duplicatedL === List(1, 1, 1, 2, 2, 2, 3, 3, 3, 2, 2, 2))
        }
      }
    }
  }
}
