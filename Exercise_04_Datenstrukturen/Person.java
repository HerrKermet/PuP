package Exercise_04_Datenstrukturen;

public class Person implements Comparable<Person> {
    String name;
    int id;

    Person(String n, int i){
        name = n;
        id = i;
    }


    @Override
    public int compareTo(Person o) {
        return this.id - o.id;
    }
}
