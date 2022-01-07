package Polly;

public class Betty {
public void emp(int id) {
	System.out.println("Employee id is: "+id);

}
public void emp(String name) {
	System.out.println("Employee name is: "+name);

}

	

 public static void main(String[] args) {
	Betty b=new Betty();
	b.emp(14);
	b.emp("Cooper");

			
}
}
