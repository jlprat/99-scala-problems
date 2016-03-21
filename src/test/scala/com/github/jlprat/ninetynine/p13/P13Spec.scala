package com.github.jlprat.ninetynine.p13

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p13.P13._

/**
  * Created by @jlprat on 21/03/2016.
  * Specs for problem P13: Run-length encoding of a list (direct solution)
  */
class P13Spec extends WordSpec {
  "encode" when {
    "called on empty lists" should {
      "return an empty list back" in {
        assert(encode(List[Int]()) === List[(Int, Int)]())
      }
    }
    "called on a list with no consecutive duplicates" should {
      val list = List(1, 2, 3)
      "return a list with each element in a tuple of 1 and the element" in {
        assert(encode(list) === List((1,1), (1, 2), (1, 3)))
      }

    }
    "called on a list only 1 element repeated" should {
      "wrap the original list in a list" in {
        val list = List(1, 1, 1, 1, 1)
        assert(encode(list) === List((5, 1)))
      }
    }
    "called on a list with some consecutive repeated elements" should {
      "wrap the consecutive repeated in lists" in {
        val list = List(1, 1, 1, 2, 2, 3, 4, 4, 1, 1, 3)
        assert(encode(list) === List((3, 1), (2, 2), (1, 3), (2, 4), (2, 1), (1, 3)))
        val listText = List("a", "ab", "ab", "cd", "cd", "cd")
        assert(encode(listText) === List((1, "a"), (2, "ab"), (3, "cd")))
      }
    }
  }

  "newly added encode function on lists" when {
    "called on empty lists" should {
      "return a list with an empty list" in {
        assert(List[Int]().encode === List[(Int, Int)]())
      }
    }
    "called on a list with no consecutive duplicates" should {
      val list = List(1, 2, 3)
      "return a list with each element encodeed in another list" in {
        assert(list.encode === List((1,1), (1, 2), (1, 3)))
      }

    }
    "called on a list only 1 element repeated" should {
      "wrap the original list in a list" in {
        val list = List(1, 1, 1, 1, 1)
        assert(list.encode === List((5, 1)))
      }
    }
    "called on a list with some consecutive repeated elements" should {
      "wrap the consecutive repeated in lists" in {
        val list = List(1, 1, 1, 2, 2, 3, 4, 4, 1, 1, 3)
        assert(list.encode === List((3, 1), (2, 2), (1, 3), (2, 4), (2, 1), (1, 3)))
        val listText = List("a", "ab", "ab", "cd", "cd", "cd")
        assert(listText.encode === List((1, "a"), (2, "ab"), (3, "cd")))
      }
    }
  }
}
