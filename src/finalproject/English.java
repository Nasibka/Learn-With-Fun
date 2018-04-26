package finalproject;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
public class English {
    Scene scene;
    HBox box=new HBox();
    GridPane topics=new GridPane();
    Button btnAlphabet=new Button("Alphabet");
    Button btnColors=new Button("Colors");
    Button btnNumbers=new Button("Numbers");
    Button btnShapes=new Button("Shapes");
    ImageView pane;
    ImageView arrowPane;
    public English(){
    Pane bkg=new Pane();
    bkg.setId("pane3");
    
    btnAlphabet.setId("btn");
    btnColors.setId("btn");
    btnNumbers.setId("btn");
    btnShapes.setId("btn");
    
    topics.add(btnAlphabet,0,0);
    topics.add(btnColors,0,1);
    topics.add(btnNumbers,1,0);
    topics.add(btnShapes,1,1);
    topics.setHgap(15);
    topics.setVgap(15);
    topics.setPadding(new Insets(100,10,10,100));
    box.getChildren().add(topics);

    Image arrow = new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
            + "FinalProject\\src\\finalproject\\arrowgreen.png");
    arrowPane = new ImageView(arrow);
    arrowPane.setId("arrows");
    arrowPane.setFitHeight(70);
    arrowPane.setFitWidth(100);
    box.getChildren().add(arrowPane);

    bkg.getChildren().add(box);
    HBox.setMargin(topics,new Insets(70,10,10,130));
    HBox.setMargin(arrowPane,new Insets(460,10,10,-670));

    scene=new Scene(bkg,850,550);
    scene.getStylesheets().addAll(
            this.getClass().getResource("style.css").toExternalForm());
}
    
}
