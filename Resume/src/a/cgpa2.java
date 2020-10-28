package a;

import java.text.DecimalFormat;

public class cgpa2 {

	int sem;
	double gpa,cgpa,finalcgpa;
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	cgpa2(){
		this.sem=1;
		this.gpa=3.48;
	}
	
	cgpa2(int a, double b)
	{
		this.sem=a;
		this.gpa=b;
	}
	
	public void printcgpa() {
		
		cgpa2 one=new cgpa2();
		cgpa2 two=new cgpa2(2,3.51);
		cgpa2 three=new cgpa2(3,3.44);
		
		System.out.println("GPA                  :"+one.sem+" = "+one.gpa);
		System.out.println("                      "+two.sem+" = "+two.gpa);
		System.out.println("                      "+three.sem+" = "+three.gpa);
		
		cgpa=one.gpa+two.gpa+three.gpa;
		finalcgpa=cgpa/3;
		System.out.println("CGPA                 :"+df.format(finalcgpa));
	}
	
}
