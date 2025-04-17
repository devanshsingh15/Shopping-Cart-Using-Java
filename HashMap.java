package java_trn.exercise;

public class HashMap {
	
	//create structure of node
	private class Node {
		Product p;        //key
		int quantity;     //value
		Node next;        //next pointer
		
		Node(Product p, int quantity) {
			this.p = p;
			this.quantity = quantity;
		}
	}
	
	private Node[] buckets;
	private int capacity = 16;
	private float loadFactor = 0.75f;
	int size;
	
	HashMap() {
		buckets = new Node[capacity];
		size = 0;
	}
	
	//calculate index
	private int getIndex(Product p) {
		return Math.abs(p.hashCode())%capacity;
	}
	
	//method to add the element to the data structure
	public void put(Product obj, int q) {
		Product p = new Product(obj.id, obj.name, obj.price);
		int index = getIndex(p);
		Node current = buckets[index];
		while(current != null) {
			if(current.p.equals(p)) {
				current.quantity += q;
				return;
			}
			current = current.next;
		}
		Node newNode = new Node(p, q);
		newNode.next = buckets[index];
		buckets[index] = newNode;
		size++;
		if(size >= capacity*loadFactor) {
			resize();
		}
	}
	
	//method to delete the element from the data structure
	public String remove(Product obj) {
		 int index = getIndex(obj);
		    Node current = buckets[index];
		    Node prev = null;

		    while (current != null) {
		        if (current.p.equals(obj)) {
		            String temp = current.toString();
		            if (prev == null) {
		                buckets[index] = current.next;
		            } else {
		                prev.next = current.next;
		            }
		            size--;
		            return temp;
		        }
		        prev = current;
		        current = current.next;
		    }

		    return null;
	}
	
	//calculate total price of the products
	public double getCartPrice() {
		double ans = 0;
		for(Node bucket : buckets) {
			while(bucket != null) {
				ans += bucket.quantity * bucket.p.price;
				bucket = bucket.next;
			}
		}
		return ans;
	}
	
	//resize the array after reaching threshhold
	public void resize() {
		Node[] temp = buckets;
		capacity *= 2;
		buckets = new Node[capacity];
		size = 0;
		for(Node node : temp) {
			while(node != null) {
				put(node.p, node.quantity);
				node = node.next;
			}
		}
	}
	
	//override toString() method to print the cart items
	public String toString() {
		String data = "";
		for(Node bucket : buckets) {
			if(bucket != null) data += (bucket.p + ", Quantity: " + bucket.quantity + "\n");
		}
		return data;
	}
}

//structure of product
class Product {
	Integer id;
	String name;
	double price;
	
	Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	//override hashCode() method
	public int hashCode() {
		return this.id.hashCode();
	}
	
	//override equals() method to compare equality
	public boolean equals(Object obj) {
        Product p = (Product)obj;
        return p.id == this.id;
    }
	
	//override toString() to print product details
	public String toString() {
		return "Product ID: " + this.id + ", Name: " + this.name + ", Price: " + this.price;
	}
}