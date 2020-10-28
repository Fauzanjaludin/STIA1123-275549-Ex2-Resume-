package a;
//test

public class main {

	public static void main(String[] args) {
		/*
		 * System.out.println("RESUME \n\r");
       System.out.println("NAME                 : AG MOHD FAUZAN BIN JALUDIN ");
       System.out.println("GENDER               : MALE");
       System.out.println("DATE OF BIRTH        : 26 JUNE 1998 ");
       System.out.println("AGE                  : 22 YEARS OLD");
       System.out.println("MARITAL STATUS       : SINGLE ");
       System.out.println("CITIZENSHIP          : MALAYSIA ");
       System.out.println("HOME ADDRESS         : JLN PADANG DAUN,PAPAR,SABAH ");
       System.out.println("HANDPHONE NO.        : 01131996497 ");
       System.out.println("EXAM RESULT(STIA1113): A  ");
       System.out.println("CGPA                 : 3.81 ");
       System.out.println("CGPA                 : " + cgpa1);
       System.out.println("WORK EXPERIENCE      : 1.MARKETING ADMIN ");
       System.out.println("                       2.CASHIER\n ");
       System.out.println("LANGUAGE             : 1.MALAY(90%) ");
       System.out.println("                       2.ENGLISH(80%) \n");
       System.out.println("PROFESSIONAL SKILLS  : 1.MS PACKAGE(90%) ");
       System.out.println("                       2.ADOBE PHOTOSHOP(60%)");
       System.out.println("                       3.VIDEO EDITING(40%)\n");
       System.out.println("AWARDS & CERTIFICATE : 1.MALAYSIAN UNIVERSITY ENGLISH TEST - BAND 4 ");
       System.out.println("                       2.POLYTECHNIC DEAN'S AWARD - SEM 2&3");
		 */
	   //biodata, work skills, work experiences, talents, programming language results, and CGPA calculation.
		Biodata b= new Biodata();//includes name,gender,dob,age,marital status,citizenship,home address,handphone no
		Resultsprog r= new Resultsprog();
		talents t= new talents();
		Workskills w1 = new Workskills();
		Workexperience w2 = new Workexperience();
		//Cgpa c=new Cgpa(); //old example
		cgpa2 c2=new cgpa2();
		
		System.out.println("RESUME \n");
		
		//biodata
		b.name();
		b.dob();
		b.age();
		b.marital();
		b.citizenship();
		b.homeaddress();
		b.handphoneno();
		
		c2.printcgpa();
		
		//c.printGPA();
		//c.calculateCGPA();
		
		r.res();
		
		t.printtal();
		w1.printwskill();
		w2.printwexp();
		
		
	}

}
