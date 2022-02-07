package sample;

import java.util.Scanner;

public class Experiment17final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Results ob=new Results();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter roll no:");
		int n=sc.nextInt();
		ob.getrollno(n);
		System.out.println("Enter marks obtained in part 1:");
		int n1=sc.nextInt();
		System.out.println("Enter marks obtained in part 2:");
		int n2=sc.nextInt();
		ob.getmarks(n1,n2);
		ob.putno();
		ob.putmarks();
		ob.putwt();
		ob.display();
		}
	}
	interface Sports
	{
		final int sportwt=6;
		public void putwt();
	}
	class Student
	{
		int rollno;
		void getrollno(int n)
		{
			rollno=n;
		}
	void putno()
	{
		System.out.println("roll no is:"+rollno);
	}
	}
	class Test extends Student
	{
		float part1,part2;
		void getmarks(float n1,float n2) 
		{
			part1=n1;
			part2=n2;
		}
	void putmarks()
	{
		System.out.println("marks obtained:");
		System.out.println("part 1:"+part1);
		System.out.println("part 2:"+part2);
		}
	}class Results extends Test implements Sports
	{
		float tot;
		public void putwt() {
			System.out.println("sports wt:"+sportwt);
			tot=part1+part2+sportwt;
				
		}
	void display()
	{
		System.out.println("total score:"+tot);
		}
    }
