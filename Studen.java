
public class Student extends Inhe02 {
	
	int id;
	String in;
	Student(String name, int age ,String country, int id, String in){
		
		super(name, age, country);
		this.id=id;
		this.in=in;
		
	
			  
	
 
}
	 public void printshow(){
		super.Info();
		
		System.out.println(" id"+" "+ this.id +" "+" "+"insti"+this.in);
	}
	public void info() {
		super.Info();
		System.out.println(" id"+" "+ this.id +" "+" "+"insti"+this.in);
	}
}
