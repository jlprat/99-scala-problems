package com.github.jlprat.ninetynine.p16

/**
  * Created by @jlprat on 25/03/2016.
  * P16: Drop every Nth element from a list. Note that is different from already built in drop function.
  * Consider the first element of the list to be n=1
  * Difficulty: **
  */
object P16 {

  /**
    * Drops every nth element from a list
    *
    * @param list the list to remove every nth element
    * @param n the value of n
    * @tparam A the type of the list
    * @return a list without every nth element
    */
  def drop[A](list: List[A], n: Int): List[A] = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    *
    * @param list the type we want to extend
    */
  implicit class ListOps[A](list: List[A]) {

    /**
      * Drops every nth element from a list
      *
      * @param n the value of n
      * @return a list without every nth element
      */
    def drop( n: Int): List[A] = ???

  }

}
