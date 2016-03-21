package com.github.jlprat.ninetynine.p13

/**
  * Created by @jlprat on 21/03/2016.
  * P13: Run-length encoding of a list (direct solution). Don't use P09's pack method. Calculate it directly
  * Difficulty: **
  */
object P13 {

  /**
    * Encodes the consecutive repeated elements in tuple fashion with number of repetitions and the element
    * @param list the list to encode
    * @tparam A the type of the list
    * @return the encoded list with Int,A tuples
    */
  def encode[A](list: List[A]): List[(Int,A)] = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    *
    * @param list the type we want to extend
    */
  implicit class ListOps[A](list: List[A]) {

    /**
      * Encodes the consecutive repeated elements in tuple fashion with number of repetitions and the element
      * @return the encoded list with Int,A tuples
      */
    def encode: List[(Int,A)] = ???
  }
}
