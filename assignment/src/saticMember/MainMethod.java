package saticMember;
import java.util.Scanner;
public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner myobj1=new Scanner(System.in);
     System.out.println("Enter Object 1 details ");
     
     int i1= myobj1.nextInt();
     System.out.println("Enter i1");
     int i2=myobj1.nextInt();
     System.out.println("Enter i2");
     System.out.println("i1=  i2=" +i2);
     
     Scanner myobj2=new Scanner(System.in);
     System.out.println("Enter Object 2 details");
     
     int i1=myobj2.nextInt();
     System.out.println("i1= " +  i1);
     
     int i2=myobj2.nextInt();
     System.out.println("i2=" +i2);
	}

}
