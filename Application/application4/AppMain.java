package com.evergent.javaoops.application4;
import java.util.*;
public class AppMain extends AbsClass implements Courses {
	public void courses1() {
		System.out.println("Courses Present After 12 are: ");
		System.out.println("1.MPC \n2.Bipc \n3.CEC :");
	}

	public void recommendCourses(int marks) {
		if (marks >= 90) {
			System.out.println("You can opt for Engineering or Medicine based on your interest.");
		} else if (marks >= 75) {
			System.out.println("You can opt for Engineering or related fields.");
		} else if (marks >= 60) {
			System.out.println("You can opt for Commerce or other vocational courses.");
		} else {
			System.out.println("You might consider vocational courses or improving your skills.");
		}

	}

	public void mpcColleges() {
		System.out.println("--- Top Colleges in India---");
		System.out.println("IIT Bombay");
		System.out.println("BVRIT");
		System.out.println("IIT Kanpur");
		System.out.println("NIT Kurukshetra");
		System.out.println("NIT Rourkela");
	}

	public void bipcColleges() {
		System.out.println("--- Top  Colleges in India---");
		System.out.println("AIIMS");
		System.out.println("JIPMER");
		System.out.println("NIMS");
		System.out.println("KIMS");
	}

	public void cecColleges() {
		System.out.println("--- Top Colleges for CEC Students in India---");
		System.out.println("OU");
		System.out.println("JNTU");
		System.out.println("KIMS");
	}

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);

			AppMain a = new AppMain();
			System.out.println(
					" Enter 1 for Courses\n Enter 2 for Colleges\n Enter 3 for Entrance Exams: \n Enter 4 For Carrer Councelling ");
			System.out.println(
					" Enter 5 For Courses Recommandation According to marks :: \n Enter 6 to get Career Advice: \n Enter 7 for Check You are eligible for Scholarship or not");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				a.courses1();
				// courses.courses2();
				break;
			case 2:
				System.out.println(" Enter 1 for MPC Colleges\n Enter 2 For BiPC Colleges\n 3 Enter for CEC Colleges:");
				int k = sc.nextInt();
				switch (k) {
				case 1:
					System.out.println("Welcome to Engineering Colleges");
					a.mpcColleges();
					break;

				case 2:
					System.out.println("Welcome to Medicine Colleges");
					a.bipcColleges();
					break;
				case 3:
					System.out.println("Welcome to Commerce Colleges");
					a.cecColleges();
					break;
				}
				break;

			case 3:
				a.raj();
				int e = sc.nextInt();
				switch (e) {
				case 1:
					a.mpcEntrance();
					break;

				case 2:
					a.bipcEntrance();
					break;

				case 3:
					a.cecEntrance();
					break;
				}

				break;

			case 4:
				a.absClass();
				break;
			case 5:
				System.out.println("Enter your marks to get course recommendations:");
				int marks = sc.nextInt();
				a.recommendCourses(marks);
				break;
			case 6:
				System.out.println("Enter your marks to get career advice:");
				int careerMarks = sc.nextInt();
				a.provideCareerAdvice(careerMarks);
				break;
			case 7:
				Scholarship j=new Scholarship();
				j.famIncome();
			  //  j.rank();
				break;
				
			}
		}
	}

}
