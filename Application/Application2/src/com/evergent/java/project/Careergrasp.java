package com.evergent.java.project;

import java.util.Scanner;

public class Careergrasp 
{
	enum MainModule 
	{
		M, B, C, E
	}

	enum MpcCategory 
	{
		COURSES, ENTRANCE_EXAMS, SYLLABUS, TOP_COLLEGES, SCHOLARSHIPS
	}

	enum BipcCategory 
	{
		COURSES, ENTRANCE_EXAMS, SYLLABUS, TOP_COLLEGES, CAREER_GUIDANCE
	}

	enum CecCategory 
	{
		COURSES, ENTRANCE_EXAMS, SYLLABUS, TOP_COLLEGES, SCHOLARSHIPS
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(" ---Hello Students--- ");

			System.out.println(" ---Welcome To Career Grasp ---");
			System.out.println(" ---Choose your Right Career Path---");

			System.out.println("===============================================");
			System.out.println(" Enter M if you are an MPC Student ");
			System.out.println(" Enter B if you are a BiPC Student ");
			System.out.println(" Enter C if you are a CEC Student ");
			System.out.println(" Enter E to Exit");

			String choice = sc.next().toUpperCase();

			MainModule mainModule = MainModule.valueOf(choice);

			switch (mainModule) {
			case M:
				handleMpcModule(sc);
				break;
			case B:
				handleBipcModule(sc);
				break;
			case C:
				handleCecModule(sc);
				break;
			case E:
				System.out.println("Thanks For Visiting Our Application!");
				System.exit(0);
				break;
			}
		}
	}

	private static void handleMpcModule(Scanner sc) {
		System.out.println("---Welcome to MPC Dashboard---");
		System.out.println("Enter 1 for Different Courses");
		System.out.println("Enter 2 for Entrance Exams");
		System.out.println("Enter 3 for Syllabus");
		System.out.println("Enter 4 for Top Engineering Colleges");
		System.out.println("Enter 5 for Scholarships");

		int choice = sc.nextInt();
		MpcCategory category = MpcCategory.values()[choice - 1];

		switch (category) {
		case COURSES:
			System.out.println("---Courses present in MPC are:---");
			System.out.println("Engineering");
			System.out.println("Bachelors Science (BSc)");
			System.out.println("BCA");
			
		 
			
			break;
		case ENTRANCE_EXAMS:
			System.out.println("---Entrance Exams For Engineering BSC and BCA:---");
			System.out.println("JEE MAINS");
			System.out.println("JEE ADV");
			System.out.println("TS EAMCET");
			System.out.println("CUET");
			System.out.println("SUAT");
			break;
			
			
		case SYLLABUS:
			System.out.println("---Syllabus---");
			System.out.println("Discrete Mathematics");
			System.out.println("Integration");
			System.out.println("Statistics");
			System.out.println("Physics");
			System.out.println("Chemistry");
			break;
			
			
		case TOP_COLLEGES:
			System.out.println("--- Top Colleges in India---");
			System.out.println("IIT Bombay");
			System.out.println("BVRIT");
			System.out.println("IIT Kanpur");
			System.out.println("NIT Kurukshetra");
			System.out.println("NIT Rourkela");
			break;
			
			
		case SCHOLARSHIPS:
			System.out.println("---Available Scholarships for MPC Students---");
			System.out.println("1. Merit-based Scholarships");
			System.out.println("2. Need-based Scholarships");
			System.out.println("3. Government Scholarships");
			break;
			
			
		}
	}

	private static void handleBipcModule(Scanner sc) {
		System.out.println("---Welcome to BiPC Dashboard---");
		System.out.println("Enter 1 for Different Courses");
		System.out.println("Enter 2 for Entrance Exams");
		System.out.println("Enter 3 for Syllabus");
		System.out.println("Enter 4 for Top Medical Colleges");
		System.out.println("Enter 5 for Career Guidance");

		int choice = sc.nextInt();
		BipcCategory category = BipcCategory.values()[choice - 1];

		switch (category) {
		case COURSES:

			System.out.println("---Courses present in BiPC are:---");
			System.out.println("Medicine");
			System.out.println("Bachelors Science (BSc) Chemistry");
			System.out.println("Pharmacy");
			break;
			
			
		case ENTRANCE_EXAMS:
			System.out.println("---Entrance Exams Are:---");
			System.out.println("NEET");
			System.out.println("JIPMER");
			System.out.println("AIIMS");
			break;
			
			
		case SYLLABUS:
			System.out.println("---Syllabus---");
			System.out.println("Biological Science");
			System.out.println("Zoology");
			System.out.println("Physics");
			System.out.println("Chemistry");
			break;
			
			
		case TOP_COLLEGES:
			System.out.println("--- Top  Colleges in India---");
			System.out.println("AIIMS");
			System.out.println("JIPMER");
			System.out.println("NIMS");
			System.out.println("KIMS");
			break;
			
			
		case CAREER_GUIDANCE:
			System.out.println("---Career Guidance for BiPC Students---");
			System.out.println("1. Explore career options in Medicine, Pharmacy, and Science.");
			System.out.println("2. Consider internships and research opportunities.");
			System.out.println("3. For More Career guidance please click Below link  \n www.bvrit.ac.in  ");
			break;
		}
	}

	private static void handleCecModule(Scanner sc) {
		System.out.println("---Welcome to CEC Dashboard---");
		System.out.println("Enter 1 for Different Courses");
		System.out.println("Enter 2 for Entrance Exams");
		System.out.println("Enter 3 for Syllabus");
		System.out.println("Enter 4 for Top Colleges");
		System.out.println("Enter 5 for Scholarships");

		int choice = sc.nextInt();
		CecCategory category = CecCategory.values()[choice - 1];

		switch (category) {
		case COURSES:
			System.out.println("---Courses present in CEC are:---");
			System.out.println("Law");
			System.out.println("BA");
			System.out.println("BBA");
			break;

		case ENTRANCE_EXAMS:
            System.out.println("---Entrance Exams Are:---");
			System.out.println("CLAT");
			System.out.println("AILET");
			System.out.println("LSAT");
			break;

			
		case SYLLABUS:
			System.out.println("---Syllabus---");
			System.out.println("Commerce");
			System.out.println("Economics");
			System.out.println("Civics");
			System.out.println("English");
			break;

			
		case TOP_COLLEGES:
			System.out.println("--- Top Colleges for CEC Students in India---");
			System.out.println("OU");
			System.out.println("JNTU");
			System.out.println("KIMS");
			break;
			
			
		case SCHOLARSHIPS:
			System.out.println("---Available Scholarships for CEC Students---");
			System.out.println("1. Merit-based Scholarships");
			System.out.println("2. Need-based Scholarships");
			System.out.println("3. Government Scholarships");
			break;
		}
	}
}
