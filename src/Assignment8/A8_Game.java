package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author mathg8825
 */
public class A8_Game extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    //paddle varaiables
    Rectangle paddle1 = new Rectangle(200, 225, 25, 150);
    Rectangle paddle2 = new Rectangle(600, 225, 25, 150);
//ball varaibles
    Rectangle ball = new Rectangle(390, 290, 20, 20);
    int ballAngle1 = 45;
    int ballSpeed1 = 4;
    //control variables
    boolean paddle1Up = false;
    boolean paddle1Down = false;
    boolean paddle2Up = false;
    boolean paddle2Down = false;
    int paddleSpeed = 8;
    //Left brick variables
    Rectangle[] brickLeft1 = new Rectangle[21];
    Rectangle[] brickLeft2 = new Rectangle[16];
    int brickLY1 = 5;
    int brickLX1 = 20;
    int brickLY2 = -40;
    int brickLX2 = 45;
    //Right brick variables
    Rectangle[] brickRight1 = new Rectangle[21];
    Rectangle[] brickRight2 = new Rectangle[16];
    int brickRY1 = 5;
    int brickRX1 = 760;
    int brickRY2 = -40;
    int brickRX2 = 735;
    

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public A8_Game() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);
preSetup();
        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE

        //set background color
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        //created paddles and ball
        g.setColor(Color.WHITE);
        g.fillRect(paddle1.x, paddle1.y, paddle1.width, paddle1.height);
        g.fillRect(paddle2.x, paddle2.y, paddle2.width, paddle2.height);
        g.fillRect(ball.x, ball.y, ball.width, ball.height);
        //created bricks on left side
        g.setColor(Color.GREEN);
        for (int i = 0; i < brickLeft1.length; i++) {
            g.fillRect(brickLeft1[i].x, brickLeft1[i].y, brickLeft1[i].width, brickLeft1[i].height);
        }
        for (int i = 0; i < brickLeft2.length; i++) {
            g.fillRect(brickLeft2[i].x, brickLeft2[i].y, brickLeft2[i].width, brickLeft2[i].height);
        }
        //created bricks on right side
        for (int i = 0; i < brickRight1.length; i++) {
            g.fillRect(brickRight1[i].x, brickRight1[i].y, brickRight1[i].width, brickRight1[i].height);
        }
        for (int i = 0; i < brickRight2.length; i++) {
            g.fillRect(brickRight2[i].x, brickRight2[i].y, brickRight2[i].width, brickRight2[i].height);
        }
        
        
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        //First column of alternating bricks on left side
        for (int i = 0; i < brickLeft1.length; i++) {

            brickLeft1[i] = new Rectangle(brickLX1, brickLY1, 20, 80);

            
                brickLY1 = brickLY1 + 85;
            
            if(brickLY1 >= HEIGHT){
                brickLY1 = 5;
                brickLX1 = brickLX1 + 50;
            }
        }
            //second column of alternating bricks on left side
            for (int a = 0; a < brickLeft2.length; a++) {

            brickLeft2[a] = new Rectangle(brickLX2, brickLY2, 20, 80);

            
                brickLY2 = brickLY2 + 85;
            
            if(brickLY2 >= HEIGHT){
                brickLY2 = -40;
                brickLX2 = brickLX2 + 50;
            }
            
        }
    
            //First column of bricks on right side
            
            for (int i = 0; i < brickRight1.length; i++) {

            brickRight1[i] = new Rectangle(brickRX1, brickRY1, 20, 80);

            
                brickRY1 = brickRY1 + 85;
            
            if(brickRY1 >= HEIGHT){
                brickRY1 = 5;
                brickRX1 = brickRX1 - 50;
            }
        }
            //second column of alternating bricks on right side
            for (int a = 0; a < brickRight2.length; a++) {

            brickRight2[a] = new Rectangle(brickRX2, brickRY2, 20, 80);

            
                brickRY2 = brickRY2 + 85;
            
            if(brickRY2 >= HEIGHT){
                brickRY2 = -40;
                brickRX2 = brickRX2 - 50;
            }
            
        }
            
            
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        ballMove();
        paddlesMove();
        paddleBallCollision();
        brickCollision();
        goal();
        
    }

    private void ballMove() {
        double newAngle = Math.toRadians(ballAngle1);
        //convert how much to move x ball 

        double moveX = ballSpeed1 * Math.cos(newAngle);
        double moveY = ballSpeed1 * Math.sin(newAngle);
        //moving the ball
        ball.x = ball.x + (int) moveX;
        ball.y = ball.y + (int) moveY;

    }

    private void paddlesMove() {
        //player one
        if (paddle1Up) {
            paddle1.y = paddle1.y - paddleSpeed;
        } else if (paddle1Down) {
            paddle1.y = paddle1.y + paddleSpeed;
        }
        if (paddle1.y < 0) {
            paddle1.y = 0;
        } else if (paddle1.y + paddle1.height > HEIGHT) {
            paddle1.y = HEIGHT - paddle1.height;
        }

        //controls player two
        if (paddle2Up) {
            paddle2.y = paddle2.y - paddleSpeed;
        } else if (paddle2Down) {
            paddle2.y = paddle2.y + paddleSpeed;
        }
        if (paddle2.y < 0) {
            paddle2.y = 0;
        } else if (paddle2.y + paddle2.height > HEIGHT) {
            paddle2.y = HEIGHT - paddle2.height;
        }

    }

    private void paddleBallCollision() {
        //collision with bottom/top
        if(ball.y <= 0 && ball.y + ball.height == paddle1.y){
            ball.x = WIDTH/2 - ball.width/2;
        ball.y = HEIGHT/2 - ball.height/2;
        
        }
        //top
        if(ball.y<0){
            ballAngle1 = ballAngle1 * -1;
        }
    //bottom
        if((ball.y + ball.height) > HEIGHT){
            ballAngle1 = ballAngle1 * -1;
        }
        //does ball hit paddle 1

        if(ball.intersects(paddle1)){
                //make sure we don't go over 360 degrees
            ballAngle1 = (180 + ballAngle1 * -1)% 360;
            
        }
        if(ball.intersects(paddle1)&& ball.y< paddle1.y 
                && ball.x < paddle1.x + paddle1.width && ball.x + ball.width > paddle1.x){               
            ball.y = paddle1.y - ball.height;
            ballAngle1 = (180 + ballAngle1 * -1)% 360;
        }
        
        //does ball hit paddle 2
        //if(b1.x > b2.x + b2.width || b1.x + b1.width < b2.x || b1.y > b2.y + b2.height||b1.y + 
        if(ball.intersects(paddle2)){
            ballAngle1 = (180 + ballAngle1 * -1) %360;
        }
        
      /*  if((ball.y <= (paddle1.y + paddle1.height) && paddle1.x < ball.x && ball.y < paddle1.width)
                || ((ball.y + ball.height >= paddle1.y) && paddle1.x < ball.x 
                && ball.y < paddle1.width)){
            ballAngle1 = ballAngle1 * -1;
        }*/
       /* if((ball.y+ball.height> paddle1.y) && (ball.y < paddle1.y+paddle1.height) 
                &&(ball.x + ball.width < paddle1.x + paddle1.width) && (ball.x >= paddle1.x) ){
           //     ball.y = paddle1.y - ball.height;
                ballAngle1 = (180 + ballAngle1 * -1)% 360;
            }*/
        
        
                
    }

    private void brickCollision() {
        /*Detect the ball hitting the first pattern of bricks on the left side 
         and make the bricks "disapear" by moving it far offscreen*/
 for(int i = 0; i< brickLeft1.length; i++){
     if(ball.intersects(brickLeft1[i])){
         brickLeft1[i].x = -1000;
         ballAngle1 = (180 + ballAngle1 * -1) %360;
     }
 }
     /*Detect the ball hitting the first pattern of bricks on the right side 
         and make the bricks "disapear" by moving it far offscreen*/
          for(int i = 0; i< brickRight1.length; i++){
     if(ball.intersects(brickRight1[i])){
         brickRight1[i].x = -1000;
         ballAngle1 = (180 + ballAngle1 * -1) %360;
     }
          }
     /*Detect the ball hitting the second pattern of bricks on the left side 
         and make the bricks "disapear" by moving it far offscreen*/
     for(int i = 0; i< brickLeft2.length; i++){
     if(ball.intersects(brickLeft2[i])){
         brickLeft2[i].x = -1000;
         ballAngle1 = (180 + ballAngle1 * -1) %360;
     }
 }
     /*Detect the ball hitting the second pattern of bricks on the right side 
         and make the bricks "disapear" by moving it far offscreen*/
          for(int i = 0; i< brickRight2.length; i++){
     if(ball.intersects(brickRight2[i])){
         brickRight2[i].x = -1000;
         ballAngle1 = (180 + ballAngle1 * -1) %360;
     }
     
     
 }
 }  
        
    

    private void goal() {
                if(ball.x<0){
       
        ball.x = WIDTH/2 - ball.width/2;
        ball.y = HEIGHT/2 - ball.height/2;
        
    }
        //ball hits right hand side
        if(ball.x + ball.width > WIDTH){
        
        ball.x = WIDTH/2 - ball.width/2;
        ball.y = HEIGHT/2 - ball.height/2;
       
    }
    }
    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getExtendedKeyCode();
//paddle 1
            if (keyCode == KeyEvent.VK_W) {
                paddle1Up = true;
            } else if (keyCode == KeyEvent.VK_S) {
                paddle1Down = true;
                //paddle 2
            }
            if (keyCode == KeyEvent.VK_UP) {
                paddle2Up = true;
            } else if (keyCode == KeyEvent.VK_DOWN) {
                paddle2Down = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getExtendedKeyCode();
            //paddle1
            if (keyCode == KeyEvent.VK_W) {
                paddle1Up = false;
            } else if (keyCode == KeyEvent.VK_S) {
                paddle1Down = false;
            }
//paddle 2

            if (keyCode == KeyEvent.VK_UP) {
                paddle2Up = false;
            } else if (keyCode == KeyEvent.VK_DOWN) {
                paddle2Down = false;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        A8_Game game = new A8_Game();
    }
}
