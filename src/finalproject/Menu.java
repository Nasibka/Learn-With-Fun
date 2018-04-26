package finalproject;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Menu {
    Scene scene;
    Button learnBtn=new Button("Learn!");
    Button playBtn=new Button("Play!");
    ImageView arrowPane;
    ImageView bearPane;
    VBox btnPane=new VBox();
    HBox box2=new HBox();
    public Menu(){
        Pane bkg = new Pane();
        bkg.setId("pane2");

        Image arrow = new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                + "FinalProject\\src\\finalproject\\arrowgreen.png");
        arrowPane = new ImageView(arrow);
        arrowPane.setId("arrows");
        
        Image bear = new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                + "FinalProject\\src\\finalproject\\Grizzle-kun.png");
        bearPane = new ImageView(bear);
        
        arrowPane.setFitHeight(70);
        arrowPane.setFitWidth(100);
        bearPane.setFitHeight(290);
        bearPane.setFitWidth(180);
        box2.getChildren().addAll(arrowPane,bearPane);
        HBox.setMargin(arrowPane,new Insets(460,10,10,30));
        HBox.setMargin(bearPane,new Insets(255,10,10,450));
        bkg.getChildren().add(box2);
        
        learnBtn.setId("btn");
        playBtn.setId("btn");
        btnPane.getChildren().addAll(learnBtn,playBtn);
        VBox.setMargin(learnBtn,new Insets(170,10,10,330));
        VBox.setMargin(playBtn,new Insets(0,10,10,335));
        bkg.getChildren().add(btnPane);
        
        scene=new Scene(bkg,850,550);
        scene.getStylesheets().addAll(
                this.getClass().getResource("style.css").toExternalForm());
    }
}
