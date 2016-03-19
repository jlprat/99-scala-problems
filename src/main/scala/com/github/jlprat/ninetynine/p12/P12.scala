package com.github.jlprat.ninetynine.p12

/**
  * Created by @jlprat on 19/03/2016.
  * P12: Decode a run-length encoded list.
  * Difficulty: **
  */
object P12 {

  /**
    * Decodes a list which is the result of a run-length call
    * @param list the list that is encoded
    * @tparam A the type of the list
    * @return the decoded list
    */
  def decode[A](list: List[(Int, A)]): List[A] = ???


  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    *
    * @param list the type we want to extend
    */
  implicit class ListOps[A](list: List[A]) {

    /**
      * Decodes a list which is the result of a run-length call
      * @return the decoded list
      */
    def decode: List[A] = ???

  }

}
