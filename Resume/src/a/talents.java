package a;

public class talents {
	int no;
	String tal;
	
	talents(){
		this.no=1;
		this.tal="Art";
		
	}
	
	talents(int a,String b){
		this.no=a;
		this.tal=b;
		
	}
	
	public void printtal() {
		talents one =new talents();
		talents two =new talents(2,"model making");
		System.out.println("Talents              :"+one.no+". "+one.tal);   
		System.out.println("                      "+two.no+". "+two.tal);  
		
		
		
		
	}
	
}
