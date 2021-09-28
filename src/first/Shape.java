package first;

public abstract class Shape {

    abstract void draw(); // We are not giving the implementation here, that means
    // whichever class will extend this class, will have to implement this method

    public void defaultShape(){
        System.out.println("This is default shape");
    }
}


/**
 * 1. Abstract classes can't be instantiated.
 * 2. An abstract class must be declared with an abstract keyword
 * 3. An abstract class can have abstract as well as non-abstract methods
 * 4. It can have constructors and static method
 *
 */