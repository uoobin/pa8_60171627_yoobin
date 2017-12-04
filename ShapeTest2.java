
public class ShapeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		
		for (Shape s : shapes) {
			System.out.println("Area: " + s.getArea());
			System.out.println("Length: " + s.getLength());
		}
		
		Drawable[] drawables = new Drawable[6];
		for(int i = 0; i < shapes.length; i++) {
			drawables[i] = shapes[i];
		}
		drawables[3] = new Text("Sample Text");
		drawables[4] = new Bear(100, 100, 20);
		drawables[5] = new Circle(100, 100, 20);
		for(int i = 0; i < drawables.length-1; i++) {
			drawables[i].draw();
		}
		Shape s = (Shape)drawables[5];
	    for (int i = 0; i < 11; i++) {
	           System.out.println("Circle (" + s.x + "," + s.y + ")");
	           s.x += 10;
	           s.y += 10;
	    }
	}
}
//60171627 ������
//������ ��ǥ�� ����, �ѷ��� ������ָ� Text�� string�� ����Ѵ�.
//Bear���� rectangle�� �� 2���� ��ǥ�� ������ְ�, ���� ��ǥ�� 10�� ������Ų ��ǥ�� ����Ѵ�.