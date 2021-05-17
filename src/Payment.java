
public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person();
		p.setFirstName("shreya");
		p.setLastName("jain");
		p.setHourlyRate(10);
		
		System.out.println(p.toString());
		System.out.println(p.getPayment(40));
		
		
		

	}

}
