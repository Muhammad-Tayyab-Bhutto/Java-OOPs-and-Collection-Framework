import java.util.Scanner;

class Product {
	private String name;
	private int quantity;
	private double price;
	Scanner cs = new Scanner(System.in);

	Product(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	String getName() {
		return this.name;
	}
}

class Store {
	private String name;
	private String location;
	private Product productlist[] = new Product[3];
	private int nbProduct;

	Store(String name, String location) {
		this.name = name;
		this.location = location;
		nbProduct = 0;
	}

	String getProductName(int i) {
		if (productlist[i] != null)
			return productlist[i].getName();
		else
			return "";
	}

	String getName() {
		return this.name;
	}

	void addProduct(Product product) {
		productlist[nbProduct] = product;
		nbProduct++;
	}

	boolean searchProduct(String productname) {
		for (int i = 0; i < 3; i++) {
			if (productlist[i].getName() == productname) {
				return true;
			}
		}
		return false;

	}

	Product deleteProduct(String productname) {
		int temp = 0;
		for (int i = 0; i < 3; i++) {
			if (productlist[i].getName() == productname) {
				productlist[i] = null;
				temp = i;
			}
		}
		return productlist[temp];
	}

	void displayAll() {
		System.out.println(name + " " + location);
		for (int i = 0; i < 3; i++) {
			if (productlist[i] != null)
				System.out.println(this.productlist[i].getName());
		}
	}

}

class Company {
	private String name;
	private Store arrayStore[] = new Store[3];
	private int nbStore = 0;

	Company(String name) {
		this.name = name;
	}

	void addStore(Store store) {
		arrayStore[nbStore] = store;
		nbStore++;
	}

	int searchNbofStore(String name) {
		int t = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (arrayStore[i].getProductName(j) == name) {
					t++;
				}
			}
		}
		return t;
	}

	void displayAll() {
		System.out.println("\n\nCompany Name: " + this.name);
		for (int i = 0; i < 2; i++) {
			System.out.println("Store Name 1: " + arrayStore[i].getName());
		}

	}
}

class TestCompany {

	public static void main(String[] args) {
		Product p1 = new Product("TV", 4, 34000);
		Product p2 = new Product("Bicycle", 4, 5500);
		Product p3 = new Product("Oven", 3, 70000);

		Store s1 = new Store("Makro", "Karachi");
		Store s2 = new Store("Hypermart", "Karachi");
		s1.addProduct(p1);
		s1.addProduct(p2);
		s1.addProduct(p3);
		s1.displayAll();
		Product tempProduct = s1.deleteProduct("Bicycle");
		if (tempProduct == null)
			System.out.println("Product Bicycle is deleted");
		else
			System.out.println("There is no product to delete");
		s1.displayAll();
		s2.addProduct(p1);
		s2.addProduct(p2);
		s2.addProduct(p3);
		s2.displayAll();
		Company c1 = new Company("Unilever");
		c1.addStore(s1);
		c1.addStore(s2);
		c1.displayAll();
		int n = c1.searchNbofStore("TV");
		System.out.println("Number of stores have TV " + n);
	}
}