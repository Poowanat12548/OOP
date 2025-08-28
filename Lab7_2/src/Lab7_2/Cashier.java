package Lab7_2;

public class Cashier {
	 private double total;
	    private InventoryCart cart;
	    private Card card;

	    public void doPayment(InventoryCart cart, Card card) {
	        this.cart = cart;
	        this.card = card;
	        double sum = cart.total();
	        double discount = sum * (card.discount() / 100.0);
	        total = sum - discount;
	    }

	    public void printReceipt() {
	        System.out.println("CARD TYPE:" + card.type());
	        System.out.println("CARD NUMBER:" + card.getCardNumber());
	        System.out.println();
	        System.out.println("Pumpkin Shop");

	        for (int i = 0; i < cart.getCount(); i++) {
	            CartItem ci = cart.getItems()[i];
	            System.out.println(ci.qty + " x " + ci.product.getName() + "   " + ci.product.getPrice());
	        }

	        System.out.println("------------");
	        System.out.println("CARD DISCOUNT " + card.discount() + " %");
	        System.out.println("Total    " + total);
	    }
}
