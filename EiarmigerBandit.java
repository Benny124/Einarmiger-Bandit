import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.*;
import java.util.Random;
import je.NumberField;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 03.02.2022
 * @author 
 */

public class EiarmigerBandit extends Application {
  // Anfang Attribute
  private Button bNeueRundespielen = new Button();
  private ImageView imageView1 = new ImageView();
  private ImageView imageView2 = new ImageView();
  private ImageView imageView3 = new ImageView();
  private Label lEINARMIGERBANDIT = new Label();
  private Label l = new Label();
  private NumberField nf = new NumberField();
  private TextField textField1 = new TextField();
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 631, 703);
    // Anfang Komponenten
    
    bNeueRundespielen.setLayoutX(246);
    bNeueRundespielen.setLayoutY(532);
    bNeueRundespielen.setPrefHeight(49);
    bNeueRundespielen.setPrefWidth(131);
    bNeueRundespielen.setOnAction(
      (event) -> {bNeueRundespielen_Action(event);} 
    );
    bNeueRundespielen.setText("Neue Runde spielen");
    root.getChildren().add(bNeueRundespielen);
    root.getChildren().add(imageView1);
    root.getChildren().add(imageView2);
    root.getChildren().add(imageView3);
    lEINARMIGERBANDIT.setLayoutX(243);
    lEINARMIGERBANDIT.setLayoutY(66);
    lEINARMIGERBANDIT.setPrefHeight(20);
    lEINARMIGERBANDIT.setPrefWidth(166);
    lEINARMIGERBANDIT.setText("EINARMIGER BANDIT");
    root.getChildren().add(lEINARMIGERBANDIT);
    l.setLayoutX(27);
    l.setLayoutY(163);
    l.setPrefHeight(28);
    l.setPrefWidth(46);
    l.setText("$$");
    root.getChildren().add(l);
    nf.setLayoutX(92);
    nf.setLayoutY(165);
    nf.setPrefHeight(25);
    nf.setPrefWidth(75);
    nf.setText("");
    nf.setPromptText("$");
    root.getChildren().add(nf);
    textField1.setLayoutX(22);
    textField1.setLayoutY(200);
    textField1.setPrefHeight(25);
    textField1.setPrefWidth(150);
    root.getChildren().add(textField1);
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("EiarmigerBandit");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public EiarmigerBandit
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
  public void bNeueRundespielen_Action(Event evt) {
    // TODO hier Quelltext einfügen
    Image gta = new Image("GTA.jpg");
    Image fortnite = new Image ("Fortnite.png");
    Image amongus = new Image ("Amongus.jpg");
    Image osu = new Image ("Osu.png");
    Image runescape = new Image ("Runescape.jpg");
    Image overwatch = new Image ("Overwatch.jpg");
    Image minecraft = new Image ("Minecraft.jpg");
    Image roblox = new Image("Roblox.png");
    Image[] games = {gta, fortnite, amongus, osu, runescape, roblox, overwatch, minecraft};
    int a = new Random().nextInt(7);
    int b = new Random().nextInt(7);
    int c = new Random().nextInt(7);
    imageView1.setFitWidth(100);
    imageView1.setPreserveRatio(true);
    imageView1.setLayoutX(83);
    imageView1.setLayoutY(383);
    imageView1.setImage(games[a]);
    imageView2.setFitWidth(100);
    imageView2.setPreserveRatio(true);
    imageView2.setLayoutX(259);
    imageView2.setLayoutY(383);
    imageView2.setImage(games[b]);
    imageView3.setFitWidth(100);
    imageView3.setPreserveRatio(true);
    imageView3.setLayoutX(429);
    imageView3.setLayoutY(383);
    imageView3.setImage(games[c]);
  } // end of bNeueRundespielen_Action

  // Ende Methoden
} // end of class EiarmigerBandit

