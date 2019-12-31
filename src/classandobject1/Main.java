package classandobject1;

import java.io.IOException;
import java.util.Scanner;

import classandobject1.Lap;
import classandobject1.LapManager;
public class Main {

public static void main(String[] args) throws IOException{
LapManager mg = new LapManager();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
byte lapNo ;
byte throwsMade;
String fastestPlayer;
float fastestTime;
Lap l[] = new Lap[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter Lap Number");
lapNo=sc.nextByte();
System.out.println("Enter Maximum throws");
throwsMade=sc.nextByte();
System.out.println("Enter Player name");
fastestPlayer=sc.next();
System.out.println("Enter  Best time");
fastestTime=sc.nextFloat();
l[i]=new Lap(lapNo,throwsMade,fastestPlayer,fastestTime);

}
mg.displayAllLaps(l);
mg.displayFastestInLap(l,(byte)103);
mg.displayMaximumThrows(l);

}

}
