
public class PlayBall {
	
	@SuppressWarnings("unused")
	private AiiCanvas canvas ;
	private int windowWidth;
	private int windowHeight;
	private AiiBall ball;
	private int ballDiameter = 20;
    
	/*
	 * Constructor
	 * 
	 */
	public PlayBall(AiiCanvas canvas) {       
		this.canvas = canvas;
		// windowWidth becomes the width of the playfield
		windowWidth = canvas.getWidth();
		// // windowHeight becomes the height of the playfield
		windowHeight = canvas.getHeight();
		// the ball is created and placed on the playfield
		ball = new AiiBall(windowWidth/2 - ballDiameter/2, windowHeight - ballDiameter, ballDiameter,canvas);
		ball.draw();
	    playWithBall();
	}
	
	/*
	 * the ball moves over the playfield. It can jump up and down and
	 * it can roll over the surface
	 */
	public void playWithBall()
	{
		int jumpHeight = 700;
		int rollDistance = 100;
		int direction = 5; //1 -> to the right, -1 to the left
		int counter = 0;
		
		if (jumpHeight > windowHeight) {
			jumpHeight = windowHeight;
		}
		if (rollDistance > windowWidth) {
			rollDistance = windowWidth;
		}
		
		if (direction < -1) {
			direction = -1;
			
		}
		if (direction > 1) {
			direction = 1;
		}
		
		if (direction == 0 ) {
			direction = 1;
		}
		
		if (rollDistance < 0) {
			rollDistance = 0;
		}
		
	 
		while (jumpHeight > 0) { 
			ball.jump(jumpHeight);
			jumpHeight = jumpHeight - 88;
		}
		while (counter < 5) {
			ball.roll(rollDistance, direction);
			direction = -1;
			ball.roll(rollDistance, direction);
			direction = 1;
			counter++;
			}
		}
	}
