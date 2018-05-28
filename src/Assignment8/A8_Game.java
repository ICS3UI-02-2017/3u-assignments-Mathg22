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
    int ballSpeed1 = 5;
    //control variables
    boolean paddle1Up = false;
    boolean paddle1Down = false;
    boolean paddle2Up = false;
    boolean paddle2Down = false;
    int paddleSpeed = 5;
    //brick variables
    Rectangle[] brickLeft = new Rectangle[20];
    Rectangle[] brickRight = new Rectangle[20];
    int brickY = 5;
    int brickX = 0;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public A8_Game() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

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
        preSetup();
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
        for (int i = 0; i < brickLeft.length; i++) {
            g.setColor(Color.GREEN);
            g.fillRect(brickLeft[i].x, brickLeft[i].y, brickLeft[i].width, brickLeft[i].height);
        }
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        for (int i = 0; i < brickLeft.length; i++) {

            brickLeft[i] = new Rectangle(20, brickY, 20, 110);

            if (brickY < HEIGHT) {
                brickY = brickY + 115;
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
    }

    private void brickCollision() {
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
