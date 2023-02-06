## Class
-   Class is special form of data type
-   We can also consider as a blueprint and from which we can create objects

## Object
-   Object is an instance of the class
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
