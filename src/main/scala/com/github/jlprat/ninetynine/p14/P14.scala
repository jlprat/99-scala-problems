package com.github.jlprat.ninetynine.p14

/**
  * Created by @jlprat on 21/03/2016.
  * P14: Duplicate the elements of a list.
  * Difficulty: *
  */
object P14 {

  /**
    * Duplicates each element in the list
    * @param list the list which element should be duplicated
    * @tparam A the type of the list
    * @return a list where each element is duplicated
    */
  def duplicate[A](list: List[A]): List[A] = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    *
    * @param list the type we want to extend
    */
  implicit class ListOps[A](list: List[A]) {

    /**
      * Duplicates each element in the list
      * @return a list where each element is duplicated
      */
    def duplicate: List[A] = ???

  }

}
