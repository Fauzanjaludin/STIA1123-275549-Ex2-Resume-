package a;

import java.text.DecimalFormat;

public class cgpa2 {

	int sem;
	double[] gpa=new double[5];
	double sum,finalcgpa;
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	cgpa2(){
		this.gpa= new double[] {3.48,3.44,3.33};
		
	}
	
	public void printcgpa() {
		cgpa2 c2=new cgpa2();
		
		System.out.println("GPA                  :");
		
		for(int i=0;i<c2.gpa.length;i++) {
			System.out.println("                     :"+(i+1)+" . "+c2.gpa[i]);
			sum+=c2.gpa[i];
			
			
		}
		finalcgpa=sum/3;
		System.out.println("CGPA                 :"+df.format(finalcgpa));
		
		
		
	}
	
	
	
	
	/*
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
		
		sum=one.gpa+two.gpa+three.gpa;
		finalcgpa=sum/3;
		System.out.println("CGPA                 :"+df.format(finalcgpa));
	}
	*/
}
