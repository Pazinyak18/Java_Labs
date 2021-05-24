# Java_Lab8
### task
- Write the code for the task from the laboratory №2
When writing a program, you need to use the arrangements for the design of the java code convention.
Classes need to be properly divided into packages.
Working with the console or console menu should be minimal.
Only those classes that are on the class diagram should be present in the code
Class attributes and their visibility must match those specified in the class diagram. The same goes for class methods
Use the built-in sorting methods available in Java to sort
Sorting should be implemented in a separate method
The code does not contain static methods / attributes. Only one static method is allowed - main
The code must use an enum type
The code should be filled in a separate repository, having previously created a pull request (ie the code should be written in a separate branch on its basis to make a pull request)
Implementation of comparison of elements and their sorting using lambda expressions (examples of using lambda: https://www.mkyong.com/java8/java-8-lambda-comparator-example/, more detailed description of what is lambda: https: // habrahabr.ru/post/224593/)
Instead of writing setters and getters, you should use Lombok annotations (@Data) - more details about this library - https://habr.com/ru/post/438870/
Convert a project so that its assembly can be performed using maven. Also connect the following plugins to pom.xml
- plug-in Jacoco which will check the code by tests (in the build section):
- FindBugs plugin that automatically checks the quality of the code and search for potential errors in the code (in the reporting section):
- PMD plugin (in the reporting section):
- Checkstyle plugin - checks compliance with the code convention (in the reporting section):


When finished, run the mvn site command and view the results in the target / site folder (by opening the index.html file)
The code should fix all errors detected by the FindBugs, PMD and Checkstyle plugins (except for errors related to the lack of comments). 
