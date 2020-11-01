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
		
		cgpa2 c2=new cgpa2();
		
		System.out.println("RESUME \n");
		
		
		b.printbio();
		
		c2.printcgpa();
		
		
		
		r.res();
		
		t.printtal();
		w1.printwskill();
		w2.printwexp();
		
		
	}

}
