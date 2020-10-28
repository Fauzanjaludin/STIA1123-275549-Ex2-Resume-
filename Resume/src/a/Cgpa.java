package a;

public class Cgpa {
	double cgpa1 = 3.5;
	double gpa[]= {3.0,3.2,3.5,3.9};
	double sum=0;
	double finalcgpa =0;

	public void printGPA() {
		System.out.println("GPA                  :");
		for(int i=0; i<gpa.length; i++) {
		System.out.println("		      Sem "+ (i+1) +" "+ gpa[i]);
	
		}
		
	}
	public double calculateCGPA() {
		for(int i=0; i<gpa.length; i++) {
			sum+=gpa[i];
		}
		 finalcgpa = sum/gpa.length;
		 System.out.println("CGPA                 :"+ finalcgpa);
		 
		 return finalcgpa;
	}
	
}
