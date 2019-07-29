
public class Dogs extends Pets{
	private String a;
	 private double d;
	 private int sleeping_hour;
	Dogs(){
		
		super();
	}
	Dogs(String a,double d, int sleeping_hour){
		
		super(a,d);
		this.sleeping_hour=sleeping_hour;
		
	}
	
	public String tostring() {
		
		return super.toString()+this.sleeping_hour;
	}
	public String howtosound() {
		return "gawgaw";
	}
	

}
