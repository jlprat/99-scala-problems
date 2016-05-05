package com.github.jlprat.ninetynine.p18

import org.scalatest.WordSpec
import com.github.jlprat.ninetynine.p18.S18._


/**
  * Specs for P18: Extract a slice from a list
  * Created by @jlprat on 05/05/2016.
  */
class P18Spec extends WordSpec {

  "slice" when {
    val empty = List[Int]()
    "called on an empty list" should {
      "return an empty list no matter which indices are used" in {
        assert(slice(empty, 0, 1) === empty)
        assert(slice(empty, 3, 7) === empty)
        assert(slice(empty, 2, 8) === empty)
      }
    }
    "called on non empty lists" should {
      val nonEmpty = List.tabulate(30)(x => x)
      //candidate to generator test
      "return an empty list" when {
        "both indices are the same" in {
          assert(slice(nonEmpty, 0, 0) === empty)
          assert(slice(nonEmpty, 20, 20) === empty)
          assert(slice(nonEmpty, 10, 10) === empty)
          assert(slice(nonEmpty, 5, 5) === empty)
        }
        "start index is bigger than end index" in {
          assert(slice(nonEmpty, 10, 0) === empty)
          assert(slice(nonEmpty, 21, 20) === empty)
          assert(slice(nonEmpty, 13, 10) === empty)
          assert(slice(nonEmpty, 32, 5) === empty)
        }
        "start index is bigger than length of list" in {
          assert(slice(nonEmpty, 100, 130) === empty)
        }
      }
      "return the same list" when {
        "first index is 0 and last index is the size of the list" in {
          assert(slice(nonEmpty, 0, nonEmpty.size) === nonEmpty)
        }
      }
      "return a sub list" when {
        "indexes are withing 0 and the size of the list" which {
          val sub = slice(nonEmpty, 2, 5)
          assert(nonEmpty.containsSlice(sub))
          "size is the difference between both indexes" in {
            assert(slice(nonEmpty, 0, 5).size === 5 - 0)
            assert(slice(nonEmpty, 3, 5).size === 5 - 3)
            assert(slice(nonEmpty, 10, 25).size === 25 - 10)
            assert(slice(nonEmpty, 5, 7).size === 7 - 5)
          }
          "each element is in the position specified by the slice indexes" in {
            assert(sub(0) === nonEmpty(2))
            assert(sub(1) === nonEmpty(3))
            assert(sub(2) === nonEmpty(4))
          }
        }
      }
    }
  }

}
