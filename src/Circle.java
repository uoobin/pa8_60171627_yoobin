
public class Circle extends Shape{
	    double r;

	    public Circle(double x, double y, double r) {
	        super(x, y);
	        this.r = r;
	    }
	 
	    public double getArea() {
	    	return (double)Math.round(Math.PI*r*r*10)/10;
	    }
	    
	    public double getLength() {
	    	return (double)Math.round(2*Math.PI*r*10)/10;
	    }
	    
	    public void draw() {
	    	System.out.println("Circle center" + "(" +  x + "," + y + ")" + "-radius(" + r + ")");
	    }
	    
		public void move(double dx, double dy) {
			
		}
}

//60171627 ������
//shape�� superclass�̸� x�� y�� ��ӹް�, r�� ���� �޾��ش�.
//���̿� �ѷ��� �Ҽ��� ù°�ڸ����� �ݿø����ְ�, ��ǥ���� ����Ѵ�.