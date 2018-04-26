package finalproject;
import java.awt.event.KeyEvent;
import java.io.File;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.media.*;
import javafx.scene.input.MouseEvent;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.StageStyle;
import javafx.util.Duration;
public class Games {
    Scene scene;
    HBox box=new HBox();
    ImageView comingSoon;
    ImageView grizzly;
    ImageView panda;
    ImageView icebear;

    public Games(){
    Pane bkg=new Pane();
    bkg.setId("pane3");
    
    comingSoon=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
            + "FinalProject\\src\\finalproject\\comingsoon,medium_large.1516929912.png"));
    comingSoon.setFitHeight(350);
    comingSoon.setFitWidth(500);
    box.getChildren().add(comingSoon);
        HBox.setMargin(comingSoon,new Insets(90,10,10,150));
        
    grizzly=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects"
            + "\\FinalProject\\src\\finalproject\\Grizzly Bear 3.png"));
    grizzly.setFitHeight(190);
    grizzly.setFitWidth(140);
    box.getChildren().add(grizzly);
        HBox.setMargin(grizzly,new Insets(315,10,10,-600));
        
    panda=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects"
            + "\\FinalProject\\src\\finalproject\\panda.png"));
    panda.setFitHeight(190);
    panda.setFitWidth(100);
    box.getChildren().add(panda);
        HBox.setMargin(panda,new Insets(360,10,10,50));
        
    icebear=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects"
            + "\\FinalProject\\src\\finalproject\\icebear.png"));
    icebear.setFitHeight(150);
    icebear.setFitWidth(180);
    box.getChildren().add(icebear);
        HBox.setMargin(icebear,new Insets(375,10,10,150));
        

        FadeTransition ft =new FadeTransition(Duration.millis(3000), comingSoon);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();
    
    bkg.getChildren().add(box);

    scene = new Scene(bkg,850,550);
    scene.getStylesheets().addAll(
            this.getClass().getResource("style.css").toExternalForm());
    
}
}