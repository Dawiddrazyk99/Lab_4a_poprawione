package pl.lublin.wsei.java.cwiczenia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.lublin.wsei.java.cwiczenia.test.TestFileRead;
import pl.lublin.wsei.java.cwiczenia.test.TestInfografika;
import pl.lublin.wsei.java.cwiczenia.test.TestRegEx;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gusInfoGraphic.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        //TestFileRead.main("");
        //TestRegEx.main("");
        TestInfografika.main("");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
