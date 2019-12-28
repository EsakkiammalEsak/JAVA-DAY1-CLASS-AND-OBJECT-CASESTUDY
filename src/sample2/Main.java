package sample2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		InputStreamReader sc=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sc);
		byte a=Byte.parseByte(br.readLine());
		byte b=Byte.parseByte(br.readLine());
		byte c=Byte.parseByte(br.readLine());		
		float f1=Float.parseFloat(br.readLine());
		float f2=Float.parseFloat(br.readLine());
		float f3=Float.parseFloat(br.readLine());
		float f4=Float.parseFloat(br.readLine());
		PlayerRecord p=new PlayerRecord(a,b,c,f1,f2,f3,f4);
		p.display();
		
		
			
		

	}

}
