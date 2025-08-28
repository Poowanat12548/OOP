package Lab6_2;

public class Coffee extends Product {

	  private int weight; 

	    public Coffee(int price) {
	        super(price);
	    }

	    public void setWeight(int weight) {
	        this.weight = weight;
	    }

	   
	    public String getDescription() {
	        return "Coffee " + weight + " Gram";
	    }

}
