
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
//60171627 김유빈
//각각의 좌표와 넓이, 둘레를 출력해주며 Text의 string을 출력한다.
//Bear에서 rectangle과 원 2개의 좌표를 출력해주고, 원의 좌표를 10씩 증가시킨 좌표도 출력한다.