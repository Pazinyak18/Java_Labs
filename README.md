### Task

- Task 9 of the laboratory is to create a REST service for one of the classes created in laboratory work 3
 (for example, for the class Aligator from the example in laboratory work  8 - AligatorController),
 which implements CRUD-operations (Get / Post / Put / Delete) on the resource ( for example over the Aligator resource) and the operation of returning all objects.
- The get operation must use id in the url: / aligator / 20
- The get operation without an id in the url should return a list of all available objects
- To implement the REST service, the base class from the 8th laboratory should be expanded with the field id (type Integer), and add set / get methods
- Also the code should be checked due to Findbugs / checkstyle / pmd plugins
- The code should be filled with a separate pool of requests relative to the code of the 8th laboratory (ie it is necessary to create a separate brunch in the same repository where the code of the 8th work, which will later become a pool of requests, but the pool request does not move !!!!)
- The controller and RestApplication class code must be placed in separate packages
- Saving objects of the Alligator class should be performed in an object of type Map
- This lab involves modifying an existing pom.xml file by adding the necessary dependencies 
