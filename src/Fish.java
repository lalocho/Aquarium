//@author Luis Ochoa
//80508534
//package noapplet;
public class Fish {
    private int x, y;
    private int dx , dy ;
    private int imageLength ;
    private int imageWidth ;
    private String name;
    public Fish(int x, int y,int dx, int dy, int imageLength, int imageWidth,String name){
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.imageLength = imageLength;
        this.imageWidth = imageWidth;
        this.name = name;
    }
    public void setdx(){
        this.dx = -this.dx;
    }
    public void setdy(){
        this.dy = -this.dy;
    }
    public void update(){
        if (x < -80 || x > 500) {
            setdx();
        }
        if (y < 230 || y > 250) {
            setdy();
        }
        x += dx;
        y += dy;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public int getImageLength() {
        return imageLength;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public String getName() {
        return name;
    }
}
