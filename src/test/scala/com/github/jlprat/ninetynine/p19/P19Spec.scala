package com.github.jlprat.ninetynine.p19

import org.scalatest.WordSpec
import com.github.jlprat.ninetynine.p19.P19._

/**
  * Specs for P19: Rotate a list N places to the left
  * Created by @jlprat on 05/05/2016.
  */
class P19Spec extends WordSpec {

  "rotateLeft" when {
    "called with empty lists" should {
      "return back an empty list" in {
        val empty = List[Int]()
        assert(rotateLeft(empty, 1) === empty)
        assert(rotateLeft(empty, 3) === empty)
        assert(rotateLeft(empty, 40) === empty)
      }
    }
    //candidate to generator test
    val toLeft = 3
    val nonEmpty = List.tabulate(30)(x => x)
    val rotatedLeft3 = rotateLeft(nonEmpty, toLeft)
    "called with non empty lists" should {
      "return a list" which  {
        "is the same one" when {
          "positions to rotate is 0" in {
            assert(rotateLeft(nonEmpty, 0) === nonEmpty)
          }
        }
        "all elements are present in the original list" in {
          rotatedLeft3.foreach(elem => assert(nonEmpty.contains(elem)))
        }
        "has the same size as the original" in {
          assert(nonEmpty.size === rotatedLeft3.size)
        }
        "each element is N positions to the left" in {
          nonEmpty.indices.foreach(idx => assert(rotatedLeft3(idx) === nonEmpty((idx + toLeft) % nonEmpty.size)))
        }
        "is the same as the original" when {
          "the positions to rotate is the length of the list" in {
            val sameAgain = rotateLeft(nonEmpty, nonEmpty.size)
            assert(sameAgain === nonEmpty)
          }
        }
      }
      "rotate right" when {
        "called with a negative position" in {
          val rotatedRight = rotateLeft(nonEmpty, -1)
          nonEmpty.indices.foreach(idx => assert(nonEmpty(idx) === rotatedRight((idx + 1) % nonEmpty.size)))
        }
      }
    }
    "called with an index bigger than the size of the list" should {
      "behave as if called with the resultant value of applying the modulo with the size of the list" in {
        val rotatedLeftBigger = rotateLeft(nonEmpty, nonEmpty.size + toLeft)
        assert(rotatedLeftBigger === rotatedLeft3)
      }
    }
  }
}
