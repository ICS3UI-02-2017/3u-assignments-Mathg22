package Assignment8;

import static Assignment8.A8Q1_Face.WIDTH;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
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
public class A8Q1_Face extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Face";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    Color green = new Color(91, 214, 64);
Color skyblue = new Color(94, 202, 242);
    int eyex = 80;
    int sunx = 0;
    int sunMove = 3;
    int eyeMove = 2;
    int mouthy = 500;
    int mouthx = -1;
    int mouthh = 10;
    int movemouth = 1;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public A8Q1_Face() {
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
        frame.addKeyListener(new A8Q1_Face.Keyboard());
        A8Q1_Face.Mouse m = new A8Q1_Face.Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        //sets up the game loop
        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // GAME DRAWING GOES HERE
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        g.setColor(green);
        //custom background
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        g.setColor(skyblue);
        g.fillRect(0, 0, WIDTH, 450);
        
        g.setColor(Color.YELLOW);
        g.fillOval(sunx, 0, 125, 125);
        
        
        g.setColor(Color.WHITE);
        //(x,y,width, height
        //head
        g.fillOval(200, 100, 450, 450);
        //black patches around eyes
        g.setColor(Color.BLACK);
        g.fillOval(275, 200, 125, 125);
        g.fillOval(450, 200, 125, 125);
        //ears
        g.fillOval(525, 50, 125, 160);
        g.fillOval(200, 50, 125, 160);
        //eyes
        g.setColor(Color.WHITE);
        g.fillOval(310, 225, 60, 80);
        g.fillOval(485, 225, 60, 80);
        g.setColor(Color.BLACK);
        g.fillRect(310, 220, 60, eyex);
        //pupils
        g.fillOval(330, 250, 30, 40);
        g.fillOval(505, 250, 30, 40);
        //mouth
        g.fillArc(275, 300, 300, 200, 180, 180);
        g.setColor(Color.green);
        g.fillRect(275, mouthy, 300, mouthh);
        //nose
        g.setColor(Color.BLACK);
        int[] triangleX = {425, 400, 450};
        int[] triangleY = {350, 375, 375};
        g.drawPolygon(triangleX, triangleY, 3);
        g.setColor(Color.PINK);
        g.fillPolygon(triangleX, triangleY, 3);
        //tongue
        g.setColor(Color.RED);
        g.fillOval(425, 440, 100, 50);
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        sunx = sunx + sunMove;
        
        if(sunx > 600){
            sunMove = -3;
        }
        if(sunx < 0){
            sunMove = 3;
        }
        eyex = eyex + eyeMove;
        if(eyex> 90){
            eyeMove = -2;           
        }
        if(eyex<10){
            eyeMove = +2;
        }
        mouthy = mouthy +mouthx;
        if(mouthy< 390 ){
            mouthx = 1;
        }
        if(mouthy>490){
            mouthx = -1;
                    
        }
        mouthh = mouthh + movemouth;
        if(mouthh>120){
            movemouth = -1;
        }
        if(mouthh<0){
            movemouth = 1;
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
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        A8Q1_Face game = new A8Q1_Face();
    }
}