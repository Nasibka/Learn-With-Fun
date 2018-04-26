package finalproject;
import java.awt.event.KeyEvent;
import java.io.File;
import javafx.scene.media.*;
import javafx.scene.input.MouseEvent;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;
import javafx.stage.StageStyle;
public class MainClass extends Application {
   Stage window;
   Menu Menu= new Menu();;   
   English English= new English();
   Alphabet Alphabet=new Alphabet();
   Colors Colors=new Colors();
   Numbers Numbers=new Numbers();
   Shapes Shapes =new Shapes();
   Games Games=new Games();
    @Override
    public void start(Stage primaryStage) {
        //Music
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\"
                + "FinalProject\\src\\finalproject\\muuusic.mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
        
        window = primaryStage;        
        StackPane root = new StackPane();
        root.setId("pane"); 
        HBox box=new HBox();
        HBox box1=new HBox();

        Image door = new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                + "FinalProject\\src\\finalproject\\door.jpg");
        ImageView d = new ImageView(door);
        d.setId("door");
        
        Image close = new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\Close-icon.png");
        ImageView c = new ImageView(close);
        c.setFitHeight(35);
        c.setFitWidth(35); 
        c.setId("close");
        
        box.getChildren().add(d);
        box.getChildren().add(c);

        HBox.setMargin(d,new Insets(206,10,10,865));
        HBox.setMargin(c,new Insets(-10,10,10,-30));
        
        Image welcome = new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                + "FinalProject\\src\\finalproject\\welcome.png");
        ImageView w = new ImageView(welcome);
        BorderPane bpane=new BorderPane();
        bpane.setTop(w);
        
        
        Image arrow = new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                + "src\\finalproject\\3350-illustration-of-a-yellow-up-arrow-pv.png");
        ImageView ar = new ImageView(arrow);
        ar.setFitHeight(45);
        ar.setFitWidth(28);
        box.getChildren().add(ar);
        HBox.setMargin(ar,new Insets(300,20,10,440));
        
        root.getChildren().add(bpane);
        //root.getChildren().add(ar);
        root.getChildren().add(box1);
        root.getChildren().add(box);

        Scene scene1 = new Scene(root, 500, 500);
        
        
//Switching Scenes        
        //from door to menu
        d.setOnMouseClicked((MouseEvent event)-> {
            window.setScene(Menu.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        }); 
        //from menu to main
        Menu.arrowPane.setOnMouseClicked((MouseEvent event)-> {
            window.setScene(scene1);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
        window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
        //from menu to english
        Menu.learnBtn.setOnMouseClicked((MouseEvent event)-> {
            window.setScene(English.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
        //from menu to games
        Menu.playBtn.setOnMouseClicked((MouseEvent event)-> {
            window.setScene(Games.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
        //from english to menu
        English.arrowPane.setOnMouseClicked((MouseEvent event)-> {
            window.setScene(Menu.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
        //from english to alphabet
        English.btnAlphabet.setOnMouseClicked((MouseEvent event)-> {
            mediaPlayer.pause();
            window.setScene(Alphabet.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
        //from alphabet to english
        Alphabet.arrowPane.setOnMouseClicked((MouseEvent event)-> {
            mediaPlayer.play();
            window.setScene(English.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
        //from english to colors
        English.btnColors.setOnMouseClicked((MouseEvent event)-> {
            mediaPlayer.pause();
            window.setScene(Colors.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
//        //from colors to english
        Colors.arrowPane.setOnMouseClicked((MouseEvent event)->{
            mediaPlayer.play();
            window.setScene(English.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
        //from english to numbers
        English.btnNumbers.setOnMouseClicked((MouseEvent event)-> {
            mediaPlayer.pause();
            window.setScene(Numbers.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
        //from numbers to english
        Numbers.arrowPane.setOnMouseClicked((MouseEvent event)-> {
            mediaPlayer.play();
            window.setScene(English.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
        //from english to shapes
        English.btnShapes.setOnMouseClicked((MouseEvent event)-> {
            mediaPlayer.pause();
            window.setScene(Shapes.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
        //from shapes to english
        Shapes.arrowPane.setOnMouseClicked((MouseEvent event)-> {
            mediaPlayer.play();
            window.setScene(English.scene);
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
            window.setY((screenBounds.getHeight() - window.getHeight()) / 2);
        });
        
    //Closing the program
        //close when red button is clicked
        c.setOnMouseClicked((MouseEvent event)-> {
            window.close();
        }); 
        //close when escape is pressed
        scene1.setOnKeyPressed(ke -> {
            KeyCode keyCode = ke.getCode();
            if (keyCode.equals(KeyCode.SPACE)) {
                window.setScene(Menu.scene);
            }
        });
        
        //close when escape is pressed
        scene1.setOnKeyPressed(ke -> {
            KeyCode keyCode = ke.getCode();
            if (keyCode.equals(KeyCode.ESCAPE)) {
                window.close();
            }
        });
        //close when escape is pressed
        Alphabet.scene.setOnKeyPressed(ke -> {
            KeyCode keyCode = ke.getCode();
            if (keyCode.equals(KeyCode.ESCAPE)) {
                window.close();
            }
        });
        //close when escape is pressed
        Colors.scene.setOnKeyPressed(ke -> {
            KeyCode keyCode = ke.getCode();
            if (keyCode.equals(KeyCode.ESCAPE)) {
                window.close();
            }
        });
        //close when escape is pressed
        Menu.scene.setOnKeyPressed(ke -> {
            KeyCode keyCode = ke.getCode();
            if (keyCode.equals(KeyCode.ESCAPE)) {
                window.close();
            }
        });
        //close when escape is pressed
        English.scene.setOnKeyPressed(ke -> {
            KeyCode keyCode = ke.getCode();
            if (keyCode.equals(KeyCode.ESCAPE)) {
                window.close();
            }
        });
        //close when escape is pressed
        Numbers.scene.setOnKeyPressed(ke -> {
            KeyCode keyCode = ke.getCode();
            if (keyCode.equals(KeyCode.ESCAPE)) {
                window.close();
            }
        });
        //close when escape is pressed
        Shapes.scene.setOnKeyPressed(ke -> {
            KeyCode keyCode = ke.getCode();
            if (keyCode.equals(KeyCode.ESCAPE)) {
                window.close();
            }
        });
        //close when escape is pressed
        Games.scene.setOnKeyPressed(ke -> {
            KeyCode keyCode = ke.getCode();
            if (keyCode.equals(KeyCode.ESCAPE)) {
                window.close();
            }
        });
                
                
        scene1.getStylesheets().addAll(
                this.getClass().getResource("style.css").toExternalForm());
        window.initStyle(StageStyle.TRANSPARENT);
        window.setTitle("Learn with fun!");
        window.setScene(scene1);
        window.show();
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        window.setX((screenBounds.getWidth() - window.getWidth()) / 2); 
        window.setY((screenBounds.getHeight() - window.getHeight()) / 2);      }    
     public static void main(String[] args) { 
        launch(args); 
         }
    }   
