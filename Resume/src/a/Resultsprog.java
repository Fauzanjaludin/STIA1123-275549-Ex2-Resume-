package a;

public class Resultsprog {
	String ress;
	
	Resultsprog(){
		this.ress="A";
	}
	
	Resultsprog(String a){
		this.ress=a;
		
	}
	public void res() {
		Resultsprog rs=new Resultsprog();
		System.out.println("EXAM RESULT(STIA1113): "+rs.ress);
		
	}
	
}
