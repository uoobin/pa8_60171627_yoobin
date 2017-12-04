
public abstract class Shape implements Drawable, Movable {
	double x,y;

    public Shape(double x, double y) {
    this.x = x;
    this.y = y;
    }

	public double getArea() {
		return x;
	}

	public double getLength() {
		return y;
	}
}
//60171627 ������
//Drawable�� Movable�� �����ϸ�, ��ǥ�� ������ ���̿� �ѷ��� ����� �� �ִ�.