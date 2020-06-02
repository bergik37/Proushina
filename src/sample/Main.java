package sample;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.stage.Stage;




public class Main extends Application  {

    @Override
    public void start(Stage primaryStage) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Расчет проушин");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
           // primaryStage.getIcons().add(new Image("background.jpg"));


        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception  {
                launch(args);




    }
}

