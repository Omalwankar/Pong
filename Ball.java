
public class Ball {
double x;
double y;
double xv;
double yv;



	public void move() {
		x  = x+xv;
		if (x+5 >= 790)
		{
			horizontalBounce();
		}
		if (x- 5 <= 10)
		{
			horizontalBounce();
		}
		y = y+yv;
		if (y <= 490)
		{
			verticalBounce();
		}
		if (y >= 10)
		{
			verticalBounce();
		}
	}
	public void setVelocity(double newxv, double newyv) {
		xv = newxv;
		yv = newyv;
				
	}
	public void setPosition(double newx, double newy) {
		x = newx;
		y = newy;
	}
		

	public void draw() {
		Zen.setColor(255, 255, 255);
		Zen.fillOval((int)x-5, (int)y-5, 10, 10);
	}
	public Ball(int newx, int newy) {
		x = newx;
		y = newy;
	}
	public void horizontalBounce() {
		xv = -1*xv;
	}
	public void verticalBounce() {
		yv = -1*yv;
	}	
}
