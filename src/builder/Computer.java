package builder;

public class Computer {
    // Required parameter.
    private final String cpu;
    private final int ram;

    // Optional parameter.
    private final int storage;
    private final String os;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.os = builder.os;
    }

    public static class Builder{
        private final String cpu;
        private final int ram;

        private int storage = 256; // default.
        private String os = "Linux";


        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder storage(int storage){
            this.storage = storage;
            return this;
        }
        public Builder os(String os){
            this.os = os;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                '}';
    }
}
