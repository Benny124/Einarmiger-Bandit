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
import java.util.Collections;
import java.util.Arrays;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 03.02.2022
 * @author 
 */

public class EiarmigerBandit extends Application {
  // Anfang Attribute
  private Button button1 = new Button();
  private ImageView imageView1 = new ImageView();
  private ImageView imageView2 = new ImageView();
  private ImageView imageView3 = new ImageView();
  Image gta = new Image("GTA.jpg");
  Image fortnite = new Image ("Fortnite.png");
  Image amongus = new Image ("Amongus.jpg");
  Image osu = new Image ("Osu.png");
  Image runescape = new Image ("Runescape.jpg");
  Image overwatch = new Image ("Overwatch.jpg");
  Image minecraft = new Image ("Minecraft.jpg");
  Image roblox = new Image("Roblox.png");
  Image[] games = {gta, fortnite, amongus, osu, runescape, roblox, overwatch, minecraft};
  int Geld = 100;
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 631, 705);
    // Anfang Komponenten
    
    button1.setLayoutX(246);
    button1.setLayoutY(252);
    button1.setPrefHeight(25);
    button1.setPrefWidth(75);
    button1.setOnAction(
    (event) -> {button1_Action(event);} 
    );
    imageView1.setFitWidth(100);
    imageView1.setPreserveRatio(true);
    imageView1.setLayoutX(83);
    imageView1.setLayoutY(383);
    imageView2.setFitWidth(100);
    imageView2.setPreserveRatio(true);
    imageView2.setLayoutX(259);
    imageView2.setLayoutY(383);
    imageView3.setFitWidth(100);
    imageView3.setPreserveRatio(true);
    imageView3.setLayoutX(429);
    imageView3.setLayoutY(383);
    root.getChildren().add(button1);
    root.getChildren().add(imageView1);
    root.getChildren().add(imageView2);
    root.getChildren().add(imageView3);
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
  
  public int PunkteBerechten(int a, int b, int c) {
    int[] Zahlen = {a, b, c};
    int[] Werte = new int[3];
    int max = 0;
    int Wert = 0; 
    for (int x = 0; x < 3 ; x++) {
      Wert = 0;
      for (int y = 0; y < 3 ; y++) {
        if (Zahlen[x] == Zahlen[y]) {
          Wert++;
        } // end of if
      }
      Werte[x] = Wert;
    }
    for (int i = 0; i < Werte.length; i++) {
      if (Wert < Werte[i]) {
        Wert = Werte[i];
      } // end of if
    }
    return Wert;
  }
  
  public void button1_Action(Event evt) {
    Geld = Geld - 10;
    // TODO hier Quelltext einfügen
    int a = new Random().nextInt(7);
    int b = new Random().nextInt(7);
    int c = new Random().nextInt(7);
    int Punkte = PunkteBerechten(a, b, c);
    if (Punkte == 2) {
      Geld = Geld + 10;
    } // end of if
    if (Punkte == 3) {
      Geld = Geld + 50;
    } // end of if
    System.out.println("Geld: " + Geld + "€");
    imageView1.setImage(games[a]);
    imageView2.setImage(games[b]);
    imageView3.setImage(games[c]);
  } // end of button1_Action

  // Ende Methoden
} // end of class EiarmigerBandit

