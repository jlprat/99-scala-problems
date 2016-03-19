package com.github.jlprat.ninetynine.p11

import com.github.jlprat.ninetynine.p11.P11._
import org.scalatest.WordSpec

/**
  * Created by @jlprat on 19/03/2016.
  * Specs for P11 Modified run-length encoding. Only elements with duplicates are transferred as (N, E) terms
  */
class P11Spec extends WordSpec{

  "encodeModified" when {
    "called on empty lists" should {
      "return an empty list back" in {
        assert(encodeModified(List[Int]()) === List[Either[Int, (Int, Int)]]())
      }
    }
    "called on a list with no consecutive duplicates" should {
      val list = List(1, 2, 3)
      "return the same list back" in {
        assert(encodeModified(list) === List(Left(1), Left(2), Left(3)))
      }

    }
    "called on a list only 1 element repeated" should {
      "wrap the original list in a list" in {
        val list = List(1, 1, 1, 1, 1)
        assert(encodeModified(list) === List(Right((5, 1))))
      }
    }
    "called on a list with some consecutive repeated elements" should {
      "wrap the consecutive repeated in lists" in {
        val list = List(1, 1, 1, 2, 2, 3, 4, 4, 1, 1, 3)
        assert(encodeModified(list) === List(Right((3, 1)), Right((2, 2)), Left(3), Right((2, 4)), Right((2, 1)), Left(3)))
        val listText = List("a", "ab", "ab", "cd", "cd", "cd")
        assert(encodeModified(listText) === List(Left("a"), Right((2, "ab")), Right((3, "cd"))))
      }
    }
  }

  "newly added encodeModified method available in lists" when {
    "called on empty lists" should {
      "return an empty list back" in {
        assert(List[Int]().encodeModified === List[Either[Int, (Int, Int)]]())
      }
    }
    "called on a list with no consecutive duplicates" should {
      val list = List(1, 2, 3)
      "return the same list back" in {
        assert(list.encodeModified === List(Left(1), Left(2), Left(3)))
      }

    }
    "called on a list only 1 element repeated" should {
      "wrap the original list in a list" in {
        val list = List(1, 1, 1, 1, 1)
        assert(list.encodeModified === List(Right((5, 1))))
      }
    }
    "called on a list with some consecutive repeated elements" should {
      "wrap the consecutive repeated in lists" in {
        val list = List(1, 1, 1, 2, 2, 3, 4, 4, 1, 1, 3)
        assert(list.encodeModified === List(Right((3, 1)), Right((2, 2)), Left(3), Right((2, 4)), Right((2, 1)), Left(3)))
        val listText = List("a", "ab", "ab", "cd", "cd", "cd")
        assert(listText.encodeModified === List(Left("a"), Right((2, "ab")), Right((3, "cd"))))
      }
    }
  }

}
