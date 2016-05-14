package com.github.jlprat.ninetynine.p20

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p20.P20._

/**
  * Created by @jlprat on 14/05/2016.
  * Specs for P20: Remove the Kth element from a list
  */
class P20Spec extends WordSpec {
  "remove" when {
    "called with empty lists" should {
      "return a None object" in {
        val empty = List[String]()
        assert(remove(empty, 0) === None)
        assert(remove(empty, 3) === None)
        assert(remove(empty, 20) === None)
        assert(remove(empty, 1000) === None)
      }
    }
    "called with non empty lists" when {
      val nonEmpty = List(1, 2, 3)
      val hugeList = List.tabulate(500)(x => x.toString)
      "called with a position lower than the size of the list" should {
        val posOne = 1
        val pos20 = 20
        val hugePosition = 450
        val firstResult = remove(nonEmpty, posOne)
        val secondResult = remove(hugeList, pos20)
        val thirdResult = remove(hugeList, hugePosition)
        "return a non empty Option with a tuple" which  {
          assert(firstResult.isDefined)
          assert(secondResult.isDefined)
          assert(thirdResult.isDefined)
          "first position is the removed element" in {
            firstResult.foreach( x => assert(x._1 === nonEmpty(posOne)))
            println(secondResult)
            println(hugeList(pos20))
            secondResult.foreach( x => assert(x._1 === hugeList(pos20)))
            thirdResult.foreach( x => assert(x._1 === hugeList(hugePosition)))
          }
          "second position is a list" which {
            "is one element shorter than the original" in {
              firstResult.foreach( x => assert(x._2.size === nonEmpty.size - 1))
              secondResult.foreach( x => assert(x._2.size === hugeList.size - 1))
              thirdResult.foreach( x => assert(x._2.size === hugeList.size - 1))
            }
            "doesn't contain the element in specified position" in {
              firstResult.foreach( x => assert(x._2(posOne) === nonEmpty(posOne + 1)))
              secondResult.foreach( x => assert(x._2(pos20) === hugeList(pos20 + 1)))
              thirdResult.foreach( x => assert(x._2(hugePosition) === hugeList(hugePosition + 1)))
              firstResult.foreach( x => assert(x._2 === nonEmpty.take(posOne) ::: nonEmpty.drop(posOne + 1)))
              secondResult.foreach( x => assert(x._2 === hugeList.take(pos20) ::: hugeList.drop(pos20 + 1)))
              thirdResult.foreach( x => assert(x._2 === hugeList.take(hugePosition) ::: hugeList.drop(hugePosition + 1)))
            }
          }
        }
      }
      "return a None object" when {
        "called with a position that is not in the list" in {
          val firstResult = remove(nonEmpty, nonEmpty.size + 2)
          assert(firstResult === None)
          val secondResult = remove(hugeList, hugeList.size + 2)
          assert(secondResult === None)
        }
      }
    }
  }
}
