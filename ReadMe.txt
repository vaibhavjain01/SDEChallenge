The design can be described in two simple points

1) Strategy Pattern for Moving Average Calculation
To make it possible to add different ways of calculating moving averages we use strategy pattern.
The strategy is allocated while creating object of data structure, and then used further.

2) Data Structure Itself
An interface describing basic functions to be used by data structure is created.
An abstract class providing default implementations to many of the functions is also provided, except for the display
A concrete class to use the functionality of abstract classes.
The main idea was to make everything here package private except for the concrete class to abstract the functionality from the client application.


References:
https://www.investopedia.com/terms/m/movingaverage.asp
https://en.wikipedia.org/wiki/Moving_average