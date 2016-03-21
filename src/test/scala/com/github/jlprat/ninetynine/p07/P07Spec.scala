package com.github.jlprat.ninetynine.p07

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p07.P07._

/**
  * Created by @jlprat on 02/03/2016.
  * Specs for problem P07: Flatten a nested list structure
  */
class P07Spec extends WordSpec {
  "flatten" when {
    val intList = List(1, 2, 3)
    "called on empty lists" should {
      "return back the empty list" in {
        val empty = List[List[String]]()
        assert(flatten(empty) === empty)
      }
    }
    "called on an already flattened list" should {
      "return the same list" in {
        //candidate to generator test
        assert(flatten(intList) === intList)
      }
    }
    "called on list with only one inner list" should {
      "return the 'inner' list" in {
        //candidate to generator test
        val outer = List(intList)
        assert(flatten(outer) === intList)
      }
    }
    "called on a 3 level nested list" should {
      "return the concatenation of the 'inner' lists" in {
        val second = List(intList, intList, intList, intList)
        val outer = List(second, second)
        assert(flatten(outer) === List.tabulate(24)(x => (x % 3) + 1))
      }
    }
    "called on a list with single elements and lists" should {
      "return a list with all elements without a list structure" in {
        val stringList = List("foo", "bar")
        val outer = List(stringList, 4L, intList)
        assert(flatten(outer) === List("foo", "bar",4L, 1, 2, 3))
      }
    }
    "called on a list where each element is a list with only 1 element" should {
      "return a list containing only the inner elements" in {
        val list = List(List(1), List(2), List(3))
        assert(flatten(list) === intList)
      }
    }
  }

  "newly added function myFlatten added on lists" when {
    val intList = List(1, 2, 3)
    "called on empty lists" should {
      "return back the empty list" in {
        val empty = List[List[String]]()
        assert(empty.myFlatten === empty)
      }
    }
    "called on an already flattened list" should {
      "return the same list" in {
        assert(intList.myFlatten === intList)
      }
    }
    "called on list with only one inner list" should {
      "return the 'inner' list" in {
        val outer = List(intList)
        assert(outer.myFlatten === intList)
      }
    }
    "called on a 3 level nested list" should {
      "return the concatenation of the 'inner' lists" in {
        val second = List(intList, intList, intList, intList)
        val outer = List(second, second)
        assert(outer.myFlatten === List.tabulate(24)(x => (x % 3) + 1))
      }
    }
    "called on a list with single elements and lists" should {
      "return a list with all elements without a list structure" in {
        val stringList = List("foo", "bar")
        val outer = List(stringList, 4L, intList)
        assert(outer.myFlatten === List("foo", "bar",4L, 1, 2, 3))
      }
    }
    "called on a list where each element is a list with only 1 element" should {
      "return a list containing only the inner elements" in {
        val list = List(List(1), List(2), List(3))
        assert(list.myFlatten === intList)
      }
    }
  }
}
