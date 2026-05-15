package lab8;

public class Computer {
    private Processor processor;
    private Memory memory;
    private DisplayCard displayCard;
    private SoundCard soundCard;

    public Computer() {
        processor   = new Processor("Ryzen 7 7840hs", 3.8, 8, 16);
        memory      = new Memory("DDR5", 16, 4800, 2);
        displayCard = new DisplayCard("NVIDIA RTX 4060", 8, 2460, 3072);
        soundCard   = new SoundCard("Realtek ALC897", 7.1, 192000, "PCIe");
    }

    public void showInf() {
        System.out.println("Компьютерийн мэдээлэл");
        processor.printInfo();
        memory.printInfo();
        displayCard.printInfo();
        soundCard.printInfo();
    }
}