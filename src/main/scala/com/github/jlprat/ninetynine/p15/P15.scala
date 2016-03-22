package com.github.jlprat.ninetynine.p15

/**
  * Created by @jlprat on 22/03/2016.
  * P15: Duplicate the elements of a list a given number of times
  * Difficulty: **
  */
object P15 {

  /**
    * Duplicates {@code times} times each element in the list
    *
    * @param list  the list to duplicate each element from
    * @param times the times each element should be duplicated
    * @tparam A the type of the list
    * @return the list where each element is duplicated { @code times} times
    */
  def duplicateN[A](list: List[A], times: Int): List[A] = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    *
    * @param list the type we want to extend
    */
  implicit class ListOps[A](list: List[A]) {


    /**
      * Duplicates {@code times} times each element in the list
      *
      * @param times the times each element should be duplicated
      * @return the list where each element is duplicated { @code times} times
      */
    def duplicateN(times: Int): List[A] = ???

  }
}
