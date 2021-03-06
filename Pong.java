
public class Pong {
static Ball ball;
static Paddle p1;
static Paddle p2;
static Player player1;
static Player player2;

	public static void main(String[] args) {
		Zen.create(800, 500);
		ball = new Ball (400,250);
		player1 = new Player(1);
		player2 = new Player(2);
		p1 = new Paddle(player1, ball);
		p2 = new Paddle(player2, ball);
		
		
		ball.setVelocity(5,Math.random() * 10 - 5);
		while (true) {
			draw();
			ball.move();
			// Check if the ball is out of bounds
			p1.move();
			p2.move();
			Zen.flipBuffer();
			Zen.sleep(33);
		}
		
	}
	public static void draw() {
		Zen.setColor(0, 0, 255);
		Zen.fillRect(0, 0, 10, 500);
		Zen.fillRect(790, 0, 10, 500);
		Zen.fillRect(0, 490, 800, 10);
		Zen.fillRect(0, 0, 800, 10);
		Zen.fillRect(390, 0, 10, 500);
		Zen.setColor(255, 255, 255);
		Zen.setFont("Helvetica-30");
		Zen.drawText(Integer.toString(player1.score), 365, 35);
		Zen.drawText(Integer.toString(player2.score), 415, 35);
		ball.draw();
		p1.draw();
		p2.draw();
	}

}
