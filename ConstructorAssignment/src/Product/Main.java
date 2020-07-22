package Product;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter the product id");
		    int id;
		    id= s.nextInt();
		    System.out.println("Enter the product name");
		    String  productName= s.next();
		    System.out.println("Enter the  supplier name");
		    String  SupplierName= s.next();
		    
		    System.out.println("Product id is  " + id );
		    System.out.println("Poduct name is " + productName );
		    System.out.println("Supplier name is " + SupplierName);
	  }
	  
		}

	

