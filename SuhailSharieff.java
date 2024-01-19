

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 * SuhailSharieff
 */





public class SuhailSharieff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of times u wanna test my program....");
		int t=sc.nextInt();
		for(int v=0;v<t;v++){
			System.out.println("tell me how many teams r there (the number of teams should be some power of 2) ");
			int n=sc.nextInt();
			System.out.println("enter the time given for each round ");
			int a=sc.nextInt();
			System.out.println("enter the break time given after each round in minutes ");
			int b=sc.nextInt();
			int c=1;
			while(n/2!=1){
				n=n/2;
				c++;
			}
			System.out.println("the total time taken for your event to complete is :");
			System.out.println((c-1)*b+(c*a)+" minutes");
			


		}
	}
}