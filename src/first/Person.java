package first;

public class Person {

    private String name;
    private int age;
    public static String gender = "Male";

    // all args
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // no args
    public Person() {
    }

    // setter
    public void setName(String name){
        this.name = name;
    }

    // getter
    public String getName(){
        return this.name;
    }

    //setter
    public void setAge(int age){
        this.age = age;
    }

    //getter
    public int getAge(){
        return this.age;
    }

    public void speak(){
        System.out.println("Hi I'm a person and I am speaking!!!");
    }

}
