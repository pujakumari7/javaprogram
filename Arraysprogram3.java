package package2;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysprogram3 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int rollno[]=new int[4];
		rollno[0]= s1.nextInt();
		rollno[1]=s1.nextInt();
		rollno[2]=s1.nextInt();
		System.out.println(Arrays.toString(rollno));
	}

}
