package Lab6_2;
import java.util.ArrayList;

public class InventoryCart {
	  private ArrayList<Product> products;   
	    private ArrayList<Integer> qty;        

	    public InventoryCart(int size) {
	        products = new ArrayList<>();
	        qty = new ArrayList<>();
	    }

	   
	    public void add(Product p) {
	        for (int i = 0; i < products.size(); i++) {
	            if (products.get(i).getDescription().equals(p.getDescription())) {
	                qty.set(i, qty.get(i) + 1);  // ถ้ามีแล้ว → เพิ่มจำนวน
	                return;
	            }
	        }
	        // ถ้าเป็นสินค้าใหม่
	        products.add(p);
	        qty.add(1);
	    }

	    public ArrayList<Product> getProducts() {
	        return products;
	    }

	    public ArrayList<Integer> getQty() {
	        return qty;
	    }
}
