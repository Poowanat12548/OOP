package Lab6_3;

public class CommissionPay extends Employees {
	 private double grossSales;    
	    private double commissionRate; 

	    public CommissionPay(String first, String last, String ssn,
	                         double sales, double rate) {
	        super(first, last, ssn);
	        this.grossSales = sales;
	        this.commissionRate = rate;
	    }

	 
	    public String toString() {
	        return "Commission employee: " + super.toString() +
	               String.format("\ngross sales: $%.2f; commission rate: %.2f",
	                       grossSales, commissionRate);
	    }

	  
	    public double earnings() {
	        return grossSales * commissionRate;
	    }
}
