public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Compares memory references and string equality
    public void compareNames(Person other) {
        boolean sameReference = (this.name == other.name);
        boolean sameContent = this.name.equals(other.name);

        System.out.println(sameReference + "," + sameContent);
    }

    public static void main(String[] args) {
        // Explicitly creating two separate String objects
        Person p1 = new Person(new String("Java"));
        Person p2 = new Person(new String("Java"));

        p1.compareNames(p2);
    }
}
