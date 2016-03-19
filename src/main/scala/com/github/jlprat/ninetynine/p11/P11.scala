package com.github.jlprat.ninetynine.p11

/**
  * Created by @jlprat on 19/03/2016.
  * P11 Modified run-length encoding. Only elements with duplicates are transferred as (N, E) terms
  * Difficulty: *
  */
object P11 {

  /**
    * Encodes the consecutive repeated elements in a tuple fashion as long as they appear more than once, otherwise they
    * as the element themselves
    *
    * @param list the list to encode
    * @tparam A the type of the list
    * @return the encoded list
    */
  def encodeModified[A](list: List[A]): List[Either[A, (Int, A)]] = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    *
    * @param list the type we want to extend
    */
  implicit class ListOps[A](list: List[A]) {

    /**
      * Encodes the consecutive repeated elements in a tuple fashion as long as they appear more than once, otherwise they
      * as the element themselves
      *
      * @return the encoded list
      */
    def encodeModified: List[Either[A, (Int, A)]] = ???

  }

}
