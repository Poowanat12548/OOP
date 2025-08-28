package Lab6_2;

public class Cashier {
	 private String name;

	    public Cashier(String name) {
	        this.name = name;
	    }

	    public void printReceipt(InventoryCart cart) {
	        System.out.println("--------------------------------");
	        System.out.println("Pumpkin Shop (" + name + ")");
	        System.out.println();

	        int total = 0;
	        for (int i = 0; i < cart.getProducts().size(); i++) {
	            Product p = cart.getProducts().get(i);
	            int q = cart.getQty().get(i);
	            int linePrice = q * p.getPrice();

	            System.out.printf("%d x %-20s %d\n", q, p.getDescription(), linePrice);
	            total += linePrice;
	        }

	        System.out.println("--------------------------------");
	        System.out.println("Total " + total + " $");
	    }
}
