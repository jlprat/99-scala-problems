package com.github.jlprat.ninetynine.p01

/**
  * Created by @jlprat on 28/2/2016.
  *
  * P01: Find the last element of a list.
  * Difficulty: *
  */
object P01 {

  /**
    * This function should return the last element of a list
    * @param list the list we want the last element of
    * @tparam A the type of the List
    * @return the last element of the list
    */
  final def myLast[A](list: List[A]): A = ???

  /**
    * This function should return the last element of a list, if there is any element in the list
    * @param list the list we want the last element of
    * @tparam A the type of the List
    * @return an Option value with last element of the list if there is any element in the list
    */
  final def myLastOption[A](list: List[A]): Option[A] = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    * @param list the type we want to extend
    * @tparam A the type of the list, here no restriction
    */
  implicit class ListOps[A](list: List[A]) {
    /**
      * This function should return the last element of a list, if there is any element in the list
      * @return an Option value with last element of the list if there is any element in the list
      */
    def implLast: Option[A] = ???
  }
}
