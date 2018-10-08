package br.edu.ifro.control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.edu.ifro.model.Calculadora;

/**
 * FXML Controller class
 *
 * @author 05015429223
 */
public class PrincipalController implements Initializable {

    @FXML
    private TextField txtNum1;
    @FXML
    private TextField txtNum2;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btnSomar;
    @FXML
    private Button btnSubtrair;
    @FXML
    private Button btnDividir;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnSalvar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void somar(ActionEvent event) {
     Double num1= Double.parseDouble(txtNum1.getText());
     Double num2= Double.parseDouble(txtNum2.getText());
     Double result;
     result = num1 + num2;
     txtResultado.setText(result.toString());
    }

    @FXML
    private void subtrair(ActionEvent event) {
     Double num1= Double.parseDouble(txtNum1.getText());
     Double num2= Double.parseDouble(txtNum2.getText());
     Double result;
     result = num1 - num2;
     txtResultado.setText(result.toString());
    }

    @FXML
    private void dividir(ActionEvent event) {
     Double num1= Double.parseDouble(txtNum1.getText());
     Double num2= Double.parseDouble(txtNum2.getText());
     Double result;
     result = num1 / num2;
     txtResultado.setText(result.toString());
    }

    @FXML
    private void multiplicar(ActionEvent event) {
     Double num1= Double.parseDouble(txtNum1.getText());
     Double num2= Double.parseDouble(txtNum2.getText());
     Double result;
     result = num1 * num2;
     txtResultado.setText(result.toString());
    }

    @FXML
    private void mostrarHistorico(ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Historico.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Historico");
            stage.setScene(scene);
            stage.show();
        
        
    }

    @FXML
    private void salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Calculadora calculadora1 = new Calculadora();
        calculadora1.setNum1(txtNum1.getText());
        calculadora1.setNum2(txtNum2.getText());
        calculadora1.setResultado(txtResultado.getText());   
        
        
        em.getTransaction().begin();
        em.persist(calculadora1);
        em.getTransaction().commit();
    }
    
}