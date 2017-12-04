
public class Triangle extends Shape{
	double bottom, width;
	
	public Triangle(double x, double y, double bottom, double width){
		super(x, y);
		this.bottom = bottom;
		this.width = width;
	}
	
	public double getArea() {
		return bottom*width/2;
	}
	
	public void draw() {
		System.out.println("Triangle (" + x + "," + y + ")-" + "(" + (x-bottom/2) + "," + (y-width) + ")-" + "(" + (x+bottom/2) + "," + (y-width) + ")");
	}
	
	public void move(double dx, double dy) {
    	
    }
}

//60171627 ������
//shape�� superclass�̸� x�� y�� ��ӹް�, bottom�� width�� ���� �޾��ش�.
//���̿� �ѷ��� �Ҽ��� ù°�ڸ����� �ݿø����ְ�, ��ǥ���� ����Ѵ�.