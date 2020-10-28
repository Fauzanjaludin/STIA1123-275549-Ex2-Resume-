package a;
//test

public class main {

	public static void main(String[] args) {
		
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
