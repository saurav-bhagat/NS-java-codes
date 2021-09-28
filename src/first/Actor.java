package first;

public class Actor extends Person{
    private String genre;
    private int filmCounts;

    public Actor(String name, int age, String genre, int filmCounts){
        super(name, age);
        this.genre = genre;
        this.filmCounts = filmCounts;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getFilmCounts(){
        return this.filmCounts;
    }

    public void speak(){
        System.out.println("Hi I'm a Actor, and I'm speaking kiran!!");
    }
}
