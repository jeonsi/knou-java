public class PersonalComputer extends Computer implements Calculator {
    public void calculate(String order) {
        System.out.println("PersonalComputer: " + order);
    }
}

class Computer {
    int nMemoryCapacity;
    int nHDDCapacity;
    boolean qPowered = false;
    void powerOn() {qPowered = true;}
    void powerOff() {qPowered = false;}
}

interface Calculator {
    public void calculate(String order);
}