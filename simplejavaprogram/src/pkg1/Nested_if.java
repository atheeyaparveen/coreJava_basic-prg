package pkg1;

public class Nested_if {

	public static void main(String[] args) {
		
		//------- nested if statements---------
		
		//create a program to find out the grade of a students
		//marks>=90 ==> A grade
		//marks>=75 ==> B grade
		//marks>=65 ==> c grade
		//marks>=55 ==> D grade
		//marks < 40 ==> fail

		int marks = 90;
		if (marks>=90) {
			System.out.println("A Grade");}
			else if(marks>=75) {
				System.out.println("B Grade");}
			else if(marks>=65) {
		System.out.println("C Grade");}
		else if(marks>=55) {
			System.out.println("D Grade");}
		else  {
			System.out.println("Fail");}

		}
		
	}


