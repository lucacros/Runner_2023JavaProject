//Import JavaFX Class functions

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

// Class Arguments
public class StaticThing {
    private double sizeX;
    private double sizeY;
    public ImageView image; 

// Class Constructor
    public StaticThing(double sizeX, double sizeY, String filename){
        this.sizeX=sizeX;
        this.sizeY=sizeY;
        Image imageView = new Image(filename);
        this.image = new ImageView(imageView);

        
    }

// Getter methods
    public ImageView getImageView(){
        return image;
    }

    public double getSizeX(){
        return sizeX;
    }

    public double getSizeY(){
        return sizeY;
    }
    
}
