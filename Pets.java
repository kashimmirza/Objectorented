
public class Pets {
  protected String name;
  protected double age;
  Pets(){
	  
  }
  Pets(String name,double age){
	  this.name=name;
	  this.age=age;
  }
  public String toString() {
	  return this.name+" "+this.age;
	  
  }
  public String howtosound() {
	  return "no sound";
  }
  
}
