package lab8;

public class SoundCard {
 private String name;
 private double channels;
 private int sampleRate;
 private String interface_;


public SoundCard(String name, double channels, int sampleRate, String interface_) {
 this.name = name;
 this.channels = channels;
 this.sampleRate =sampleRate;
 this.interface_ = interface_;
   }

 public void printInfo() {
	 System.out.println("Дууний карт");
	 System.out.println("Нэр:" + name);
	 System.out.println("Суваг:" + channels + "ch");
	 System.out.println("Sample rate:" + sampleRate + "Hz");
	 System.out.println("Холболт:" + interface_);
	 
  }
}
