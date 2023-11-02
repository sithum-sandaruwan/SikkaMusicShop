package lk.sithum.SikkaMusicShop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class MainFormController {



    public void btnCustomerOnAction(javafx.event.ActionEvent actionEvent) throws Exception {


         Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle(" Customers ");

        stage.show();
    }

    public void btnItemOnAction(ActionEvent actionEvent)throws Exception {

        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/inventory_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle("Item");

        stage.show();
    }

    public void btnEmployeeOnAction(ActionEvent actionEvent)throws Exception {

        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/employee_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();

        stage.setScene(scene);
        stage.setTitle(" Employees ");
        stage.show();

    }
}
