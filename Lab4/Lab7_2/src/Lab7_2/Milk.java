package Lab7_2;

public class Milk extends Product {
	private double volume;
    public Milk(double price) {
        super("Milk", price);
    }
    public void setVolumn(double v) {
        this.volume = v;
    }
}
