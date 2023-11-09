package lk.sithum.SikkaMusicShop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginFormController {


    public void btnLoginOnAction(ActionEvent actionEvent)throws Exception {

        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/main_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle(" Main Form ");

        stage.show();

    }
}
