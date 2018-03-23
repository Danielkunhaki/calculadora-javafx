/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 05048173295
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private TextField txtNumero1, txtNumero2, txtResultado;
    @FXML
    private Button btnSoma;
            Button btnSubtrair;    
            Button bntMultiplicação;
            Button bntDivisão;
    @FXML
    private void somar(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double result;        
    
        result = num1 + num2;   
        txtResultado.setText(result.toString());    
    }
    @FXML
    private void Subtrair(ActionEvent event){
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        //num2
        Double result;
        result = (num1 - num2);
        txtResultado.setText(result.toString());
    }
    @FXML
    private void Multiplicação(ActionEvent event){
        Double num1= Double.parseDouble(txtNumero1.getText());
        Double num2= Double.parseDouble(txtNumero2).getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

}