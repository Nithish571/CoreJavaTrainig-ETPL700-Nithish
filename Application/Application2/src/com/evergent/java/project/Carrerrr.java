
package com.evergent.java.project;

import java.util.Scanner;
import java.util.*;

public class Carrerrr {
	enum MainModule {
		M, B, C, E
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(" ---Hello Students--- \n ---Welcome To Career Grasp---");
			System.out.println(" ---Choose your Right Career Path---");
			System.out.println("===============================================");
			System.out.println(
					" Enter M if you are an MPC Student \n Enter B if you are a BiPC Student \n Enter C if you are a CEC Student \n Enter E for Exit");
			String s = sc.next().toUpperCase();

			if (!isValidMainModule(s)) {
				System.out.println("Invalid input. Please try again.");
				continue;
			}

			switch (MainModule.valueOf(s)) {
			case M:
				handleMPC(sc);
				break;
			case B:
				handleBiPC(sc);
				break;
			case C:
				handleCEC(sc);
				break;
			case E:
				System.out.println("Exiting the program. Goodbye!");
				System.exit(0);
				break;
			}
		}
	}

	private static boolean isValidMainModule(String input) {
		try {
			MainModule.valueOf(input);
			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}
	}

	private static void handleMPC(Scanner sc) {
		System.out.println("---Welcome to MPC Dashboard---");
		System.out.println(
				"Enter 1 for Different Courses \n Enter 2 for Entrance Exams \n Enter 3 for Syllabus \n Enter 4 for Top Engineering Colleges \n Enter 5 for Career Counseling");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			showMPCCourses();
			break;
		case 2:
			showMPCExams();
			break;
		case 3:
			showMPCSyllabus();
			break;
		case 4:
			showMPCColleges(sc);
			break;
		case 5:
			showCareerCounseling("MPC");
			break;
		default:
			System.out.println("Invalid option. Please try again.");
			break;
		}
	}

	private static void handleBiPC(Scanner sc) {
		System.out.println("---Welcome to BiPC Dashboard---");
		System.out.println(
				"Enter 1 for Different Courses \n Enter 2 for Entrance Exams \n Enter 3 for Syllabus \n Enter 4 for Top Medical Colleges \n Enter 5 for Career Counseling");
		int n1 = sc.nextInt();

		switch (n1) {
		case 1:
			showBiPCCourses();
			break;
		case 2:
			showBiPCExams();
			break;
		case 3:
			showBiPCSyllabus();
			break;
		case 4:
			showBiPCColleges(sc);
			break;
		case 5:
			showCareerCounseling("BiPC");
			break;
		default:
			System.out.println("Invalid option. Please try again.");
			break;
		}
	}

	private static void handleCEC(Scanner sc) {
		System.out.println("---Welcome to CEC Dashboard---");
		System.out.println(
				"Enter 1 for Different Courses \n Enter 2 for Entrance Exams \n Enter 3 for Syllabus \n Enter 4 for Top Colleges \n Enter 5 for Career Counseling");
		int n2 = sc.nextInt();

		switch (n2) {
		case 1:
			showCECCourses();
			break;
		case 2:
			showCECExams();
			break;
		case 3:
			showCECSyllabus();
			break;
		case 4:
			showCECColleges(sc);
			break;
		case 5:
			showCareerCounseling("CEC");
			break;
		default:
			System.out.println("Invalid option. Please try again.");
			break;
		}
	}

	private static void showMPCCourses() {
		System.out.println("---Courses available for MPC are:---");
		System.out.println("1. Engineering");
		System.out.println("2. Bachelors of Science (BSc)");
		System.out.println("3. BCA");
		System.out.println("4. Architecture");
		System.out.println("5. Computer Science");
	}

	private static void showMPCExams() {
		System.out.println("---Entrance Exams for MPC are:---");
		System.out.println("1. JEE MAINS");
		System.out.println("2. JEE ADV");
		System.out.println("3. TS EAMCET");
		System.out.println("4. AP EAMCET");
		System.out.println("5. VIT EEE");
		System.out.println("6. BITSAT");
	}

	private static void showMPCSyllabus() {
		System.out.println("---Syllabus for MPC---");
		System.out.println("1. Mathematics (Algebra, Calculus, Probability, etc.)");
		System.out.println("2. Physics (Mechanics, Electromagnetism, Thermodynamics, etc.)");
		System.out.println("3. Chemistry (Organic, Inorganic, Physical Chemistry)");
		System.out.println("4. Computer Science (Programming, Data Structures, Algorithms)");
	}

	private static void showMPCColleges(Scanner sc) {
		System.out.println("---Top Engineering Colleges in India---");
		System.out.println("1. IIT Bombay");
		System.out.println("2. IIT Delhi");
		System.out.println("3. IIT Kanpur");
		System.out.println("4. NIT Trichy");
		System.out.println("5. IIIT Hyderabad");
		System.out.println("Enter the name of a college to check if it's in the top list:");
		sc.nextLine(); // Consume newline
		String college = sc.nextLine();
		if (isTopEngineeringCollege(college)) {
			System.out.println(college + " is a top engineering college.");
		} else {
			System.out.println(college + " is not in the top list.");
		}
	}

	private static void showBiPCCourses() {
		System.out.println("---Courses available for BiPC are:---");
		System.out.println("1. Medicine");
		System.out.println("2. Bachelors of Science (BSc) in Chemistry");
		System.out.println("3. Pharmacy");
		System.out.println("4. Biotechnology");
		System.out.println("5. Agriculture");
	}

	private static void showBiPCExams() {
		System.out.println("---Entrance Exams for BiPC are:---");
		System.out.println("1. NEET");
		System.out.println("2. JIPMER");
		System.out.println("3. AIIMS");
		System.out.println("4. CMC Vellore");
	}

	private static void showBiPCSyllabus() {
		System.out.println("---Syllabus for BiPC---");
		System.out.println("1. Biology (Genetics, Ecology, Evolution)");
		System.out.println("2. Zoology (Animal Physiology, Anatomy)");
		System.out.println("3. Physics (Optics, Modern Physics)");
		System.out.println("4. Chemistry (Organic, Inorganic, Physical Chemistry)");
	}

	private static void showBiPCColleges(Scanner sc) {
		System.out.println("---Top Medical Colleges in India---");
		System.out.println("1. AIIMS Delhi");
		System.out.println("2. PGIMER Chandigarh");
		System.out.println("3. JIPMER Puducherry");
		System.out.println("4. KIMS Hyderabad");
		System.out.println("5. CMC Vellore");
		System.out.println("Enter the name of a college to check if it's in the top list:");
		sc.nextLine(); // Consume newline
		String college = sc.nextLine();
		if (isTopMedicalCollege(college)) {
			System.out.println(college + " is a top medical college.");
		} else {
			System.out.println(college + " is not in the top list.");
		}
	}

	private static void showCECCourses() {
		System.out.println("---Courses available for CEC are:---");
		System.out.println("1. LAW");
		System.out.println("2. BA (Bachelor of Arts)");
		System.out.println("3. BBA (Bachelor of Business Administration)");
		System.out.println("4. B.Com (Bachelor of Commerce)");
		System.out.println("5. Hotel Management");
	}

	private static void showCECExams() {
		System.out.println("---Entrance Exams for CEC are:---");
		System.out.println("1. CLAT (Common Law Admission Test)");
		System.out.println("2. IPMAT (Integrated Program in Management Aptitude Test)");
		System.out.println("3. CUCET (Central Universities Common Entrance Test)");
		System.out.println("4. SET (Symbiosis Entrance Test)");
	}

	private static void showCECSyllabus() {
		System.out.println("---Syllabus for CEC---");
		System.out.println("1. Commerce (Accounting, Business Studies, Economics)");
		System.out.println("2. Economics (Microeconomics, Macroeconomics, Statistical Methods)");
		System.out.println("3. Civics (Indian Constitution, Political System, International Relations)");
		System.out.println("4. English (Grammar, Composition, Literature)");
	}

	private static void showCECColleges(Scanner sc) {
		System.out.println("---Top Colleges for CEC in India---");
		System.out.println("1. Osmania University");
		System.out.println("2. JNTU Hyderabad");
		System.out.println("3. Delhi University");
		System.out.println("4. Symbiosis International University");
		System.out.println("5. Loyola College, Chennai");
		System.out.println("Enter the name of a college to check if it's in the top list:");
		sc.nextLine(); // Consume newline
		String college = sc.nextLine();
		if (isTopCECCollege(college)) {
			System.out.println(college + " is a top college for CEC.");
		} else {
			System.out.println(college + " is not in the top list.");
		}
	}

	private static void showCareerCounseling(String path) {
		System.out.println("---Career Counseling---");
		System.out.println("Based on your choice of " + path + ":");
		switch (path) {
		case "MPC":
			System.out.println(
					"Consider careers in Engineering, Computer Science, or Architecture. Look into top engineering colleges and entrance exams.");
			System.out.println("For a blend of science and mathematics, explore degrees like BSc or BCA.");
			break;
		case "BiPC":
			System.out.println(
					"Explore careers in Medicine, Pharmacy, or Biotechnology. NEET is a crucial exam for medical admissions.");
			System.out.println("Consider pursuing BSc in Chemistry or pursuing a career in Agricultural Sciences.");
			break;
		case "CEC":
			System.out.println("Career options include Law, Business Administration, and Hotel Management.");
			System.out
					.println("Exams like CLAT and IPMAT can help you enter prestigious institutions for these fields.");
			break;
		}
	}

	private static boolean isTopEngineeringCollege(String college) {
		List<String> topColleges = Arrays.asList("IIT Bombay", "IIT Delhi", "IIT Kanpur", "NIT Trichy",
				"IIIT Hyderabad");
		return topColleges.contains(college);
	}

	private static boolean isTopMedicalCollege(String college) {
		List<String> topColleges = Arrays.asList("AIIMS Delhi", "PGIMER Chandigarh", "JIPMER Puducherry",
				"KIMS Hyderabad", "CMC Vellore");
		return topColleges.contains(college);
	}

	private static boolean isTopCECCollege(String college) {
		List<String> topColleges = Arrays.asList("Osmania University", "JNTU Hyderabad", "Delhi University",
				"Symbiosis International University", "Loyola College, Chennai");
		return topColleges.contains(college);
	}
}
