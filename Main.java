
public class Main0 {
	public static void main(String []arg) {
		
		/*Pets c1=new Cat("tumi",35.5,30);
		Pets c2=new Dogs("komy",67.5,90);
		System.out.println(c1.toString());
		System.out.println(c1.howtosound());
		System.out.println(c2.toString());
		System.out.println(c2.howtosound());*/
		Pets[]p=new Pets[3];
		p[0]=new Cat("komi",8.5,24);
		p[1]=new Dogs("nomi",89.8,30);
		p[2]=new Cat("toto",90.0,90);
		for(Pets k:p) {
			if(k instanceof Cat) {
				System.out.println(k.toString());
				System.out.println(k.howtosound());
			}
			else {
				System.out.println(k.howtosound());
			}
			
			
			
		}
		
		
	}

}
