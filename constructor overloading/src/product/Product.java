package product;

public class Product {
	private long Id;
	private String productName;
	private String supplierName ;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(long Id, String productName) {
		super();
		this.Id = Id;
		this.productName = productName;
		supplierName = "Nivas";
	}

	public Product(long Id, String productName, String supplierName) {
		super();
		this.Id = Id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	public long getId() {
		return Id;
	}
	public void setProId(long proId) {
		this.Id = proId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	void display() {
		System.out.println("Product Details:");
		System.out.println("Product Id is  "+ Id + "\nProduct Name is  "+ productName + "\nSupplier Name is "+ supplierName);
		
	}
	void display1() {
		System.out.println("Product Details:");
		System.out.println("Product Id is  "+ Id + "\nProduct Name is  "+ productName );
		
	}



}
