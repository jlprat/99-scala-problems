package com.github.jlprat.ninetynine.p17

import org.scalatest.WordSpec

import com.github.jlprat.ninetynine.p17.P17._

/**
  * Specs for P17: Split a list into two parts. Do not use splitAt built in function in lists
  * Created by @jlprat on 05/05/2016.
  */
class P17Spec extends WordSpec {

  "split" when {
    "called with empty Lists" should {
      "return a tuple with 2 empty lists independently of the position to split at" in {
        val empty = List[Int]()
        //candidate to generator test
        assert(split(empty, 0) === (empty, empty))
        assert(split(empty, 1) === (empty, empty))
        assert(split(empty, 3) === (empty, empty))
      }
    }
    "called with multiple element lists" when {
      //candidate to generator test
      val single = List(1)
      val multiple = List.tabulate(30)(x => x)
      val empty = List[Int]()
      "position is 0" should {
        "return a tuple of an empty list and itself" in {
          assert(split(single, 0) === (empty, single))
          assert(split(multiple, 0) === (empty, multiple))
        }
      }
      "position is greater or equal to the length of the list" should {
        "return a tuple of itself and an empty list" in {
          assert(split(single, single.length) === (single, empty))
          assert(split(single, single.length + 10) === (single, empty))
          assert(split(multiple, multiple.length) === (multiple, empty))
          assert(split(multiple, multiple.length + 10) === (multiple, empty))
        }
      }
      "position is between 0 and the length of the list" should {
        "return a tuple with 2 lists" which {
          val splitAt3= split(multiple, 3)
          val splitAt20 = split(multiple, 20)
          "equal to the original list after concatenating them" in {
            assert(multiple === splitAt3._1 ::: splitAt3._2)
            assert(multiple === splitAt20._1 ::: splitAt20._2)
          }
          "the first resulting list should be exactly the size of the split position" in {
            assert(splitAt3._1.size === 3)
            assert(splitAt20._1.size === 20)
          }
          "the second resulting list should be exactly the size of the length minus the split position" in {
            assert(splitAt3._2.size === multiple.size - 3)
            assert(splitAt20._2.size === multiple.size - 20)
          }
        }
      }
    }
  }
}
