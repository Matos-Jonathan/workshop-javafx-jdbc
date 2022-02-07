/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.util.Constraints;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author jonathan
 */
public class DepartmentFormController implements Initializable{
    
    @FXML
    private TextField txtId;
    
    @FXML
    private TextField txtName;
    
    @FXML
    private Label labelErrorName;
    
    @FXML
    private Button btSave;
    
    @FXML
    private Button btCancel;
    
    @FXML
    public void onBtActionSave(){
        System.out.println("onBtActionSave");
    }
    
    @FXML
    public void onBtActionCancel(){
        System.out.println("onBtActionCancel");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeNodes();
    }
    
    private void initializeNodes(){
        Constraints.setTextFieldInteger(txtId);
        Constraints.setTextFieldMaxLength(txtName, 30);
    }
    
}
