import java.util.Scanner;

public class CustomerApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Customer cu = new Customer();
		
		String input ="1";
		
		while(input.equals("1"))
		{
		System.out.println("Please Enter Customer last name");
		String last = sc.nextLine();
		
		
		String[]vals= cu.getCustomer(last);
		for(int i=0;i<1;i++)
		{
			System.out.print("Customer Number:"+vals[11] + "\n");
			System.out.print(vals[1] +" "+ vals[0]+"\n");
			System.out.print(vals[4] +"\n");
			System.out.print(vals[5] +" "+ vals[6]+vals[7]+"\n");
			System.out.print(vals[8]+"\n");
			System.out.print(vals[9] +" at "+ vals[10]+"\n\n");
			
			
		}
		

		System.out.println("Press (1) to search for another customer or press (2) to Edit the customer's address.");
		input = sc.nextLine();
		
		if(input.equals("2"))
		{
			System.out.println("Please input desired Address. If no change enter 'N'");
			String add=sc.nextLine();
			
			if(!add.equalsIgnoreCase("N"))
			{
				vals[4]=add;
			}
			System.out.println("Please input desired City. If no change enter 'N'");
			String city=sc.nextLine();
			
			if(!city.equalsIgnoreCase("N"))
			{
				vals[5]=city;
			}
			System.out.println("Please input desired State. If no change enter 'N'");
			String state=sc.nextLine();
			
			if(!state.equalsIgnoreCase("N"))
			{
				vals[6]=state;
			}
			System.out.println("Please input desired ZIP. If no change enter 'N'");
			String zip=sc.nextLine();
			
			if(!zip.equalsIgnoreCase("N"))
			{
				vals[7]=zip;
			}
			
			cu.updateaddress(vals[3],vals[4], vals[5], vals[6], vals[7]);

		System.out.println(" The Updated result is ");
		for(int i=0;i<1;i++)
		{
			System.out.print("Customer Number:"+vals[11] + "\n");
			System.out.print(vals[1] +" "+ vals[0]+"\n");
			System.out.print(vals[4] +"\n");
			System.out.print(vals[5] +" "+ vals[6]+vals[7]+"\n");
			System.out.print(vals[8]+"\n");
			System.out.print(vals[9] +" at "+ vals[10]+"\n\n");
			
			
		}
		
		
		
		
		System.out.println("Thank You good bye!");
		
		}
		}

	}

}


