import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("SUPERUNNER v1.0");
        Group root = new Group();
        Pane pane = new Pane(root);
        Camera camera = new Camera(0, 0);
        GameScene gameScene = new GameScene(pane,600,400,camera);
        primaryStage.setScene(gameScene);
        primaryStage.show();

         AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                // Mise à jour de la position de la caméra à chaque itération de la boucle
                camera.setX(camera.getx() + 5); // Ajustez la valeur en fonction de la vitesse de défilement souhaitée
                gameScene.render(); // Mettre à jour la scène
            }
        };

        // Démarrez la boucle de jeu
        timer.start();
    }



    

    public static void main(String[] args) {
        launch(args);

          
    }


       
    
}


