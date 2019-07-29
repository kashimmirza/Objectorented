
public class Cat extends Pets{
	private int hour_sleeping;
	public Cat() {
		super();
		
	}
	public Cat (String a, double b, int c) {
		super(a,b);
		hour_sleeping=c;
		
		
	}
	public String toString() {
		return super.toString()+" "+this.hour_sleeping;
	}
	public String howtosound() {
		return "mew";
		
	}
	

}
