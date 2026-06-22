import computer.Computer;
import computer.harddisc.HarDisc;
import computer.harddisc.HardDiscType;
import computer.keyboard.Illuminate;
import computer.keyboard.Keyboard;
import computer.keyboard.KeyboardType;
import computer.memory.MemoreType;
import computer.memory.Memory;
import computer.monitor.Monitor;
import computer.monitor.MonitorType;
import computer.processor.CoreCount;
import computer.processor.Creator;
import computer.processor.Frequency;
import computer.processor.Processor;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(Frequency.TWO_THOUSAND, CoreCount.FOUR, Creator.AMD, 500);
        Memory memory = new Memory(MemoreType.DDR4, 16, 500);
        HarDisc harDisc = new HarDisc(HardDiscType.SSD, 500, 500);
        Monitor monitor = new Monitor(17, MonitorType.IPS, 500);
        Keyboard keyboard = new Keyboard(KeyboardType.WIRELESS, Illuminate.YES, 500);

        Computer computer = new Computer(processor, memory, harDisc, monitor, keyboard, "Intel", "INSPIRION");
        System.out.println(computer.getWeight());
    }
}