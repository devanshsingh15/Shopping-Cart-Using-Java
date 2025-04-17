package java_trn.exercise;

public class ShoppingCart {
	//create object of own implemented data structure
	HashMap cart = new HashMap();
	
	//method for adding product to cart
	public void addProduct(Product obj, int q) {
		cart.put(obj, q);    
	}
	
	//method for removing the product from cart 
	public String removeProduct(Product obj) {
	   return cart.remove(obj); 
	}
	
	//method for total price of cart
	public double getTotal() {
		return cart.getCartPrice();
	}
	
	//method for printing cart items
	public void displayCart() {
		System.out.println(cart);
	}
	
}


