package com.github.jlprat.ninetynine.p02

/**
  * Created by @jlprat on 29/02/2016.
  *
  * P02: Find the penultimate element of a list (last but one)
  * Difficulty: *
  */
object P02 {

  /**
    * This function should return the penultimate element of a list
    * @param list the list we want to retrieve the element from
    * @tparam A the type of the list
    * @return the penultimate element in the list
    */
  final def penultimate[A](list: List[A]): A = ???

  /**
    * This function should return the penultimate element of a list
    * @param list the list we want to retrieve the element from
    * @tparam A the type of the list
    * @return the Option value containing the penultimate element in the list if there is a penultimate
    */
  final def penultimateOption[A](list: List[A]): Option[A] = ???


  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    * @param list the type we want to extend
    * @tparam A the type of the list, here no restriction
    */
  implicit class ListOps[A](list: List[A]) {
    /**
      * This function should return the penultimate element of a list
      * @return the Option value containing the penultimate element in the list if there is a penultimate
      */
    def penultimate: Option[A] = ???
  }
}
