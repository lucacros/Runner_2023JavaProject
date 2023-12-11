import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AnimatedThing{
    private double x;
    private double y;
    private ImageView image;
    private int attitude;
    private int index;
    private double frameduration;
    private int maxindex;
    private int sizeX;
    private int sizeY;
    private int offsetX;
    private int offsetY;



    public AnimatedThing(double x, double y, String path, int attitude, int index, double frameDuration, int maxIndex, int sizeX, int sizeY, int offsetX, int offsetY) {
        this.x = x;
        this.y = y;
        Image imageView  = new Image(path);
        this.imageView = new ImageView(imageView);
        this.attitude = attitude;
        this.index = index;
        this.frameDuration = frameDuration;
        this.maxIndex = maxIndex;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    
    public ImageView getImage() {
        return imageView;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

}