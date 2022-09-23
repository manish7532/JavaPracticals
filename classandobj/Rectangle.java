package classandobj;

public class Rectangle {
		int l,b;
		
		public Rectangle() {
			l=12;
			b=8;
		}
      /*  public Rectangle(int length, int breadth) {
			l=length;
			b=breadth;
		}*/
        public Rectangle(int l, int b) {
			this.l=l;
			this.b=b;
		}
        public void area() 
        {
        	System.out.println("Area of rectangle "+(l*b));
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Rectangle r1 = new Rectangle();
		   r1.area();
		   Rectangle r2 = new Rectangle(15,12);
			r2.area();
	}

}
