package com.github.jlprat.ninetynine.p04

/**
  * Created by josep on 01/03/2016.
  * P04: Find the number of elements of a list
  * Difficulty: *
  */
object P04 {

  /**
    * Calculates the number of elements in the list
    * @param list the list we want to know the size of
    * @tparam A the type of the list
    * @return the size of the list
    */
  final def size[A](list: List[A]): Int = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    * @param list the type we want to extend
    * @tparam A the type of the list, here no restriction
    */
  implicit class ListOps[A](list: List[A]) {

    /**
      * Calculates the number of elements in the list
      * @return the size of the list
      */
    def mySize: Int = ???
  }
}
