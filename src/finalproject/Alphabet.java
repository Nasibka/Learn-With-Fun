package finalproject;
import java.io.File;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Alphabet {
        Scene scene;
        HBox box=new HBox();
        GridPane alphabetPane=new GridPane();
        ImageView arrowPane=new ImageView();
    public Alphabet(){
        Pane bkg=new Pane();
        bkg.setId("pane2");
    ImageView a=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\a.jpg"));
    ImageView b=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\b.jpg"));
    ImageView c=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\c.jpg"));
    ImageView d=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\d.jpg"));
    ImageView e=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\e.jpg"));
    ImageView f=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\f.jpg"));
    ImageView g=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\g.jpg"));
    ImageView h=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\h.jpg"));
    ImageView i=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\i.jpg"));
    ImageView j=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\j.jpg"));
    ImageView k=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\k.jpg"));
    ImageView l=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\l.jpg"));
    ImageView m=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\m.jpg"));
    ImageView n=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\n.jpg"));
    ImageView o=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\o.jpg"));
    ImageView p=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\p.jpg"));
    ImageView q=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\q.jpg"));
    ImageView r=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\r.jpg"));
    ImageView s=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\s.jpg"));
    ImageView t=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\t.jpg"));
    ImageView u=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\u.jpg"));
    ImageView v=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\v.jpg"));
    ImageView w=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\w.jpg"));
    ImageView x=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\x.jpg"));
    ImageView y=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\y.jpg"));
    ImageView z=new ImageView(new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects\\FinalProject\\src\\finalproject\\alphabet\\z.jpg"));

    a.setFitHeight(100);
    a.setFitWidth(100);
    b.setFitHeight(100);
    b.setFitWidth(100);
    c.setFitHeight(100);
    c.setFitWidth(100);
    d.setFitHeight(100);
    d.setFitWidth(100);
    e.setFitHeight(100);
    e.setFitWidth(100);
    f.setFitHeight(100);
    f.setFitWidth(100);
    g.setFitHeight(100);
    g.setFitWidth(100);
    h.setFitHeight(100);
    h.setFitWidth(100);
    i.setFitHeight(100);
    i.setFitWidth(100);
    j.setFitHeight(100);
    j.setFitWidth(100);
    k.setFitHeight(100);
    k.setFitWidth(100);
    l.setFitHeight(100);
    l.setFitWidth(100);
    m.setFitHeight(100);
    m.setFitWidth(100);
    n.setFitHeight(100);
    n.setFitWidth(100);
    o.setFitHeight(100);
    o.setFitWidth(100);
    p.setFitHeight(100);
    p.setFitWidth(100);
    q.setFitHeight(100);
    q.setFitWidth(100);
    r.setFitHeight(100);
    r.setFitWidth(100);
    s.setFitHeight(100);
    s.setFitWidth(100);
    t.setFitHeight(100);
    t.setFitWidth(100);
    u.setFitHeight(100);
    u.setFitWidth(100);
    v.setFitHeight(100);
    v.setFitWidth(100);
    w.setFitHeight(100);
    w.setFitWidth(100);
    x.setFitHeight(100);
    x.setFitWidth(100);
    y.setFitHeight(100);
    y.setFitWidth(100);
    z.setFitHeight(100);
    z.setFitWidth(100);
    
    a.setId("arrows");
    b.setId("arrows");
    c.setId("arrows");
    d.setId("arrows");
    e.setId("arrows");
    f.setId("arrows");
    g.setId("arrows");
    h.setId("arrows");
    i.setId("arrows");
    j.setId("arrows");
    k.setId("arrows");
    l.setId("arrows");
    m.setId("arrows");
    n.setId("arrows");
    o.setId("arrows");
    p.setId("arrows");
    q.setId("arrows");
    r.setId("arrows");
    s.setId("arrows");
    t.setId("arrows");
    u.setId("arrows");
    v.setId("arrows");
    w.setId("arrows");
    x.setId("arrows");
    y.setId("arrows");
    z.setId("arrows");       
    
    a.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\A.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }); 
    b.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\B.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }); 
    c.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\C.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }); 
    d.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\D.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }); 
    e.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\E.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    f.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\F.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    g.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\G.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }); 
    h.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\H.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }); 
    i.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\I.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }); 
    j.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\J.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }); 
    k.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\K.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }); 
    l.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\L.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }); 
    m.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\M.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    n.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\N.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    o.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\O.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    p.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\P.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    q.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\Q.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    r.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\R.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    s.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\S.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    t.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\T.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    u.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\U.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    v.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\V.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    w.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\W.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    x.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\X.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    y.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
               + "\\FinalProject\\src\\finalproject\\alphabet\\Y.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });
    z.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\Z.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });     l.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\L.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    });     l.setOnMouseClicked((MouseEvent event)-> {
        Media sound = new Media(new File("C:\\Users\\User\\Documents\\NetBeansProjects"
                + "\\FinalProject\\src\\finalproject\\alphabet\\L.m4a").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }); 
                
    alphabetPane.add(a,0,0);
    alphabetPane.add(b,1,0);
    alphabetPane.add(c,2,0);
    alphabetPane.add(d,3,0);
    alphabetPane.add(e,4,0);
    alphabetPane.add(f,5,0);
    alphabetPane.add(g,6,0);
    alphabetPane.add(h,0,1);
    alphabetPane.add(i,1,1);
    alphabetPane.add(j,2,1);
    alphabetPane.add(k,3,1);
    alphabetPane.add(l,4,1);
    alphabetPane.add(m,5,1);
    alphabetPane.add(n,6,1);
    alphabetPane.add(o,0,2);
    alphabetPane.add(p,1,2);
    alphabetPane.add(q,2,2);
    alphabetPane.add(r,3,2);
    alphabetPane.add(s,4,2);
    alphabetPane.add(t,5,2);
    alphabetPane.add(u,6,2);
    alphabetPane.add(v,0,3);
    alphabetPane.add(w,1,3);
    alphabetPane.add(x,2,3);
    alphabetPane.add(y,3,3);
    alphabetPane.add(z,4,3);
    
    alphabetPane.setHgap(20);
    alphabetPane.setVgap(15);
    alphabetPane.setPadding(new Insets(15,15,10,15));

    
    Image arrow = new Image("file:C:\\Users\\User\\Documents\\NetBeansProjects"
            + "\\FinalProject\\src\\finalproject\\arrowgreen.png");
    arrowPane = new ImageView(arrow);
    arrowPane.setId("arrows");
    arrowPane.setFitHeight(70);
    arrowPane.setFitWidth(100);
    box.getChildren().add(arrowPane);
    HBox.setMargin(arrowPane,new Insets(460,10,10,30));
    
    bkg.getChildren().add(box);
    bkg.getChildren().add(alphabetPane);
    scene=new Scene(bkg,850,550);
    scene.getStylesheets().addAll(
            this.getClass().getResource("style.css").toExternalForm());
        }

}
