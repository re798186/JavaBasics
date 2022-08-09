package arrays;

import java.util.Scanner;

public class StudentRecords {

	public static void main(String[] args) {
		// TODO Auto-generateScanner sc = new Scanner(System.in);
		int arr[] = {2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==3) {
				System.out.println("found");
				break;
			}
			}
	}
public void method1(){
	Scanner sc = new Scanner(System.in);
	int arr[][] = new int[2][4];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println("Enter marks of  class" + i + "and student" + j);

			arr[i][j] = sc.nextInt();
		}
	}
	System.out.println("The marks of students are ");
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println(arr[i][j]);
		}
	}
}
public void method2(){
	Scanner sc = new Scanner(System.in);
	int arr[][] = new int[2][4];
	int q=arr[5][6];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println("Enter marks of  class" + i + "and student" + j);

			arr[i][j] = sc.nextInt();
		}
	}
	System.out.println("The marks of students are ");
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println(arr[i][j]);
		}
	}
}
public void method3(){
	Scanner sc = new Scanner(System.in);
	int arr[][] = new int[2][4];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println("Enter marks of  class" + i + "and student" + j);

			arr[i][j] = sc.nextInt();
		}
	}
	System.out.println("The marks of students are ");
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println(arr[i][j]);
		}
	}
}
}
