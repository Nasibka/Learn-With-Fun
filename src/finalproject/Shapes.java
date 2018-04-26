package finalproject;

import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Shapes{
    
    private LinkContent[] linkContent;
    ImageView arrowPane;
    private final StackPane content = new StackPane();
    Scene scene;
    private final StackPane arrow = new StackPane();
    boolean ch = false;
    public static void main(String[] args) {
        launch(args);
    }

    public Shapes() {

        arrowPane=new ImageView(new Image("file:C:\\Users\\User\\Documents\\"
                + "NetBeansProjects\\Good\\src\\good\\arrowgreen.png"));
        arrowPane.setId("arrows");
        arrowPane.setFitHeight(70);
        arrowPane.setFitWidth(100);
        
        linkContent = createLinkContent();

        content.setPrefWidth(700);
        
        HBox.setHgrow(content, Priority.ALWAYS);
        arrow.setPrefWidth(700);
        arrow.getChildren().setAll(arrowPane);
        HBox.setHgrow(arrow, Priority.ALWAYS);
        scene=new Scene(createLayout());
    }

    private Pane createLayout() {
        VBox layout = new VBox(
                10,
                content,
                createNavBar(),
                arrow
        );
        layout.getStylesheets().add(
                getClass().getResource("style.css").toExternalForm()
        );
        return layout;
    }
    
    private HBox createNavBar() {
        HBox nav = new HBox();
        nav.setMinHeight(150);

        nav.getStyleClass().add("navbar");

        for (int i = 0; i < linkContent.length; i++) {
            Hyperlink link = createLink(
                    "", 
                    createContentNode(linkContent[i]),
                    linkContent[i].medPl
            );
            link.getStyleClass().add("hyperlink");
            link.setGraphic(new ImageView(linkContent[i].linkImage));
            nav.getChildren().add(link);
            if (i == 0) {
                link.fire();
            }
        }
        return nav;
    }
    private Node createContentNode(LinkContent linkContent) {
        Label label = new Label(linkContent.contentText);
        label.setWrapText(true);
        HBox contentNode = new HBox(
                10,
                label,
                new ImageView(linkContent.image)
                
        );
        contentNode.getStyleClass().add("contentnode");

        return contentNode;
    }

    private Hyperlink createLink(final String linkText,
            final Node contentNode, final MediaPlayer mdPl) {
        Hyperlink link = new Hyperlink(linkText);
        link.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent event) {
                content.getChildren().setAll(
                contentNode);
                if(ch){
                    mdPl.stop();
                    mdPl.play(); 
                }
                ch = true;
            }
         });
        return link;
    }
    private static class LinkContent {
        final String contentText;
        final Image image, linkImage;
        final MediaPlayer medPl;
        LinkContent(String linkImage, String contentText, String imageLoc, String audio) {
            if(contentText == "RECTANGLE" || contentText=="OVAL"){
                this.linkImage = new Image(linkImage,130,100,false,false);
                this.contentText = contentText;
                this.image = new Image(imageLoc,130,100,false,false);
                Media sound = new Media(new File(audio).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(sound);
                this.medPl = mediaPlayer;
            }else{
                this.linkImage = new Image(linkImage,100,100,false,false);
                this.contentText = contentText;
                this.image = new Image(imageLoc,100,100,false,false);
                Media sound = new Media(new File(audio).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(sound);
                this.medPl = mediaPlayer;
            }
        }
    }

    private LinkContent[] createLinkContent() {
        return new LinkContent[] {
            new LinkContent(
                "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                        + "\\src\\finalproject\\shapes\\circle.png",
                "CIRCLE",
                "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                        + "\\src\\finalproject\\shapes\\circle.png",
                "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                        + "src\\finalproject\\shapes\\Circle.m4a"
                ),
            new LinkContent(
                "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                        + "\\src\\finalproject\\shapes\\square.png",
                "SQUARE",
                "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                        + "\\src\\finalproject\\shapes\\square.png",
                "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src"
                        + "\\finalproject\\shapes\\Square.m4a"
                ),
            new LinkContent(
                "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                        + "\\src\\finalproject\\shapes\\triangle.png",
                "TRIANGLE",
                "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                        + "\\src\\finalproject\\shapes\\triangle.png",
                "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src"
                        + "\\finalproject\\shapes\\Triangle.m4a"
                ),
            new LinkContent(
                "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                        + "src\\finalproject\\shapes\\rectangle.png",
                "RECTANGLE",
                "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                        + "src\\finalproject\\shapes\\rectangle.png",
                "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                        + "src\\finalproject\\shapes\\Rectangle.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                                + "FinalProject\\src\\finalproject\\shapes\\oval.png",
                        "OVAL",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                                + "FinalProject\\src\\finalproject\\shapes\\oval.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                                + "\\src\\finalproject\\shapes\\Oval.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                                + "FinalProject\\src\\finalproject\\shapes\\pentagon.png",
                        "PENTAGON",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                                + "FinalProject\\src\\finalproject\\shapes\\pentagon.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                                + "\\src\\finalproject\\shapes\\Pentagon.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                                + "\\src\\finalproject\\shapes\\parallelogram.png",
                        "PARALLELOGRAM",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                                + "\\src\\finalproject\\shapes\\parallelogram.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                                + "\\src\\finalproject\\shapes\\Parallelogram.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                                + "\\src\\finalproject\\shapes\\rhombus.png",
                        "RHOMBUS",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                                + "\\src\\finalproject\\shapes\\rhombus.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                                + "\\src\\finalproject\\shapes\\Rhombus.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                                + "\\src\\finalproject\\shapes\\star.png",
                        "STAR",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                                + "\\src\\finalproject\\shapes\\star.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\shapes\\Star.m4a"
                )
        };
    }
}