import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
    
	}

	public static void q1() {
    Scanner scanner=new Scanner(System.in);
	double num;
	System.out.print("Input a number: ");
	num=scanner.nextInt();
	System.out.println(Math.abs(num));
		//Write question 1 code here
	}

	public static void q2() {
		Scanner scanner=new Scanner(System.in);
		double num;
		double num1;
		double num3;
		double num4;
		System.out.print("Input a number: ");
		num=scanner.nextDouble();
		System.out.print("Input another number: ");
		num1=scanner.nextDouble();
		num3=(num/num1);
		System.out.println(Math.floor(num3));
		System.out.println(Math.ceil(num3));
		//Write question 2 code here
	}

	public static void q3() {
		Scanner scanner=new Scanner(System.in);
		double num;
		System.out.print("Input a number: ");
		num=scanner.nextDouble();
		System.out.println(Math.round(Math.sqrt(num)));

		//Write question 3 code here
	}

	public static void q4() {
		Scanner scanner=new Scanner(System.in);
		int num;
		int num1;
		System.out.print("Input a number: ");
		num=scanner.nextInt();
		System.out.print("Input another number: ");
		num1=scanner.nextInt();
		System.out.println(Math.pow(num,num1));


		//Write question 4 code here
	}

	public static void q5() {
		Scanner scanner=new Scanner(System.in);
        double num;
		double num1;
		double num3;
		double num4;
		double num5;
		System.out.print("Input a number: ");
		num=scanner.nextDouble();
		System.out.print("Input another number: ");
		num1=scanner.nextDouble();
		System.out.print("Input one more number: ");
		num3=scanner.nextDouble();
		num4=Math.max(num,num1);
		System.out.println(Math.max(num3,num4));
		num5=Math.min(num,num1);
		System.out.println(Math.min(num5,num3));

		//Write question 5 code here
	}

}
