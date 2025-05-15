package prototype;

public class Person implements Prototype{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Prototype clone() {
       try{
           return (Prototype) super.clone(); // shallow copy.
       }catch (Exception e){
           throw new RuntimeException(e.getMessage(), e);
       }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
