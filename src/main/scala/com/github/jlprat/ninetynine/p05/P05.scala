package com.github.jlprat.ninetynine.p05

/**
  * Created by @jlprat on 01/03/2016.
  * P05: Reverse a list
  * Difficulty: *
  */
object P05 {

  /**
    * Returns a list with the elements in the exact reversed order as the original
    * @param list the list to reverse
    * @tparam A the type of the list
    * @return the reversed list
    */
  def reverse[A](list: List[A]): List[A] = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    *
    * @param list the type we want to extend
    * @tparam A the type of the list, here no restriction
    */
  implicit class ListOps[A](list: List[A]) {

    /**
      * Reverses a list
      *
      * @return the reversed list
      */
    def myReverse: List[A] = ???
  }
}
