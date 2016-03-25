package com.github.jlprat.ninetynine.p16

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p16.P16._

/**
  * Created by @jlprat on 25/03/2016.
  * Specs for problem P16: Drop every Nth element from a list. Note that is different from already built in drop function.
  */
class P16Spec extends WordSpec {

  "drop" when {
    "called on empty lists" should {
      "return an empty list, independently of times value" in {
        val list = List[Int]()
        assert(drop(list, 1) === list)
        assert(drop(list, 2) === list)
        assert(drop(list, 0) === list)
        assert(drop(list, 1000) === list)
      }
    }
    "called on non empty lists" when {
      val tinyList = List(1, 2, 3)
      val mediumList = List.tabulate(20)(x => x + 1)
      val bigList = List.tabulate(1000)(x => x + 1)
      "n is 0" should {
        "return the same list back" in {
          assert(drop(tinyList, 0) === tinyList)
          assert(drop(mediumList, 0) === mediumList)
          assert(drop(bigList, 0) === bigList)
        }
      }
      "n is 1" should {
        "return an empty list" in {
          assert(drop(tinyList, 1) === List[Int]())
          assert(drop(mediumList, 1) === List[Int]())
          assert(drop(bigList, 1) === List[Int]())
        }
      }
      "n is bigger than the size of the list" should {
        "return the same list back" in {
          assert(drop(tinyList, tinyList.size + 1) === tinyList)
          assert(drop(tinyList, tinyList.size + 100) === tinyList)
          assert(drop(mediumList, mediumList.size + 1) === mediumList)
          assert(drop(mediumList, mediumList.size + 100) === mediumList)
          assert(drop(bigList, bigList.size + 1) === bigList)
          assert(drop(bigList, bigList.size + 100) === bigList)
        }
      }
      "n is smaller than the size of the list" should {
        val tinyDropped2 = drop(tinyList, 2)
        val tinyDropped3 = drop(tinyList, 3)
        val mediumDropped5 = drop(mediumList, 5)
        val mediumDropped8 = drop(mediumList, 8)
        val bigDropped = drop(bigList, 80)
        val repeatedElementList = List.tabulate(80)(_ => "abc")
        val repeatedElemDropped = drop(repeatedElementList, 5)
        "return a smaller list" in {
          assert(tinyDropped2.size === 2)
          assert(tinyDropped3.size === 2)
          assert(mediumDropped5.size === mediumList.size - (mediumList.size / 5))
          assert(mediumDropped8.size === mediumList.size - (mediumList.size / 8))
          assert(bigDropped.size === bigList.size - (bigList.size / 80))
          assert(repeatedElemDropped.size === repeatedElementList.size - (repeatedElementList.size / 5))
        }
        "each nth element should be gone" in {
          assert(tinyDropped2(1) === tinyList(2))
          assert(tinyDropped2 === List(1, 3))
          assert(tinyDropped3 === List(1, 2))
          assert(mediumDropped5(4) === mediumList(5))
          assert(mediumDropped5(8) === mediumList(10))
          assert(mediumDropped5(12) === mediumList(15))
          assert(mediumDropped5 === mediumList.filterNot(elem => elem % 5 == 0))
          assert(mediumDropped8(7) === mediumList(8))
          assert(mediumDropped8(14) === mediumList(16))
          assert(mediumDropped8 === mediumList.filterNot(elem => elem % 8 == 0))
          assert(bigDropped === bigList.filterNot(elem => elem % 80 == 0))
          assert(repeatedElemDropped === List.tabulate(repeatedElementList.size - (repeatedElementList.size / 5))(_ => "abc"))
        }
      }
    }
  }


  "newly added function mydrop on lists" when {
    "called on empty lists" should {
      "return an empty list, independently of times value" in {
        val list = List[Int]()
        assert(list.myDrop(1) === list)
        assert(list.myDrop(2) === list)
        assert(list.myDrop(0) === list)
        assert(list.myDrop(1000) === list)
      }
    }
    "called on non empty lists" when {
      val tinyList = List(1, 2, 3)
      val mediumList = List.tabulate(20)(x => x + 1)
      val bigList = List.tabulate(1000)(x => x + 1)
      "n is 0" should {
        "return the same list back" in {
          assert(tinyList.myDrop(0) === tinyList)
          assert(mediumList.myDrop(0) === mediumList)
          assert(bigList.myDrop(0) === bigList)
        }
      }
      "n is 1" should {
        "return an empty list" in {
          assert(tinyList.myDrop(1) === List[Int]())
          assert(mediumList.myDrop(1) === List[Int]())
          assert(bigList.myDrop(1) === List[Int]())
        }
      }
      "n is bigger than the size of the list" should {
        "return the same list back" in {
          assert(tinyList.myDrop(tinyList.size + 1) === tinyList)
          assert(tinyList.myDrop(tinyList.size + 100) === tinyList)
          assert(mediumList.myDrop(mediumList.size + 1) === mediumList)
          assert(mediumList.myDrop(mediumList.size + 100) === mediumList)
          assert(bigList.myDrop(bigList.size + 1) === bigList)
          assert(bigList.myDrop(bigList.size + 100) === bigList)
        }
      }
      "n is smaller than the size of the list" should {
        val tinyDropped2 = tinyList.myDrop(2)
        val tinyDropped3 = tinyList.myDrop(3)
        val mediumDropped5 = mediumList.myDrop(5)
        val mediumDropped8 = mediumList.myDrop(8)
        val bigDropped = bigList.myDrop(80)
        val repeatedElementList = List.tabulate(80)(_ => "abc")
        val repeatedElemDropped = repeatedElementList.myDrop(5)
        "return a smaller list" in {
          assert(tinyDropped2.size === 2)
          assert(tinyDropped3.size === 2)
          assert(mediumDropped5.size === mediumList.size - (mediumList.size / 5))
          assert(mediumDropped8.size === mediumList.size - (mediumList.size / 8))
          assert(bigDropped.size === bigList.size - (bigList.size / 80))
          assert(repeatedElemDropped.size === repeatedElementList.size - (repeatedElementList.size / 5))
        }
        "each nth element should be gone" in {
          assert(tinyDropped2(1) === tinyList(2))
          assert(tinyDropped2 === List(1, 3))
          assert(tinyDropped3 === List(1, 2))
          assert(mediumDropped5(4) === mediumList(5))
          assert(mediumDropped5(8) === mediumList(10))
          assert(mediumDropped5(12) === mediumList(15))
          assert(mediumDropped5 === mediumList.filterNot(elem => elem % 5 == 0))
          assert(mediumDropped8(7) === mediumList(8))
          assert(mediumDropped8(14) === mediumList(16))
          assert(mediumDropped8 === mediumList.filterNot(elem => elem % 8 == 0))
          assert(bigDropped === bigList.filterNot(elem => elem % 80 == 0))
          assert(repeatedElemDropped === List.tabulate(repeatedElementList.size - (repeatedElementList.size / 5))(_ => "abc"))
        }
      }
    }
  }
}
