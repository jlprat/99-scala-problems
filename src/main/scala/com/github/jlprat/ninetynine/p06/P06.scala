package com.github.jlprat.ninetynine.p06

/**
  * Created by @jlprat on 01/03/2016.
  * P06: Find out if a list is a palindrome
  * Difficulty: *
  */
object P06 {

  /**
    * Checks if the elements in the list form a palindrome
    * @param list the list to be checked if its elements form a palindrome
    * @tparam A the type of the list
    * @return if the elements in the list form a palindrome
    */
  def isPalindrome[A](list: List[A]): Boolean = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    *
    * @param list the type we want to extend
    * @tparam A the type of the list, here no restriction
    */
  implicit class ListOps[A](list: List[A]) {

    /**
      * Checks if the elements in the list form a palindrome
      * @return if the elements in the list form a palindrome
      */
    def isPalindrome: Boolean = ???
  }

}
