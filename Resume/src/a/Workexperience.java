package a;

public class Workexperience {
	int no;
	String wexp;
	String location;
	
	Workexperience(){
		this.no=1;
		this.wexp="CASHIER";
		this.location="BENONI SHOP";
		
	}
	
	Workexperience(int a,String b,String c){
		this.no=a;
		this.wexp=b;
		this.location=c;
	}
	
	public void printwexp() {
		Workexperience one =new Workexperience();
		Workexperience two =new Workexperience(2,"MARKETING ADMIN","MASABAHS RENDANG");
		System.out.println("Work Experience      :"+one.no+". "+one.wexp+" At "+one.location);  
		System.out.println("                      "+two.no+". "+two.wexp+" At "+two.location);  
		
		
		
		
	}
	
}
