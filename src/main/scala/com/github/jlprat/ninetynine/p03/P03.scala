package com.github.jlprat.ninetynine.p03

/**
  * Created by josep on 29/02/2016.
  *
  * P03: Find the kth element of a list
  * Difficulty: *
  *
  */
object P03 {

  /**
    * This function should return the kth element of a list
    * @param list the list we want to retrieve the kth element
    * @param pos the position of the element to retrieve
    * @tparam A the type of the list
    * @return the element in position k
    */
  final def kth[A](list: List[A], pos: Int): A = ???

  /**
    * This function should return the kth element of a list
    * @param list the list we want to retrieve the kth element
    * @param pos the position of the element to retrieve
    * @tparam A the type of the list
    * @return the Option value containing the element in position k if there is any
    */
  final def kthOption[A](list: List[A], pos: Int): Option[A] = ???


  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    * @param list the type we want to extend
    * @tparam A the type of the list, here no restriction
    */
  implicit class ListOps[A](list: List[A]) {

    /**
      * This function should return the kth element of a list
      * @param pos the position of the element to retrieve
      * @return the Option value containing the element in position k if there is any
      */
    def kth(pos: Int): Option[A] = ???
  }
}
