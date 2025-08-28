package Lab6_2;

public class Milk extends Product {

	  private int volume; 

	    public Milk(int price) {
	        super(price);
	    }

	    public void setVolumn(int volume) {
	        this.volume = volume;
	    }

	   
	    public String getDescription() {
	        return "Milk " + volume + " CC";
	    }
}
