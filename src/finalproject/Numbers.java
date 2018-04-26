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

public class Numbers{
    
    private LinkContent[] linkContent;
    ImageView arrowPane;
    private final StackPane content = new StackPane();
    Scene scene;
    private final StackPane arrow = new StackPane();
    boolean ch = false;

    public Numbers() {

        linkContent = createLinkContent();
        arrowPane=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                + "Good\\src\\good\\arrowgreen.png"));
        arrowPane.setId("arrows");
        arrowPane.setFitHeight(70);
        arrowPane.setFitWidth(100);
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
            this.linkImage = new Image(linkImage,100,100,false,false);
            this.contentText = contentText;
            this.image = new Image(imageLoc,100,100,false,false);
            Media sound = new Media(new File(audio).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            this.medPl = mediaPlayer;
        }
    }

    private LinkContent[] createLinkContent() {
        return new LinkContent[] {
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                                + "FinalProject\\src\\finalproject\\numbers\\zero.png",
                        "ZERO",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject"
                                + "\\src\\finalproject\\numbers\\zero.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\Zero.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                                + "FinalProject\\src\\finalproject\\numbers\\one.png",
                        "ONE",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\one.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\One.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\"
                                + "FinalProject\\src\\finalproject\\numbers\\two.png",
                        "TWO",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\two.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\Two.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\three.png",
                        "THREE",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\three.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\Three.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\four.png",
                        "FOUR",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\four.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\Four.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\five.png",
                        "FIVE",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\five.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\Five.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\six.png",
                        "SIX",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\six.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\Six.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\seven.png",
                        "SEVEN",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\seven.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\"
                                + "finalproject\\numbers\\Seven.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\eight.png",
                        "EIGHT",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\eight.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\Eight.m4a"
                ),
                new LinkContent(
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\nine.png",
                        "NINE",
                        "file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\nine.png",
                        "C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\"
                                + "src\\finalproject\\numbers\\Nine.m4a"
                )
        };
    }
}
