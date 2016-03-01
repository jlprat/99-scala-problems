package com.github.jlprat.ninetynine.p03

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p03.P03._

/**
  * Created by @jlprat on 29/02/2016.
  *
  * This class tests the problem P03: Find the kth element of a list.
  */
class P03Spec extends WordSpec {

  "kth" when {
    "called on empty lists" should {
      val empty = List()
      "fail with an exception" in {
        intercept[NoSuchElementException](
          kth(empty, 1)
        )
        intercept[NoSuchElementException](
          kth(empty, 2)
        )
        intercept[NoSuchElementException](
          kth(empty, 0)
        )
      }
    }
    "called on non empty lists" should {
      val nonEmpty = List(1, 2, 3)
      "fail" when {
        "the kth position is greater than the length of the list" in {
          intercept[NoSuchElementException](
            kth(nonEmpty, 3)
          )
          intercept[NoSuchElementException](
            kth(nonEmpty, 4)
          )
          intercept[NoSuchElementException](
            kth(nonEmpty, 12000)
          )
        }
        "the position is negative" in {
          intercept[NoSuchElementException](
            kth(nonEmpty, -1)
          )
        }
      }
      "succeed and return the kth element when the list is big enough" in {
        assert(kth(nonEmpty, 0) === 1)
        assert(kth(nonEmpty, 1) === 2)
        assert(kth(nonEmpty, 2) === 3)
        val stringList = List("foo", "bar", "foz", "baz")
        assert(kth(stringList, 0) === "foo")
        assert(kth(stringList, 1) === "bar")
        assert(kth(stringList, 2) === "foz")
        assert(kth(stringList, 3) === "baz")
      }
    }
    "called on long lists" should {
      val longList = List.tabulate(10000)(x => x)
      "succeed as well" in {
        assert(kth(longList, 0) === 0)
        assert(kth(longList, 42) === 42)
        assert(kth(longList, 1142) === 1142)
        assert(kth(longList, 9999) === 9999)
      }
    }
  }

  "kthOption" when {
    "called on empty lists" should {
      val empty = List()
      "return None" in {
        assert(kthOption(empty, 1).isEmpty)
        assert(kthOption(empty, 2).isEmpty)
        assert(kthOption(empty, 0).isEmpty)
      }
    }
    "called on non empty lists" should {
      val nonEmpty = List(1, 2, 3)
      "return None" when {
        "the kth position is greater than the length of the list" in {
          assert(kthOption(nonEmpty, 3).isEmpty)
          assert(kthOption(nonEmpty, 4).isEmpty)
          assert(kthOption(nonEmpty, 12000).isEmpty)
        }
        "the position is negative" in {
          assert(kthOption(nonEmpty, -1).isEmpty)
        }
      }
      "succeed and return the kth element when the list is big enough" in {
        assert(kthOption(nonEmpty, 0) === Some(1))
        assert(kthOption(nonEmpty, 1) === Some(2))
        assert(kthOption(nonEmpty, 2) === Some(3))
        val stringList = List("foo", "bar", "foz", "baz")
        assert(kthOption(stringList, 0) === Some("foo"))
        assert(kthOption(stringList, 1) === Some("bar"))
        assert(kthOption(stringList, 2) === Some("foz"))
        assert(kthOption(stringList, 3) === Some("baz"))
      }
    }
    "called on long lists" should {
      val longList = List.tabulate(10000)(x => x)
      "succeed as well" in {
        assert(kthOption(longList, 0) === Some(0))
        assert(kthOption(longList, 42) === Some(42))
        assert(kthOption(longList, 1142) === Some(1142))
        assert(kthOption(longList, 9999) === Some(9999))
      }
    }
  }

  "kth custom function" when {
    "called on empty lists" should {
      val empty = List()
      "return None" in {
        assert(empty.kth(1).isEmpty)
        assert(empty.kth(2).isEmpty)
        assert(empty.kth(0).isEmpty)
      }
    }
    "called on non empty lists" should {
      val nonEmpty = List(1, 2, 3)
      "return None" when {
        "the kth position is greater than the length of the list" in {
          assert(nonEmpty.kth(3).isEmpty)
          assert(nonEmpty.kth(4).isEmpty)
          assert(nonEmpty.kth(12000).isEmpty)
        }
        "the position is negative" in {
          assert(nonEmpty.kth(-1).isEmpty)
        }
      }
      "succeed and return the kth element when the list is big enough" in {
        assert(nonEmpty.kth(0) === Some(1))
        assert(nonEmpty.kth(1) === Some(2))
        assert(nonEmpty.kth(2) === Some(3))
        val stringList = List("foo", "bar", "foz", "baz")
        assert(stringList.kth(0) === Some("foo"))
        assert(stringList.kth(1) === Some("bar"))
        assert(stringList.kth(2) === Some("foz"))
        assert(stringList.kth(3) === Some("baz"))
      }
    }
    "called on long lists" should {
      val longList = List.tabulate(10000)(x => x)
      "succeed as well" in {
        assert(longList.kth(0) === Some(0))
        assert(longList.kth(42) === Some(42))
        assert(longList.kth(1142) === Some(1142))
        assert(longList.kth(9999) === Some(9999))
      }
    }
  }

}
