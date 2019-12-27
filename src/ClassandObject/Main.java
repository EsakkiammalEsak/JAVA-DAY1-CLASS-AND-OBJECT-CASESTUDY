package ClassandObject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(isr);
				int number1 = Integer.parseInt(br.readLine());
				int number2 = Integer.parseInt(br.readLine());
				Addition add = new Addition(number1,number2);
				Addition add1=new Addition();
				//add.addition(number1,number2);
				//add.display();
						

	}

}
