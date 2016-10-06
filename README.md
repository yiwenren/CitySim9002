# CitySim9002

IS2545 - DELIVERABLE 2: Unit Testing

In this deliverable I used Eclipse to develop and test.  I also upload CitySim9002.jar file in my repository.

The first issue I faced when I worked on this assignment is how to use appropriate object-oriented design. I thought about creating class for all objects including the visitor type: visitor, student, professor, business person, blogger, and the four locations: The Cathedral of Learning, Squirrel Hill, The Point, and Downtown. But then I realized if I did so, there would be too many classes. I was not sure whether it was necessary. So finally I decided not to create class files for locations. Could you show your code after the submission deadline? We can see the differences between yours and ours to get deeper understanding of object-oriented design.

The second issue is I was not sure whether I should test a method which would be overwritten by other subclasses and never be used in this superclass. For example, I wrote a method prefers(int loc) in Visitor class. I noticed that you expected unit tests for AT LEAST each public method that returns a value. But I thought I would never call this function in superclass, so it seemed that testing this method was meaningless. Testing its overwritten method in subclasses was enough.

In the assignment, I wrote a test file for each class. I tried to think about all the edge cases when I test. For example, when I tested the method getLocName(), I considered null value may return. The gerLocNameNull() in VisitorTest.java is used to test this case. For the prefer() method in each Visitor subclass, I tested all the situations. Because the preferences of all the four type are different, and even the same type visitor’s preferences for different locations are also different. So I thought it was not enough if I regarded them as equivalence classes to test only some of them.

