package Balletje;

public class PlayBall {
	
	private int windowWidth;
	private int windowHeight;
	private AiiBall ball;
	private int ballDiameter = 20;
	private AiiCanvas canvas;

	public PlayBall(AiiCanvas canvas) {  
		this.canvas = canvas;
		windowWidth = canvas.getWidth();
		windowHeight = canvas.getHeight();
		
		ball = new AiiBall(windowWidth/2 - ballDiameter/2, windowHeight - ballDiameter, ballDiameter,canvas);
		ball.draw();
	    playWithBall();
		//bounceBall();
	}
	
	public void playWithBall()
	{
		int jumpHeight = 300;
		int rollDistance = 100;
		int direction = 1; //1 -> to the right, -1 to the left
		
		if (jumpHeight > windowHeight)
		{
		   jumpHeight = windowHeight;
		}
		if (rollDistance < 0)
		{
			rollDistance = 0;
		}
		if (direction < -1)
		{
			direction = -1;
		}
		if (direction > 1)
		{
			direction = 1;
		}
		if (direction == 0)
		{
			direction = 1;
		}
		
		// Uitwerking week 2b basis
		int counter = 0;
		while (jumpHeight > 0)
		{
			ball.jump(jumpHeight);
			jumpHeight = jumpHeight - 30;
			counter = counter + 1 ;
		}
		System.out.println("The ball jumped " + counter + " times");
		counter = 0;
		//rollDistance = windowWidth /2;
		while (counter < 5)
		{
			direction = 1;
		    ball.roll(rollDistance, direction);
		    direction = -1;
		    ball.roll(rollDistance, direction);
		    counter = counter + 1;
		}
	}
	
	public void bounceBall()
	{
		boolean finished =  false;
		AiiBall ball2 = new AiiBall(150,380,20,canvas);
		int xSpeed = 1;
		int ySpeed = -1;
		int xSpeed2 = -1;
		int ySpeed2 = 1;
        while(!finished) {
        	canvas.wait(10);  // small delay
            ball.move(xSpeed, ySpeed);
            
            ball2.move(xSpeed2, ySpeed2);
            
            if(ball.getXPosition() >= windowWidth - ballDiameter|| ball.getXPosition() <= 0){
            	ball.erase();
            	ball.setDiameter(ball.getDiameter()-1);
            	xSpeed = -xSpeed;
            }
            if(ball.getYPosition() >= windowHeight - ballDiameter || ball.getYPosition() <= 0 ){
            	ball.erase();
            	ball.setDiameter(ball.getDiameter()-1);
            	ySpeed = -ySpeed;
            }
            
            if(ball2.getXPosition() >= windowWidth - ballDiameter|| ball2.getXPosition() <= 0){
            	xSpeed2 = -xSpeed2;
            }
            if(ball2.getYPosition() >= windowHeight - ballDiameter || ball2.getYPosition() <= 0 ){
            	ySpeed2 = -ySpeed2;
            }
            
        }
	}

}
