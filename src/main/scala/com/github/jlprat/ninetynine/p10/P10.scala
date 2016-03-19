package com.github.jlprat.ninetynine.p10

/**
  * Created by @jlprat on 02/03/2016.
  * P10: Run-length encoding of a list (Consecutive duplicates of elements are encoded as tuples (N, E) where
  * N is the number of duplicates of the element E). Use pack method specified in P09
  * Difficulty: *
  */
object P10 {

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
