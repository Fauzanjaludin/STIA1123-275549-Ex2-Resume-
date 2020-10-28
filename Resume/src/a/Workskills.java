package a;

public class Workskills {
	int no;
	String wskill;
	
	Workskills(){
		this.no=1;
		this.wskill="Public speaking";
		
	}
	
	Workskills(int a,String b){
		this.no=a;
		this.wskill=b;
		
	}
	
	public void printwskill() {
		Workskills one =new Workskills();
		Workskills two =new Workskills(2,"Great listener");
		System.out.println("Workskills           :"+one.no+". "+one.wskill);  
		System.out.println("                      "+two.no+". "+two.wskill);  
		
		
		
		
	}
	
}


