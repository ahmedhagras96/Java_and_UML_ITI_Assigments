# Java_and_UML_ITI_Assigments

## 1- File handling and data extraction Assignment
### Project Name That task implmented in: Pyramids_Ass

### Requirments
Deal with Egyptian Pyramids CSV dataset.

https://www.kaggle.com/lsind18/egyptianpyramids

*  Prepare it and print the basic data about each pyramid.
*  Explore the dataset (CSV file) and understand it’s parts
*  Dataset preparation/transformation
     * Build a Pyramid class to define a prototype for all information you will extract from CSV for each pyramid
     * Build a PyramidCSVDAO class to:
        * Read pyramids.csv file.
        * Create List of Pyramids objects for each pyramid in the csv file
        * Validate the values you make all needed conversion
     * Build a Main class to use PyramidCSVDAO class and print the basic data about each pyramid.


## 2- Lab Exercise 1

## Make Dictionary for Countries and Sorted list of Cities by population
### Project Name That task implmented in: Countries_Cities

### Requirments

* Develop and application that reads two files for cities and countries
and store each in a List.
* Each city entry contains code, name, continent, Surface Area,
population
* Create a map that uses the country code as keys and a list of cities as
the value for each country.
* For a given country code sort the cities according to the population

## 3- Lab Exercise 2

## Make a betterString method
### Project Name That task implmented in: BetterString

### Requirments

* The goal is to make a method called betterString that takes
two Strings and a lambda that says whether the first of the two
is “better”
* The method should return that better String; i.e., if the
function given by the lambda returns true, the betterString
method should return the first String, otherwise betterString
should return the second String.
    * String string1 = ...;
    * String string2 = ...;
    * String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
    * String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
* Given a String, the task is to check whether a string contains
only alphabets or not.
* Use isLetter() method of Character class.

## 4- Lab Exercise 3

## Using streams in exercise one
### Project Name That task implmented in: Countries_Cities

### Requirments

* Using the classes created in exercise 1 provide classes or methods
to get the following:
    * Highest population city of each country
    * Highest population city by continent
    * Highest population capital

