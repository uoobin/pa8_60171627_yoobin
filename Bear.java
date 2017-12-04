
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

//60171627 김유빈
//Bear은 DrawableList에서 x,y,r값을 상속받아서 draw method를 실행시킨다.