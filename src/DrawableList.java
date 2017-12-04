import java.util.ArrayList;

public class DrawableList implements Drawable{
	ArrayList<Drawable> dl = new ArrayList<Drawable>();
	double x,y,r;
	
	public DrawableList(double x, double y, double r) {
	this.x = x;
	this.y = y;
	this.r = r;
	}
	
	public void draw() {
	
	} 
}

//60171627 김유빈
//Drawable을 가지는 ArrayList를 생성한 후 x,y,z값을 받는다.
