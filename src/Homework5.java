public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer(new Computer("Core i7", "16GB", "2TB", "White", "500W"),
                new Monitor("24 inch", "Black", "45W"));
        pc.turnOn();
        pc.printInfo();
    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer(String cpu, String memory, String hd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getHd() {
        return hd;
    }

    public String getColor() {
        return color;
    }

    public String getPower() {
        return power;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }
}

class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    public Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public String getMonitorSize() {
        return monitorSize;
    }

    public String getColor() {
        return color;
    }

    public String getPower() {
        return power;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }
}

class PersonalComputer{
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("  CPU: " + computer.getCpu());
        System.out.println("  Memory: " + computer.getMemory());
        System.out.println("  HDD: " + computer.getHd());
        System.out.println("  Color: " + computer.getColor());
        System.out.println("  Power: " + computer.getPower());
        System.out.println("The spec of the monitor");
        System.out.println("  Size: " + monitor.getMonitorSize());
        System.out.println("  Color: " + monitor.getColor());
        System.out.println("  Power: " + monitor.getPower());
    }
}
