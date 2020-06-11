public class Main {

    public static void main(String[] args) {
        //3 8 10
        /*'void' is returning value & return type 'void' means there's no return value
        'main' is the name of the method.
        'String[] args' this is arguments to the 'main' method.
        This method must be given an array of String & name of the array is 'args'

        The 'main' method is where your program strats running.
        No matter how big your program is or how many classes your program uses,
        there's got to be a 'main()' method to run the whole program.
        ***When you run a program, you're running a class***
         */
        
        int size = 27; //declare an integer variable named 'size' & give it the value '27'
        String name = "Fido"; // declare a string of characters variable named 'name' & give it the value 'Fido'
        Dog myDog = new Dog(name, size); //declare a new Dog variable 'myDog' & make the new Dog using 'name' & 'size'
        int x = size - 5; //subtract 5 from 27 (value of 'size') & assign it to a variable named 'x'
        if(x<15) myDog.bark(8); //if x (value of 22) is less than 15, tell the dog to bark 8 times
        
        while(x>3){ //keep looping as long as x is greater than 3
            myDog.play(); // tell the dog to play 
            x--;
        } //end of the loop
        
        int[] numList = {2, 4, 6, 8}; //declare a list of integer variable 'numList' & put 2, 4, 6, 8 values into the list
        System.out.println("Hello"); //printing 'Hello'
        System.out.println("Dog: "+ name); //printing 'Dog: Fido'
        String num = "8"; //declare a string of a number '8'
        int z = Integer.parseInt(num); //convert the string of character '8' into a actual number value 8
        
        try {
//            readTheFile(myFile.txt);
        }
        catch (Exception ex){ //catches exception
            System.out.println("File not found"); // because, there is no document file of myFile.txt
        }
        
	/*
	1. Java is a object-oriented (OO). [objects are born & objects die also it can be flattened & inflated.
	    Object have state & behavior. Behavior lives in class but state lives within each individual object.]
	    Class is a 'blueprint' for an Object. When you design a class, think about the objects that will be
	    created from that class type. *** instance == object ***
	    [Things an object knows about itself are called (state): "instance variable"]
	    [Things an object can do are called (behavior): "methods"]
	    *** A class is not an object but it is used to construct them. A class describes what an object knows and what
	    an object does ***
	    State(instance variable) affects behavior(methods), behavior affects state.
	2. Variables are two types : i) primitive ii) reference
	    i) primitive is - boolean, character, byte, short, integer,  long, float, double
	        [Be Carefull Bears Shouldn't Ingest Large Furry Dogs - to remember 8 primitive types]
	        float ft = 32.5f; - Here "f", Java thinks anything with a floating point is a double, unless you use "f"

	        [Type]________[Bit]__________________[Range]
	        booblean______32bit__________________true/false
	        char__________16bits_________________0 to 65535
	        int___________32bits_________________-2147483648 to 2147483647
	        byte__________8bits__________________-128 to 127
	        short_________16bits_________________-32768 to 32767
	        long__________64bits_________________-huge to huge
	        float_________32bits_________________varies
	        double________32bits_________________varies

            ***you can put a large value into a small value...like:
            int x = 24; //here integer(24) is 32bits*24
            byte b = x; //will not work because, here, byte 8bits can't hold (32*24)bits
	    ii) reference - like object variabls
	        *** There is actually no such thing as an Object variable. There's only an object reference variable.
	        An object reference variable holds bits that represent a way to access an object. It doesn't hold the object
	        itself like a pointer/an address. Except, in Java we don't really know what is inside a reference variable.
	        We do know that whatever it is, it represents one and only one object.

	        *** A primitive variable is full of bits representing the actual value of the variable,
	        an object reference variable is full of bits representing a way to get to the object.*****

	    *** Java always cares about type of variables *** you can not put Giraffe in a Rabbit variable

	*/

        /*
	3. garbage-collector - reclaims the memory [after a objects death,
	4. Methods use instance variable values. [pass by value means pass by copy]
	5. Operators & loops, branching, statements
	    Statement(do something) : declarations, assignments, method calls etc. */
        int x0 = 3;
        String name0 = "Dirk";
        x0 = x0 * 17;
        System.out.println("x is " + x0);
        double d = Math.random();
        System.out.println("Printing double random rumbers on each run: " + d);
	/*
	    Loops(do something again and again) for & while: */
        while(x0>12){
            System.out.println("now x is: "+x0);
            x0=x0-1;
        }
        for (int q=0;q<10;q=q+1){ //:p yes, you can take q over i :p it is just a variable name
            System.out.println("q is now: "+q);
        }
    /*
        Brnching(do something under this condition) if & else: */
        if((x0<3)||(name0.equals("Dirk"))){
            System.out.println("Gently");
        }
        if(x0==10){
            System.out.println("x must be 10");
        }
        else{
            System.out.println("x is not 10");
        }
        System.out.println("This line runs no matter what");

	/*
	6. Java library [Java API] - Java has hundreds of pre-built classes. Example: java.util package, java.net library
	7. Polymorphism
   *8. Inheritance
   *9. Abstract class - A class that can not be instantiated.
	10. heap, stack, scope, constructor, null references, gc eligibility
	11. For math - absolute value, rounding, min/max etc.
	12. Static variables are shared by all instance of a class
	13. Exceptions
	14. GUI, event handling, inner classes
	15. Layout Manager
	16. 'System.out.print' vs 'System.out.println' - 'println' inserts a new line, 'print' keeps it in the same line
	17. int s = 1; while(x){} = is not possible in Java
	    but boolean inHot = true; while(isHot){} = is possible
	18. "=" is a assingment operator & "==" equals operator
	    The Dot Operator "." - gives you access to an object's state and behavior (instance variables & methods)
	    *** Dog d = new Dog - d is new object of Dog class
	    d.bark(); -  calling bark() method of instance d
	    d.size = 40' - initializing size value of instance d
	19. Java Virtual Machine (JVM) - this is mainly Java what runs the program & a compiler just prints gives a file to print
	    JVM & compiler works with each other like a battery and a clock, like phones & simcards
	    Java was designed to use a bytecode compiler. If java were purely interpreted language, where, at run-time
	    the virtual machine had to translate straight-from-a-text editor source code. Also, as Java is a strongly-typed
	    language, compiler watch for wrong type of variables or errors. On the other hand, JVM throws exception.
	    Compiler works for dynamic binding. Additionally, compiler can be replaced by programmers
	    bytecode(which is not time consumming).
	20. encapsulation
	21. There are also "Object type Array" - A referece variable has a value of null when it is not referencing any object.
	    An Array is always an object, even if the array is declared to hold primitives. There is no such thing as a primitive
	    array.
    22. Arguments & Parameters -
    A caller passes arguments()

     *****
     Dog d = new Dog();
     d.bark(3);
     //Here, "(3)" is argument which is integer **** you can send more than one thing in methods like multiple parameters//
    A method uses parameters(a variable with a type & a name). if a method takes parameter, you must pass it the appropriate values.
    *******
    void bark(int numOfBarks){
        while(numOfBarks>0){
        System.out.println("ryff");
        numOfBarks = numOfBarks - 1;
        }
    }
    ******
    int go(String Direction){
        String s = "Go To "+Direction;
        return s;

        //A method must declare a return type
        //methods can return values as well
        //here, we are returning "int" value, if it was "void" there was nothing to return
        ******** A method returning multiple values is possible by using an array
        **If you declare a method to return a value, you must return a value of the declared type.***
    }
    ******
    void go(){
        TestStuff t = new TestStuff();
        t.takeTwo(12, 34);
        //here, calling method with multiple parameters
    }
    void takeTwo(int x, int y){
        int z = x + y;
        System.out.println("Total is " + z);
    }
    *******you can pass variables as long as the method has same arguments
    void go(){
        int foo = 7;
        int bar = 3;
        t.takeTwo(foo,bar);
    }
    void takeTwo(int x, int y){
        int z = x + y;
        System.out.println("Total is " + z);
    }

	*** PLAN YOUR PROGRAMS WITH THE FUTURE IN MIND ***
	*/
    }
}
