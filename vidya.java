package in.nit.workshop;

public class vidya { 
	
	//static variables
    public static String country;
    public static String state;
    
    //instance variables or non-static variables
    public String personName;
   
    
//static methods

	public static void displyInfo() {
		 System.out.println("disply mrtod is invoked");
		 
	}
	
	//non-static methods
	public void getInformation() {
		System.out.println("invoking non-static method");
	}
	
}