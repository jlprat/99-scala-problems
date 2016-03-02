package com.github.jlprat.ninetynine.p08

/**
  * Created by @jlprat on 02/03/2016.
  * P08: Eliminate consecutive duplicates of list elements
  * Difficulty: **
  */
object P08 {

  /**
    * Removes consecutive duplicated elements in a list but one
    * @param list the list to remove consecutive duplicated elements
    * @tparam A the type of the list
    * @return the list without consecutive duplicated elements
    */
  def compressConsecutiveDuplicates[A](list: List[A]): List[A] = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    *
    * @param list the type we want to extend
    */
  implicit class ListOps[A](list: List[A]) {

    /**
      * Removes consecutive duplicated elements in a list but one
      * @return the list without consecutive duplicated elements
      */
    def compressConsecutiveDuplicates: List[A] = ???
  }
}
