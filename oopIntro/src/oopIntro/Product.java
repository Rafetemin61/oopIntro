package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Ben Çalıştım");
		
	}
	
	public Product (int id, String name, double unitPrice, String detail){
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		// bu this serisi ile atamalarını yaptık, ama neden yaptık anlamadım. bunları yapmadan da sistem doğru duruyordu, yani hata vermedi.
		
	}
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	// özellik tutan class ve iş yapan class

}
