
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

//60171627 김유빈
//shape가 superclass이며 x와 y를 상속받고, width는 따로 받아준다.
//넓이와 둘레를 소수점 첫째자리까지 반올림해주고, 좌표들을 출력한다.