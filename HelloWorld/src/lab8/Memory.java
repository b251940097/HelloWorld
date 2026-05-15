package lab8;

public class Memory {
    private String type;        
    private int capacityGB;     
    private int speedMHz;       
    private int slots;     
    public Memory(String type, int capacityGB, int speedMHz, int slots) {
    	this.type = type;
    	this.capacityGB = capacityGB;
    	this.speedMHz = speedMHz;
    	this.slots = slots;
    	
    }
    public void printInfo() {
    	System.out.println("Шуурхай санах ой");
    	System.out.println("төрөл:" + type);
    	System.out.println("багтаамж:" + capacityGB);
    	System.out.println("хурд:" + speedMHz);
    	System.out.println("Зай:" + slots);
    	
    	
    }
}
