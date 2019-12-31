package classandobject1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,i;
		n=s.nextInt();
		
		
		lap1 l[]=new lap1[n];
		lapManager m=new lapManager();
		for(i=0;i<n;i++)
		{
			System.out.println("LAP NO");
			byte lapno=s.nextByte();
			System.out.println("Throwsmade");
			byte throwsMade=s.nextByte();
			System.out.println("fastestPlayer");
			String fastestplayer=s.next();
			System.out.println("fastestTimes");
			float fastesttime=s.nextFloat();

			l[i]=new lap1(lapno,throwsMade,fastestplayer,fastesttime);
			
			
		}
		
	m.displayallLaps(l);
		
		
		
		

	}

}
