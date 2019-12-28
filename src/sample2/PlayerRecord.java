package sample2;

public class PlayerRecord {
	private byte a,b,c;
   private float a1,a2,a3,a4;
   
  
	public PlayerRecord(byte a, byte b, byte c, float a1, float a2, float a3, float a4) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
	this.a1 = a1;
	this.a2 = a2;
	this.a3 = a3;
	this.a4 = a4;
}

	void display()
	{
		System.out.println("MATCHES\t"+a);
		System.out.println("NO OF WINS\t"+b);
		System.out.println("NO OF LOSS\t"+c);
		//System.out.println(""+d);
		System.out.println("AVERAGE LAP SPEED\t"+a1);
		System.out.println("MAXIMUM LAP SPEED\t"+a2);
		System.out.println("AVERAGE THROW DISTANCE\t"+a3);
		System.out.println("MAX THROW DISTANCE\t"+a4);
		
	}
	

}
