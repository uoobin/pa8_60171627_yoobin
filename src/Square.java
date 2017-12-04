
public class Square extends Shape{
	double width;
	
	public Square(double x, double y, double width) {
		super(x,y);
		this.width = width;
	}
	
	public double getArea() {
		return width*width;
	}
	
	public double getLength() {
		return 4*width;
	}
	
	public void draw() {
		System.out.println("Square " + "(" + x + "," + y + ")" + "-" + "(" + (x+width) + "," + (y+width) + ")");
	}
	
	public void move(double dx, double dy) {
    	
    }
}

//60171627 ������
//shape�� superclass�̸� x�� y�� ��ӹް�, width�� ���� �޾��ش�.
//���̿� �ѷ��� �Ҽ��� ù°�ڸ����� �ݿø����ְ�, ��ǥ���� ����Ѵ�.