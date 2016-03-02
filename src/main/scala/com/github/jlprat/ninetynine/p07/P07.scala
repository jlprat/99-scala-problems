package com.github.jlprat.ninetynine.p07

/**
  * Created by @jlprat on 02/03/2016.
  * P07: Flatten a nested list structure
  * Difficulty: **
  */
object P07 {

  /**
    * Flattens a nested list structure, no matter how many of nested lists.
    * Sorry typechecking here doesn't help much
    * @param list a list with nested lists within
    * @return the list flattened
    */
  def flatten(list: List[Any]): List[Any] = ???

  /**
    * This is a way to extend classes, in this case, we add new functionality to the already existing Lists
    *
    * @param list the type we want to extend
    */
  implicit class ListOps(list: List[Any]) {

    /**
      * Flattens a nested list structure
      * @return the list flattened
      */
    def myFlatten: List[Any] = ???
  }
}
