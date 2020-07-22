package Product;

public class Product {
	private long Id;
	private String productName;
	private String supplierName ;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
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
	public void setId(long Id) {
		this.Id = Id;
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
		System.out.println("Product Id is  "+Id + "\nProduct Name is  "+ productName + "\nSupplier Name is "+ supplierName);
		
	}
	 
}


