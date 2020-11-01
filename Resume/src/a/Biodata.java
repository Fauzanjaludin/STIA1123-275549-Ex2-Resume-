package a;

public class Biodata {
	//name,gender,dob,age,marital status,citizenship,home address,handphone no
	String name,gender,dob,age,marital,citizenship,homeadd,phoneno;
	
	Biodata(){
		this.name="AG MOHD FAUZAN BIN JALUDIN ";
		this.gender="MALE";
		this.dob="26 JUNE 1998";
		this.age="22 YEARS OLD";
		this.marital="SINGLE";
		this.citizenship="MALAYSIA";
		this.homeadd="JLN PADANG DAUN,PAPAR,SABAH";
		this.phoneno="01131996497";
		
	}
	
	
	public void printbio() {
		Biodata bb=new Biodata();
		
		System.out.println("NAME                 : "+bb.name);
		System.out.println("GENDER               : "+bb.gender);
		System.out.println("DATE OF BIRTH        : "+bb.dob);
		System.out.println("AGE                  : "+bb.age);
		System.out.println("MARITAL STATUS       : "+bb.marital);
		System.out.println("CITIZENSHIP          : "+bb.citizenship);
		System.out.println("HOME ADDRESS         : "+bb.homeadd);
		System.out.println("HANDPHONE NO.        : "+bb.phoneno);
	}
	
	/*
	public void name() {
		
		System.out.println("NAME                 : AG MOHD FAUZAN BIN JALUDIN ");
	}
	
	public void gender() {
		
		System.out.println("GENDER               : MALE");
	}
	
	public void dob() {
		
		System.out.println("DATE OF BIRTH        : 26 JUNE 1998 ");
	}
	
	public void age() {
		
		System.out.println("AGE                  : 22 YEARS OLD");
		
	}
	
	public void marital(){
		System.out.println("MARITAL STATUS       : SINGLE ");
		
	}
	
	public void citizenship() {
		
		System.out.println("CITIZENSHIP          : MALAYSIA ");
	}
	
	public void homeaddress() {
		
		System.out.println("HOME ADDRESS         : JLN PADANG DAUN,PAPAR,SABAH ");
		
	}
	
	public void handphoneno() {
		
		 System.out.println("HANDPHONE NO.        : 01131996497 ");
		
	}
	*/
}
