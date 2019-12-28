package sample4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main3 {

	public static void main(String[] args) throws IOException {
	 InputStreamReader isr=new InputStreamReader(System.in);
	 BufferedReader br=new BufferedReader(isr);
	 String a=br.readLine();
	 String b=br.readLine();
	 team t=new team(a,b);
	 System.out.println("TEAM NAME\t"+t.getName());
	 System.out.println("CITY REPRESENT\t"+t.getCity());
	 
	 
	 

	}

}
