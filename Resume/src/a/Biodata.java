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
	
	Biodata(String n,String g,String d,String a,String m,String c,String h,String p){
		this.name=n;
		this.gender=g;
		this.dob=d;
		this.age=a;
		this.marital=m;
		this.citizenship=c;
		this.homeadd=h;
		this.phoneno=p;
		
	}
	
	
	public void printbio() {
		Biodata bd=new Biodata();
		
		System.out.println("NAME                 : "+bd.name);
		System.out.println("GENDER               : "+bd.gender);
		System.out.println("DATE OF BIRTH        : "+bd.dob);
		System.out.println("AGE                  : "+bd.age);
		System.out.println("MARITAL STATUS       : "+bd.marital);
		System.out.println("CITIZENSHIP          : "+bd.citizenship);
		System.out.println("HOME ADDRESS         : "+bd.homeadd);
		System.out.println("HANDPHONE NO.        : "+bd.phoneno);
	}
	
	
}
