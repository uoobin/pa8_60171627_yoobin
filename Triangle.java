
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

//60171627 김유빈
//shape가 superclass이며 x와 y를 상속받고, bottom과 width는 따로 받아준다.
//넓이와 둘레를 소수점 첫째자리까지 반올림해주고, 좌표들을 출력한다.