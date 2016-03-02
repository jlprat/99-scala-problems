package com.github.jlprat.ninetynine.p09

/**
  * Created by @jlprat on 02/03/2016.
  * P09: Pack consecutive duplicates of list elements into sublists
  * Difficulty: **
  */
object P09 {

  /**
    * Packs elements in the same list as long as they are consecutive
    * @param list the list to work on
    * @tparam A the type of the list
    * @return a list of lists of with all consecutive elements
    */
  def pack[A](list: List[A]): List[List[A]] = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    *
    * @param list the type we want to extend
    */
  implicit class ListOps[A](list: List[A]) {

    /**
      * Packs elements in the same list as long as they are consecutive
      * @return a list of lists of with all consecutive elements
      */
    def pack: List[List[A]] = ???
  }
}
