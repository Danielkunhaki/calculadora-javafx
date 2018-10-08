/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Calculadora;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author 05048173295
 */
public class HistoricoController implements Initializable {

    @FXML
    private TableView<?> tbCalculadora;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listar();
    }    
    
    public void listar() {
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
         Query query = em.createQuery("SELECT cal FROM Calculadora as cal");
        // import java.util.List;
        // import br.edu.ifro.model.Aluno;
        List<Calculadora> calculadoras = query.getResultList();
        ObservableList oCaixas = FXCollections.observableArrayList(calculadoras);                                 
        tbCalculadora.setItems(oCaixas);  
    }
    
}
