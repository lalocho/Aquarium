//@author Luis Ochoa
// 80508534
//package noapplet;



import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Timer;

//import noapplet.NoApplet;

/**
 * Sample NoApplet showing a ball moving inside a rectangular box.
 * See Section 5.5.3 on pages 195-197.
 */
@SuppressWarnings("serial")
public class Aquarium extends NoApplet {

    NoApplet apl = new NoApplet();
    private Image background = apl.getImage("background.png");
    //private Image fish = apl.getImage("fish.png");
    //private Graphics offScreen;
    private Dimension dim;
    Fish test = new Fish(10,250,-2,-1,75,75,"fish.png");
    Fish test2 = new Fish(380,350,-2,-1,50,50,"fish.png");
    private Timer timer;
    private int delay = 10;

    @Override
    public void init() {
        String param = getParameter("delay");
        if (param != null) {
            delay = Integer.parseInt(param);
        }
        dim = getSize();
        timer = new Timer(delay, e -> repaint());
    }

    @Override
    public void update(Graphics g) {
        // create an off-screen image and its grapchics


        // fill the background

        g.drawImage(background,0,0,dim.width,dim.height,this);

        // adjust the position of the ball
        test.update();
        test2.update();
        reDraw(test,g);
        reDraw(test2,g);
    }

    @Override
    public void paintComponent(Graphics g) {
        update(g);
    }

    /** Start the animation. */
    @Override
    public void start() {
        timer.start();
    }

    /** Stop the animation. */
    @Override
    public void stop() {
        timer.stop();
    }
    public void reDraw(Fish test,Graphics g){

        g.drawImage(apl.getImage(test.getName()), test.getX() ,test.getY(), test.getImageWidth(),test.getImageLength(),  this);

    }
    public static void main(String[] args) {
        new Aquarium().run();
    }
}