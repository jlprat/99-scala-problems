# 99-scala-problems
## Intro
This is another take on 99 Scala Problems. However, the purpose of this is not to show how good I am solving them, but offering a way to beginners to practice and write their own solutions. This project will contain tests and the public interfaces of each problem, so anybody is free to implement solutions in their own way!

This 99 Scala problems are an adaptation of http://aperiodic.net/phil/scala/s-99/ which at it's turn are an adaptation of https://sites.google.com/site/prologsite/prolog-problems. I a couple of exercices to make them more testable.

## Purpose
The purpose of this exercercises is to practice and learn Scala, and using already built-in functions is discouraged.

I decided to start with this project because, long time ago, when I discovered the 99 Scala Problems, I had a lot of fun and I learned a lot about Scala. Recently, I stumbled upon them again, and I realized that there are no github projects (or at least, I couldn't find any) that could be used as a sandbox, where people can code their own solutions and run them against a battery of tests.

As in the original version, problems are in groupped in 7 different types: Lists, Arithmetic, Logic and Codes, Binary Trees, Multiway Trees, Graphs and Miscellaneous. Also the problems have different levels of difficulty marked by stars (*), being 1 star the easiest and 3 stars the most difficult ones.

## How to work with this project
It's easy, just pick a problem, read the tests, and implement the methods in the class. Some problems offer different alternatives to implement or interesting things to do, like adding your custom methods to Lists for example.

Each problem is located in the `src` folder under the corresponding package, so P01 is under `com.github.jlprat.ninetynine.P01`. Tests follow the same structure and are located under the `test` folder.

## How to run the tests
Once you are ready with your implementation open a terminal, go to the project folder and just run:
> sbt test

Or if you want to run a specific test, for example P01 you can run:

> sbt testOnly com.github.jlprat.ninetynine.p01.P01Spec

##Problem list
### Working with Lists
P01\*: Find the last element of a list  
P02\*: Find the penultimate element of a list (last but one)  
P03\*: Find the *k*<sup>th</sup> element of a list  
P04\*: Find the number of elements of a list  
P05\*: Reverse a list  
P06\*: Find out if a list is a palindrome  
P07\*\*: Flatten a nested list structure  
P08\*\*: Eliminate consecutive duplicates of list elements  
P09\*\*: Pack consecutive duplicates of list elements into sublists  
P10\*: Run-length encoding of a list (Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E)  
P11\*: Modified run-length encoding. Only elements with duplicates are transferred as (N, E) terms
P12\*\*: Decode a run-length encoded list.
P13\*\*: Run-length encoding of a list (direct solution).
P14\*: Duplicate the elements of a list.
P15\*\*: Duplicate the elements of a list a given number of times.
P16\*\*: Drop every Nth element from a list.
P17\*: Split a list into two parts.
P18\*\*: Extract a slice from a list.
P19\*\*: Rotate a list N places to the left.
P20\*: Remove the Kth element from a list.
P21\*: Insert an element at a given position into a list.
P22\*: Create a list containing all integers within a given range.
P23\*\*: Extract a given number of randomly selected elements from a list.
P24\*: Lotto: Draw N different random numbers from the set 1..M.
P25\*: Generate a random permutation of the elements of a list.
P26\*\*: Generate the combinations of K distinct objects chosen from the N elements of a list.
P27\*\*: Group the elements of a set into disjoint subsets.
P28\*\*: Sorting a list of lists according to length of sublists.



