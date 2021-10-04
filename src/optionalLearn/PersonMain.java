package optionalLearn;

import java.util.List;
import java.util.Optional;

public class PersonMain {
    public static void main(String[] args) {

        Optional<Person> p = number(5);
        p.ifPresent(i -> System.out.println(i.name));
    }

    static Optional<Person> number(int position){

        Optional<Person> person = Optional.empty();

        var PersonList = List.of(
                new Person("Saurav", 23),
                new Person("Mitu", 24),
                new Person("Isha", 32)
        );

        if(position >= 0 && position < PersonList.size()){
            person = Optional.of(PersonList.get(position));
        }
        return person;
    }
}
