package java_trn.exercise;

public class ShoppingCartDriver {

	public static void main(String[] args) {
		
		//create cart to add the products
		ShoppingCart cart = new ShoppingCart();
		
		//create products to add
		Product p1 = new Product(1, "iP16Pro", 69900);
		Product p2 = new Product(2, "iPad", 56900);
		Product p3 = new Product(3, "m3Air", 109900);
		Product p4 = new Product(4, "iWatchPro", 69900);
		Product p5 = new Product(5, "airBuds", 25900);
		
		//perform desired operations
		
		//add products with desired quantity
		cart.addProduct(p1, 1);		
		cart.addProduct(p2, 1);
		cart.addProduct(p3, 2);
		cart.addProduct(p4, 1);
		cart.addProduct(p5, 3);
		
		//display the cart items
		cart.displayCart();
		//display total price of cart
		System.out.println("Total Cart Price: " + cart.getTotal());
		
		//edit products quantity
		cart.addProduct(p1, 2);
		
		//display the cart items
		cart.displayCart();	
		//display total price of cart
		System.out.println("Total Cart Price: " + cart.getTotal());
		
		cart.removeProduct(p5);
		//display the cart items
		cart.displayCart();	
		//display total price of cart
		System.out.println("Total Cart Price: " + cart.getTotal());
	}

}
