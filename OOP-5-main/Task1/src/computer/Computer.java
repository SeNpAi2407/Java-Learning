package computer;

import computer.harddisc.HarDisc;
import computer.keyboard.Keyboard;
import computer.memory.Memory;
import computer.monitor.Monitor;
import computer.processor.Processor;

public class Computer {
    private Processor processor;
    private Memory memory;
    private HarDisc disc;
    private Monitor monitor;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(Processor processor,
                    Memory memory,
                    HarDisc disc,
                    Monitor monitor,
                    Keyboard keyboard,
                    String vendor,
                    String name) {
        this.processor = processor;
        this.memory = memory;
        this.disc = disc;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HarDisc getDisc() {
        return disc;
    }

    public void setDisc(HarDisc disc) {
        this.disc = disc;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return processor.getWeight() + memory.getWeight() + disc.getWeight() + monitor.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", disc=" + disc +
                ", monitor=" + monitor +
                ", keyboard=" + keyboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
