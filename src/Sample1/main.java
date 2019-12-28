package Sample1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {

	public static void main(String[] args)throws IOException {
		InputStreamReader sc=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sc);
		String s1=br.readLine();
		String s2=br.readLine();
		Team t=new Team(s1,s2);
		
	}

}
