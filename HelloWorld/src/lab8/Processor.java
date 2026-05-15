package lab8;

public class Processor {
 
	private String name;
    private double clockSpeed;
    private int cores;
    private int threads;
 
    public Processor(String name, double clockSpeed, int cores, int threads) {
    	this.name = name;
    	this.clockSpeed = clockSpeed;
    	this.cores = cores;
    	this.threads = threads;
    	
    }
    
    public void printInfo() {
    	 System.out.println(" Процессор ");
    	 System.out.println("Нэр:" + name);
    	 System.out.println("Давтамж:" + clockSpeed);
    	 System.out.println("Цөм:" + cores);
    	 System.out.println("Утас:" + threads);
    	 
    }
}
