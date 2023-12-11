import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AnimatedThing{
    public double x;
    public double y;
    public ImageView image;
    public int attitude;
    public int index;
    public double frameduration;
    public int maxindex;
    public int sizeX;
    public int sizeY;
    public int offsetX;
    public int offsetY;


    public AnimatedThing(double x, double y, String path, int attitude, int index, double frameduration, int maxindex, int sizeX, int sizeY, int offsetX, int offsetY) {
        this.x = x;
        this.y = y;
        Image imageView  = new Image(path);
        this.image = new ImageView(imageView);
        this.attitude = attitude;
        this.index = index;
        this.frameduration = frameduration;
        this.maxindex = maxindex;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }
    
    public ImageView getImageView() {
        return image;
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