package builder;

public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Core i9", 32)
                .storage(1000)
                .os("Window 11")
                .build();

        System.out.println(gamingPC);

        Computer officePC = new Computer.Builder("Core i5", 16)
                .os("Ubuntu")
                .build();

        System.out.println(officePC);
    }
}
