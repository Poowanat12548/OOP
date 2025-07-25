package Lab3_3;

public class Lab {
	public static void main(String[] args) {
		Box b1 = new Box(3,4,5);
		
		b1.getVolume();
		b1.resizeBox(b1, 2);
		
		
		System.out.println(b1.getVolume());
	}
}
