package com.evergent.javaoops.application4;

abstract class AbsClass {
	public void absClass()
	{
		System.out.println("Carrer Councelling ");
		System.out.println(
				"Consider careers in Engineering, Computer Science, or Architecture. Look into top engineering colleges and entrance exams.");
		System.out.println("For a blend of science and mathematics, explore degrees like BSc or BCA.");
	}
	public void raj()
	{
		System.out.println("Enter 1 for Engineering Entrance Exams \n Enter 2 For Medicine Entrance Exams \n Enter 3 For Commerce Entrance Exams");
	}
    public void mpcEntrance()
    {
    	System.out.println("Welcome to MPC Entrance Exams");
    	System.out.println("---Entrance Exams :---");
		System.out.println("JEE MAINS");
		System.out.println("JEE ADV");
		System.out.println("TS EAMCET");
		System.out.println("CUET");
		System.out.println("SUAT");
    }
    public void bipcEntrance()
    {
    	System.out.println("Welcome to BiPC Entrance Exams");
    	System.out.println("---Entrance Exams Are:---");
		System.out.println("NEET");
		System.out.println("JIPMER");
		System.out.println("AIIMS");
    }
    public void cecEntrance()
    {
    	System.out.println("Welcome to CEC Entrance Exams");
    	System.out.println("---Entrance Exams Are:---");
		System.out.println("CLAT");
		System.out.println("AILET");
		System.out.println("LSAT");
    }
    public void provideCareerAdvice(int marks) {
        if (marks >= 90) {
            System.out.println("Consider high-demand career paths such as software engineering, medical sciences, or data analysis.");
        } else if (marks >= 75) {
            System.out.println("Look into careers in technology, engineering, or finance.");
        } else if (marks >= 60) {
            System.out.println("Explore careers in commerce, business management, or design.");
        } else {
            System.out.println("Consider skill-based careers or vocational training for immediate opportunities.");
        }
    }
    abstract public void mpcColleges();
    abstract public void bipcColleges();
    abstract public void cecColleges();


}
