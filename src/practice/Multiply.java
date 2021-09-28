package practice;

public class Multiply {

    public static void main(String[] args) {
        System.out.println(multiply(2, 3));

        System.out.println(multiply(2, 3,4));
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    // overloading of methods
    public static int multiply(int a, int b, int c){
        return a*b*c;
    }
}

// overload - compile time
// override - runtime

// Polymorphism = poly + morph = many + forms
/**
 *
 * How do we achieve polymorphism?
 *
 * 1. Method overriding(runtime polymorphism) - When you override methods of Parent class inside a Child class.
 * 2. Method overloading(compile time polymorphism) - When function signature is same, but number of parameters or return type is different
 */
