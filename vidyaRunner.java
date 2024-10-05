package in.nit.workshop;

public class vidyaRunner {
	public static void main(String[] args) {
		
	System.out.println("maain method isn started");
	
	// assign the value
	vidya.country="india";
    vidya.state="karnataka";
    System.out.println("state is:"+vidya.state);
	System.out.println("country is;"+vidya.country);
	
	//creat object
	vidya vi=new vidya();
	vi.personName="Rahul";
	System.out.println("person name is:"+vi .personName);
	
	

 //invoke the method{
	vidya.displyInfo();
	vi.getInformation();
	}
}