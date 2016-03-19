package com.github.jlprat.ninetynine.p12

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p12.P12._
import com.github.jlprat.ninetynine.p10.P10.encode

/**
  * Created by @jlprat on 19/03/2016.
  * Specs for problem P12: Decode a run-length encoded list.
  */
class P12Spec extends WordSpec {

  "decode" when {
    "called on empty lists" should {
      "return back an empty list" in {
        assert(decode(List[(Int, String)]()) === List[String]())
      }
    }
    "called on any encoded list" should {
      "return the original list" in {
        val list1 = List(1, 2, 3)
        val list2 = List(1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5)
        val list3 = List("a", "ab", "a", "ab")
        val list4 = List("a", "a", "ab")
        assert(decode(encode(list1)) === list1)
        assert(decode(encode(list2)) === list2)
        assert(decode(encode(list3)) === list3)
        assert(decode(encode(list4)) === list4)
      }
    }
    "called on a list where each tuple is of the form (1, x)" should {
      "return a list with each element in the encoded list appearing once" in {
        val list = List((1,"a"), (1, "b"), (1, "ab"), (1, "a"))
        assert(decode(list) === List("a", "b", "ab", "a"))
      }
    }
    "called on a list where each first element in the tuple is higher than 1" should {
      "return a list where each second element in the tuple appears as many times as stated in the first element in the tuple" in {
        val listEncoded = List((3,"a"), (2, "b"), (2, "ab"), (4, "a"))
        val listDecoded = List("a", "a", "a", "b", "b", "ab", "ab", "a", "a", "a", "a")
        assert(decode(listEncoded) === listDecoded)
      }
    }
  }

  "newly added decode method in lists" when {
    "called on empty lists" should {
      "return back an empty list" in {
        assert(List[(Int, String)]().decode === List[String]())
      }
    }
    "called on any encoded list" should {
      "return the original list" in {
        val list1 = List(1, 2, 3)
        val list2 = List(1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5)
        val list3 = List("a", "ab", "a", "ab")
        val list4 = List("a", "a", "ab")
        assert(encode(list1).decode === list1)
        assert(encode(list2).decode === list2)
        assert(encode(list3).decode === list3)
        assert(encode(list4).decode === list4)
      }
    }
    "called on a list where each tuple is of the form (1, x)" should {
      "return a list with each element in the encoded list appearing once" in {
        val list = List((1,"a"), (1, "b"), (1, "ab"), (1, "a"))
        assert(list.decode === List("a", "b", "ab", "a"))
      }
    }
    "called on a list where each first element in the tuple is higher than 1" should {
      "return a list where each second element in the tuple appears as many times as stated in the first element in the tuple" in {
        val listEncoded = List((3, "a"), (2, "b"), (2, "ab"), (4, "a"))
        val listDecoded = List("a", "a", "a", "b", "b", "ab", "ab", "a", "a", "a", "a")
        assert(listEncoded.decode === listDecoded)
      }
    }
  }

}
