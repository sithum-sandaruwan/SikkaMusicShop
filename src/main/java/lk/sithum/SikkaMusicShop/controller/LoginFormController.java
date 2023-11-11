package lk.sithum.SikkaMusicShop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Window;

public class LoginFormController {


    public Label lblTitle;

    public void btnLoginOnAction(ActionEvent actionEvent)throws Exception {

        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/main_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();

        Stage stage1 =(Stage) lblTitle.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle(" Main Form ");

        stage1.close();
        stage.show();

    }

    public void btnCreatenewOnAction(ActionEvent actionEvent)throws Exception {

        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/signup_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) lblTitle.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Sign Up");

        stage.show();
    }
}
