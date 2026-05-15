package lab7;

public class Student {
	private String name;
	private int age;
	private String studentid;
	
	public Student(String name, int age, String studentid) {
	
		this.name = name;
	    this.age = age;
	    this.studentid = studentid;
	}
	 public String getName() {
	        return name;
	    }
	 public int getage() {
		 return age;
	 }
	 public String getstudentID() {
		 return studentid;
	 }
	 public String toString()  {
		 return name +"\n"+age+"\n"+studentid;
		 
		 
	 }
}

