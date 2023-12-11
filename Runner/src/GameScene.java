import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;


public class GameScene extends Scene{
    private Camera camera;
    private StaticThing middle;
    private StaticThing right;
    //private StaticThing left;
    private int numberofLife = 3;
    private StaticThing heart1;
    private StaticThing heart2;
    private StaticThing heart3;
    private Hero hero;
    private long timelastrender = 0;
    private long timesincebackgroundchange = 0;



    //public StaticThing getleft(){
    //    return left;
    //}


    public StaticThing getright(){
        return right;
    }

    public StaticThing getmiddle(){
        return middle;
    }

    public GameScene(Pane pane,double width, double height, Camera camera) {
        super(pane, width, height);
        this.camera = camera;
        //this.left = new StaticThing(800,400,"desert.png");
        this.right = new StaticThing(800,400,"desert.png");
        this.middle = new StaticThing(800,400,"desert.png");
        this.heart1 = new StaticThing(27,26,"heart.png");
        this.heart2 = new StaticThing(27,26,"heart.png");
        this.heart3 = new StaticThing(27,26,"heart.png");
        this.hero = new Hero(50, 250, "heros.png", 1, 1, 100000000, 6, 75, 100, 0, 0);

        //Desert
        middle.getImageView().setX(0);
        middle.getImageView().setY(0);
        right.getImageView().setX(800);
        right.getImageView().setY(0);
        //left.getImageView().setX(-800);
        //left.getImageView().setY(0);

        // Hearts
        heart1.getImageView().setX(000);
        heart1.getImageView().setY(0);
        heart2.getImageView().setX(100);
        heart2.getImageView().setY(0);
        heart3.getImageView().setX(200);
        heart3.getImageView().setY(0);

        // Hero
        hero.getImageView().setViewport(new Rectangle2D(20,0,hero.getSizeX(),hero.getSizeY()));
        hero.getImageView().setX(hero.getX());
        hero.getImageView().setY(hero.getY());


        // Display
        pane.getChildren().addAll( middle.getImageView(), right.getImageView(), heart1.getImageView(),heart2.getImageView(), heart3.getImageView(), hero.getImageView());
        
  
        }


        public void render() {
            double cameraX = camera.getx();
            middle.getImageView().setX(-cameraX % 800);
            right.getImageView().setX(800 - cameraX % 800);
    
        }

        
       

}