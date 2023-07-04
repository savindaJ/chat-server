package lk.ijse.chatServer;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AppInitializer extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/server_form.fxml"))));
        primaryStage.getIcons().add(new Image("/assets/send3D.png"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("chat server");
        primaryStage.show();
        primaryStage.setOnCloseRequest(Event::consume);
        primaryStage.centerOnScreen();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
