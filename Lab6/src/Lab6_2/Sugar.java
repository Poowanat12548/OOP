package Lab6_2;

public class Sugar extends Product {

	  private int weight; 

	    public Sugar(int price) {
	        super(price);
	    }

	    public void setWeight(int weight) {
	        this.weight = weight;
	    }

	   
	    public String getDescription() {
	        return "Suger " + weight + " Gram";
	    }

}
