/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjavafx.controlador;

import crudjavafx.modelo.Tarea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class FXMLTareaController implements Initializable {
    
    @FXML
    private TableView<?> tblDatos;

    @FXML
    private TextField txtDocumento;

    @FXML
    private Button txtInsertar;

    @FXML
    private TextField txtNombre;

    @FXML
    void btnInsertar(ActionEvent event) {
        Tarea tarea = new Tarea();
        
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
