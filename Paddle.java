
public class Paddle {
double x;
double y;
Player me;
Ball b;

public Paddle(Player p, Ball ball) {
	me = p;
	b = ball;
	this.x = p.x;
	this.y = p.y;
}
public void draw() {
	Zen.setColor(255, 0, 0);
	Zen.fillRect((int) x-2, (int) y-50, 4, 100);
}
public void move() {
	if (Zen.isKeyPressed(me.up) && y >= 65) {
		y = y -10;
	}
	if (Zen.isKeyPressed(me.down) && y <= 435) {
		y = y +10;
	}
	if (Math.abs(x-b.x) <= 7 && Math.abs(y-b.y) <= 50) {
		b.horizontalBounce();
		b.xv = b.xv * 1.1;
	}
	
}
public void setPosition(double newx, double newy) {
	x = newx;
	y = newy;
}

}
