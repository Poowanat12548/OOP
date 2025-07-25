package Lab3_4;

public class Vector {
	public double x , y , z;
	

		
		public Vector() {
			this.x = 0;
			this.y = 0;
			this.z = 0;
			
		}
		
		public Vector(double p1,double p2,double p3) {
			this.x = p1;
			this.y = p2;
			this.z = p3;
			
			
			
		}
		public void printVector() {
			System.out.println("(" + this.x + "," + this.y + "," + this.z + ")");
			
		}
	}


