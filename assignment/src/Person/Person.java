package Person;

public class Person {
	int Age;
	String FirstName;
	String LastName;
	
	  public  void  getFirstName (){
        System.out.println("getFirstName");
		
	}
	  public void getLastName () {
		  System.out.println("getLastName");
	  }
	  public void getAge() {
		System.out.println("getLastName");  
	  }
	  public void setFirstName (String n) {
		  FirstName = n;
	  }
	  public void setLastName (String l) {
		 LastName = l; 
	  }
	  public void setAge(int a) {
		  Age = a;
		  if  (a<0 && a>100){
			  System.out.println("set the age field value to 0");
		  }
	  }
	  public void Teen() {
		  int x=12;
		  int y=20;
		if (x<12 && y<20){
			System.out.println("true");
		} else {
			System.out.println("false");
		} 
	  }
	  public void getFullName() {
		  System.out.println("fullName");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("fullName= ");
		System.out.println("teen= ");
		person.setFirstName("John");    
		person.setAge(18); 
		System.out.println("fullName= "); 
		System.out.println("teen= ");
		person.setLastName("Smith"); 
		System.out.println("fullName= ");  
	}

}
