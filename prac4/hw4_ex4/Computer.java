package polyankina_kvbo0821.prac4.hw4_ex4;



class Memory {

    private int ram_size;
    private int count_ram;
    private String ram_name;

    public Memory(int ram_size, int count_ram, String ram_name) {
        this.ram_size = ram_size;
        this.count_ram = count_ram;
        this.ram_name = ram_name;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "ram_size=" + ram_size +
                ", count_ram=" + count_ram +
                ", ram_name='" + ram_name + '\'' +
                '}';
    }
}

class Monitor {

    private int hz;
    private String type;

    public Monitor(int hz, String type) {
        this.hz = hz;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "hz=" + hz +
                ", type='" + type + '\'' +
                '}';
    }

}

class Processor {

    private double clock_speed;
    private int count_core;
    private String processor_name;

    public void setClock_speed(double clock_speed) {
        this.clock_speed = clock_speed;
    }
    public void setCount_core(int count_core) {
        this.count_core = count_core;
    }
    public void setProcessor_name(String processor_name) {
        this.processor_name = processor_name;
    }

    public Processor(double clock_speed, int count_core, String processor_name) {
        this.clock_speed = clock_speed;
        this.count_core = count_core;
        this.processor_name = processor_name;
    }

    public double getClock_speed() {
        return clock_speed;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "clock_speed=" + clock_speed +
                ", count_core=" + count_core +
                ", processor_name='" + processor_name + '\'' +
                '}';
    }

}

public class Computer {
    public static void main(String[] args) {

        pcType(ComputerType.Cheap);
        pcType(ComputerType.Normal);
        pcType(ComputerType.Expensive);

    }

    public static void pcType(ComputerType computertype) {

        switch(computertype) {

            case Cheap:
                Processor cheap_processor = new Processor(2.5, 4, "INTEL 3");
                Monitor cheap_monitor = new Monitor(60,"vga");
                Memory cheap_memory= new Memory(4,1,"crucial");
                System.out.println("Characteristics of a cheap pc: ");
                System.out.println(cheap_processor);
                System.out.println(cheap_memory);
                System.out.println(cheap_monitor);
                System.out.println(cheap_processor.getClock_speed());
                System.out.println();
                break;

            case Normal:
                Processor normal_processor = new Processor(3.5, 6, "INTEL 5");
                Monitor normal_monitor = new Monitor(120,"vga");
                Memory normal_memory= new Memory(8,2,"samsung");
                System.out.println("Characteristics of a normal pc: ");
                System.out.println(normal_processor);
                System.out.println(normal_memory);
                System.out.println(normal_monitor);
                System.out.println();
                break;

            case Expensive:
                Processor expensive_processor = new Processor(4.2, 8, "INTEL 7");
                Monitor expensive_monitor = new Monitor(240,"ips");
                Memory expensive_memory= new Memory(32,4,"asus");
                System.out.println("Characteristics of an expensive pc: ");
                System.out.println(expensive_processor);
                System.out.println(expensive_memory);
                System.out.println(expensive_monitor);

        }

    }

}
