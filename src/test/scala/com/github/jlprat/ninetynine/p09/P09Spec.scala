package com.github.jlprat.ninetynine.p09

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p09.S09._

/**
  * Created by @jlprat on 02/03/2016.
  * Specs for P09: Pack consecutive duplicates of list elements into sublists
  */
class P09Spec extends WordSpec {

  "pack" when {
    "called on empty lists" should {
      "return a list with an empty list" in {
        assert(pack(List[Int]()) === List(List[Int]()))
      }
    }
    "called on any list" should {
      "be the same list after flattening" in {
        val list1 = List(1, 2, 3)
        assert(pack(list1).flatten === list1)
        val list2 = List(1, 1, 1)
        assert(pack(list2).flatten === list2)
        val list3 = List(1, 1, 1, 2, 2, 4)
        assert(pack(list3).flatten === list3)
        val list4 = List(1, 1, 1, 3, 3, 1, 1, 4, 3, 4)
        assert(pack(list4).flatten === list4)
      }
    }
    "called on a list with no consecutive duplicates" should {
      val list = List(1, 2, 3)
      "return a list with each element packed in another list" in {
        assert(pack(list) === List(List(1), List(2), List(3)))
      }

    }
    "called on a list only 1 element repeated" should {
      "wrap the original list in a list" in {
        val list = List(1, 1, 1, 1, 1)
        assert(pack(list) === List(list))
      }
    }
    "called on a list with some consecutive repeated elements" should {
      "wrap the consecutive repeated in lists" in {
        val list = List(1, 1, 1, 2, 2, 3, 4, 4, 1, 1, 3)
        assert(pack(list) === List(List(1, 1, 1), List(2, 2), List(3), List(4, 4), List(1, 1), List(3)))
      }
    }
  }

  "newly added pack function on lists" when {
    "called on empty lists" should {
      "return a list with an empty list" in {
        assert(List[Int]().pack === List(List[Int]()))
      }
    }
    "called on any list" should {
      "be the same list after flattening" in {
        val list1 = List(1, 2, 3)
        assert(list1.pack.flatten === list1)
        val list2 = List(1, 1, 1)
        assert(list2.pack.flatten === list2)
        val list3 = List(1, 1, 1, 2, 2, 4)
        assert(list3.pack.flatten === list3)
        val list4 = List(1, 1, 1, 3, 3, 1, 1, 4, 3, 4)
        assert(list4.pack.flatten === list4)
      }
    }
    "called on a list with no consecutive duplicates" should {
      val list = List(1, 2, 3)
      "return a list with each element packed in another list" in {
        assert(list.pack === List(List(1), List(2), List(3)))
      }

    }
    "called on a list only 1 element repeated" should {
      "wrap the original list in a list" in {
        val list = List(1, 1, 1, 1, 1)
        assert(list.pack === List(list))
      }
    }
    "called on a list with some consecutive repeated elements" should {
      "wrap the consecutive repeated in lists" in {
        val list = List(1, 1, 1, 2, 2, 3, 4, 4, 1, 1, 3)
        assert(list.pack === List(List(1, 1, 1), List(2, 2), List(3), List(4, 4), List(1, 1), List(3)))
      }
    }
  }
}
