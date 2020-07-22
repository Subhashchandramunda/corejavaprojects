package product;
import java.util.Scanner; 
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p;
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter the product id");
		  int id;
		    id= s.nextInt();
		    System.out.println("Enter the product name");
		    String  productName= s.next();
		    s.nextLine();
		 System.out.println("Is the product supplied by Nivas Suppliers?-yes or no");
		String t =  s.nextLine();
		if(t.equals("yes"))
		{
			p=new Product(id,productName);
			p.display1();
			System.out.println("SupplierName is Nivas");
			
		}
		else
		{
			
		System.out.println("Enter the suppliername");
		String ss=s.nextLine();
		//p.setSupplierName(ss);	
		p=new Product(id,productName,ss);
		p.display();
		}

	}


	}



