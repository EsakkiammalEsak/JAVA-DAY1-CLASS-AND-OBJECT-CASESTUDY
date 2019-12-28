package sample3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main1 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader sc=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sc);
		String s1=br.readLine();
		String s2=br.readLine();
		player t=new player(s1,s2);
	}

}
