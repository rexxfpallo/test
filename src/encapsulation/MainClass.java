package encapsulation;

public class MainClass {

	public static void main(String[] args) {
		vehicleregistration vc=new vehicleregistration();
		
		 vc.name="Abhishek";
		 vc.ModelName="duke250";
		 vc.setRegistrationno(212023);
		 vc.setMobileno(853890);
		 vc.setRegistrationYear(2022);
		 
		 
		 System.out.println(vc.name);
		 System.out.println(vc.ModelName);
		 System.out.println(vc.getRegistrationno());
		 System.out.println(vc.getMobileno());
		 System.out.println(vc.getRegistrationYear());
		 
		 bihar b1 =new Abhishek();
		 b1.getchesisNumber();
		 b1.getengineNumber();
		  
		 vehicleregistration vc2=new vehicleregistration();
			
		 vc2.name="Gaurav";
		 vc2.ModelName="R15";
		 vc2.setRegistrationno(456254);
		 vc2.setMobileno(654123);
		 vc2.setRegistrationYear(2017);
		 
		 
		 System.out.println(vc2.name);
		 System.out.println(vc2.ModelName);
		 System.out.println(vc2.getRegistrationno());
		 System.out.println(vc2.getMobileno());
		 System.out.println(vc2.getRegistrationYear());
		 
		 bihar b2 =new Gaurav();
		 b2.getchesisNumber();
		 b2.getengineNumber();
		 
	}

}
