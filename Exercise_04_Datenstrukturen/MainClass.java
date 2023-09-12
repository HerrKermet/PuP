package Exercise_04_Datenstrukturen;

public class MainClass {
    public static void main(String[] args){
        Tree<Person> tree = new Tree<>();
        Person david = new Person("David", 10);
        Person john = new Person("John", 20);
        Person jane = new Person("Jane", 30);
        Person mike = new Person("Mike", 5);

        //not in the set
        Person schmerson1 = new Person("Schmerson", 1);
        Person schmerson2 = new Person("Schmerson", 2);

        tree.add(david).add(john).add(jane).add(mike);

        //Test cases
        System.out.println(((Person)tree.find(john)).name + " should be :John");
        System.out.println(((Person)tree.find(david)).name + " should be :David");
        System.out.println(((Person)tree.find(mike)).name + " should be :Mike");
        System.out.println(((Person)tree.find(jane)).name + " should be :Jane");

        System.out.println(((Person)tree.find(schmerson1)) + " should be :null");
        System.out.println(((Person)tree.find(schmerson2)) + " should be :null");
    }
}
