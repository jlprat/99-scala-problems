# 99-scala-problems
## Intro
This is another take on 99 Scala Problems. However, the purpose of this is not to show how good I am solving them, but offering a way to beginners to practice and write their own solutions. This project will contain tests and the public interfaces of each problem, so anybody is free to implement solutions in their own way!

This 99 Scala problems are an adaptation of http://aperiodic.net/phil/scala/s-99/ which at it's turn are an adaptation of https://sites.google.com/site/prologsite/prolog-problems. I a couple of exercices to make them more testable.

## Purpose
The purpose of this exercercises is to practice and learn Scala, and using already built-in functions is discouraged.

I decided to start with this project because, long time ago, when I discovered the 99 Scala Problems, I had a lot of fun and I learned a lot about Scala. Recently, I stumbled upon them again, and I realized that there are no github projects (or at least, I couldn't find any) that could be used as a sandbox, where people can code their own solutions and run them against a battery of tests.

As in the original version, problems are in groupped in 7 different types: Lists, Arithmetic, Logic and Codes, Binary Trees, Multiway Trees, Graphs and Miscellaneous. Also the problems have different levels of difficulty marked by stars (*), being 1 star the easiest and 3 stars the most difficult ones.

## How to work with this project
TBD

## How to run the tests
Just run:
> sbt test

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
