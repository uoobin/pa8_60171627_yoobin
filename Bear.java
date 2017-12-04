
public class Bear extends DrawableList{
	
	public Bear(double x, double y, double r) {
		super(x, y, r);
	}
	
	public void draw() {
		System.out.println("Rectangle " + "(" + (x-r) + "," + (y-r) + ")" + "-" + "(" + (x+r) + ","+ (y+r) + ")");
		System.out.println("Circle center" + "(" +  (x-r) + "," + (y-r) + ")" + "-radius(" + (r/2) + ")");
		System.out.println("Circle center" + "(" +  (x+r) + "," + (y-r) + ")" + "-radius(" + (r/2) + ")");
	}
}

//60171627 ������
//Bear�� DrawableList���� x,y,r���� ��ӹ޾Ƽ� draw method�� �����Ų��.