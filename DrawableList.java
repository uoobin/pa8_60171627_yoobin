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

//60171627 ������
//Drawable�� ������ ArrayList�� ������ �� x,y,z���� �޴´�.
