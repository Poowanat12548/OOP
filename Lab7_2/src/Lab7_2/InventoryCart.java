package Lab7_2;

public class InventoryCart {
	  private CartItem[] items;
	    private int count;

	    public InventoryCart(int size) {
	        items = new CartItem[size];
	        count = 0;
	    }

	    public void add(Product p) {
	        // เช็คว่ามีสินค้าแบบนี้แล้วหรือยัง
	        for (int i = 0; i < count; i++) {
	            if (items[i].product.getName().equals(p.getName())) {
	                items[i].qty++;
	                return; // เจอแล้วก็หยุด
	            }
	        }
	        // ถ้ายังไม่มีให้เพิ่มใหม่
	        items[count++] = new CartItem(p, 1);
	    }

	    public CartItem[] getItems() {
	        return items;
	    }

	    public int getCount() {
	        return count;
	    }

	    public double total() {
	        double sum = 0;
	        for (int i = 0; i < count; i++) {
	            sum += items[i].product.getPrice() * items[i].qty;
	        }
	        return sum;
	    }
}
