
public class Rectangle extends Shape {
   double a,l;
   
    public Rectangle(double x, double y, double a, double l) {
        super(x, y);
        this.a = a;
        this.l = l;
    }
    
    public double getArea() {
    	return a*l;
    }
    
    public double getLength() {
    	return 2*(a+l);
    }
    
    public void draw() {
    	System.out.println("Rectangle " + "(" + x + "," + y + ")" + "-" + "(" + (x+a) + ","+ (y+l) + ")");
    }
    
    public void move(double dx, double dy) {
    	
    }
}
//60171627 ������
//shape�� superclass�̸� x�� y�� ��ӹް�, a�� l�� ���� �޾��ش�.
//���̿� �ѷ��� �Ҽ��� ù°�ڸ����� �ݿø����ְ�, ��ǥ���� ����Ѵ�.