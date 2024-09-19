import java.util.ArrayList;
import java.util.Collections;

public class SortingOrder {
    public static void main(String[] args){
        ArrayList<Person> list = new ArrayList<Person>();
        list.add (new Person("Aman",34));
        list.add (new Person("Akbar",42));
        list.add (new Person("Anthony",28));

        Collections.sort(list);
        System.out.println(list);
    }
}

class Person implements Comparable<Person>{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override

    public int compareTo(Person person){
        if(this.age == person.age)
            return 0;
        else
            return(this.age < person.age) ? -1 : 1;
    }

    @Override
    public String toString(){
        return this.name + ":" + this.age;
    }

}
