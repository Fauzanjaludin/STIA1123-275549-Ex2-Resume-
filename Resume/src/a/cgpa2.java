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
	
	cgpa2(double[] a){
		this.gpa= a;
	}
	
	public void printcgpa() {
		cgpa2 c2=new cgpa2();
		
		System.out.println("GPA                  :");
		
		for(int i=0;i<c2.gpa.length;i++) {
			System.out.println("                     :Sem "+(i+1)+" . "+c2.gpa[i]);
			sum+=c2.gpa[i];
			
			
		}
		finalcgpa=sum/3;
		System.out.println("CGPA                 :"+df.format(finalcgpa));
		
		
		
	}
	
	
	
	
	
}
