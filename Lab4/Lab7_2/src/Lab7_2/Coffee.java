package Lab7_2;

public class Coffee extends Product {
	 private double weight;
	    public Coffee(double price) {
	        super("Coffee", price);
	    }
	    public void setWeight(double w) {
	        this.weight = w;
	    }
}
