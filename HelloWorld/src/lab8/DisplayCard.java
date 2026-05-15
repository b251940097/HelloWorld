package lab8;

public class DisplayCard {
    private String name;
    private int vramGB;
    private int coreClock;
    private int cudaCores;

    public DisplayCard(String name, int vramGB, int coreClock, int cudaCore) {
        this.name      = name;
        this.vramGB    = vramGB;
        this.coreClock = coreClock;
        this.cudaCores = cudaCore;  
    }

    public void printInfo() {
        System.out.println("Видео карт");
        System.out.println("Нэр: " + name);
        System.out.println("VRAM: " + vramGB + " GB");
        System.out.println("Давтамж: " + coreClock + " MHz");
        System.out.println("CUDA цөм: " + cudaCores);
    }
}