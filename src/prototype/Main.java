package prototype;

public class Main {
    public static void main(String[] args) {
        Person original = new Person("Alice", 20);
        Person copy = (Person) original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}
