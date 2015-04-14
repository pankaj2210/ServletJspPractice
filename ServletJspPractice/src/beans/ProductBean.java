package beans;

public class ProductBean {
	
	private int productId;
	private String name;
	private String price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", name=" + name
				+ ", price=" + price + "]";
	}
	
}
