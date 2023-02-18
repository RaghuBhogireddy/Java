## Class
-   Class is special form of data type
-   We can also consider as a blueprint and from which we can create objects
- A Class member can be a field  or a method or some type of dependent element
- If a field is static, there is only one copy in the memory and the value is associate with the class or template it self
- If a field is non-static, it is instance field and and each object have different value stored in this field
- A Static method can't depend on any object state, so it can't be referenced by any instance members
- A methods that operated on instance fields, should be non-static

## Object
- Objects have two main components
  - State
  - behaviour
- Object is an instance of the class
- An Objects can store it's state in the fields, which can also be called as variables or attributes
- An Object will expose it's behaviour with the methods
-   We can create an object from the class using `new` keyword
-  Some Classes like String can create an object simply using literal as well, like shown below <br>
   `String s = "Hi There" <- This creates and object of s and it's value set to "Hi There"` <br>
   `String s = new String("Hi There) <- This also creates the object in more traditional way`
## Exception
- An Exception is an error happens in the code

### Catching the Exception
- An Exception can be caught using the code block around the code which is prone to the error. 
- This can be done using the `try{}` block around the main code and followed by  `catch(Exception e){}` to handle the exception

### Scanner
- Scanner is an class in java used to capture user input from either the console or terminal by creating the Scanner class instance using `new` keyword <br>
   `Scanner scanner = new Scanner(System.in) <- System.in as parameter to read the input from terminal`
- We can read the input from File as well <br>
   `Scanner scanner = new Scanner(new File("FilePathAlongWithName""))`

## OOP
- Object-Oriented Programming is way to model real world objects, s/w objects which contain both data and code
- Class based programming starts with classes, which becomes the blueprints for the objects

## NULL
- null is a special keyword in java, meaning the variable or attribute has a type, but no reference to a object
- This means that no instance, or object is assigned to the variable field
- Fields with primitive type are never be null

## Encapsulation
- it has two meaning in the OOPS world
  - building behaviour and attributes on a single object
  - practice of hiding fields and methods from public access
- In General, it is about Information Hiding, means hiding internal workings of particular objects. 
- This can be achieved by Getters and Setters of a class

## Constructor
- used in creation of a objects, that is instance of a class
- It is special type of code block, which has specific name the is equals to class name and it was much like a method
- It doesn't return any values
- No need to provide return type for constructor, not even void
- Need or should provide access modifier to the constructor, to control who should be able to create the new instance

### Default Constructor
- If a class contains no constructor, then a default constructor is implicitly declared
- Often this has no parameters, and is called a s no-arg constructor
- If class contains any other Constructor declared, then default constructor won't be implicitly declared

### Constructor Chaining
- is when a constructor explicitly called other overloaded constructor
- can call constructor only form another constructor
- need to use special statement this() to execute another constructor, passing it arguments if required
- this() is first executable statement, if it's used in other constructor

### Reference vs object vs instance vs class
- reference often refers to address of the object. we can pass references as parameters for constructors and  methods
- object is often called as an instance of the Class
- instance and object can be used interchangeably 
- Class is called as a blueprint for creating objects

### Static vs instance variables
- Static variable
  - declared by using keyword static
  - also called as static member variables
  - every instance of class shares same static variable
  - if a change made to static variable, all other instances referring to this variable see the effect
- Instance variable
  - doesn't used static keyword
  - also known as fields or member variables
  - instance variable belong to specific instance of a class
  - every instance have it's own copy of instance variable
  - instance variable represent state, of specific instance of a class
  
### Static vs instance methods
- Static methods
  - methods are declared using static modifier
  - static methods can't access instance methods or variables directly
  - used for operations that don't  require data from an instance of the class (from this)
  - inside static methods, we can't use this keyword
- Instance methods
  - belongs to instance of a class
  - to use instance method, we need to create an instance of the class using new keyword
  - instance methods can access instance methods and variables directly
  - instance methods can access static methods and variables directly

### Record
- Record was introduced in JDK 14 and officially part of JDK 16
  - Purpose is to reduce the boilerplate of the POJO, but to be more restrictive
  - The record is special class that contains data, that's not meant to be altered
  - It seeks to achieve immutability, for data in its members.
  - `public record student(type param1, type param2 ...){}`
  - It generates the toString() method for the object also. 
  - Unlike usual POJO, these don't have any prefix to data filed accessors like `get` or `set`

