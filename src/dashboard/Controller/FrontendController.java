/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import dashboard.Entity.produits;
import javafx.collections.ObservableList;

/**
 * FXML Controller class
 *
 * @author tarek
 */
public class FrontendController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Pane pnlAcceuil,pnlEcommerce,pnlMedecins,pnlEvenements,pnlPharmacie,pnlAnnonce;
    
    @FXML
    private Button btnAcceuil,btnMedecins,btnEvenements,btnEcommerce,btnAnnonce,btnPharmacie;
    @FXML
    private TableView <produits> tableProduits;
    @FXML
    private TableColumn<produits, String> columnNom;
    @FXML
    private TableColumn<produits, String> columnDescription;
    @FXML
    private TableColumn<produits, Double> columnPrix;
    @FXML
    private TableColumn<produits, Boolean> columnDispo;
    @FXML
    private Button btnload;
    
    private ObservableList<produits>data;
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        if (event.getSource() == btnAcceuil )
        {
            pnlAcceuil.toFront();
        }
         if (event.getSource() == btnEcommerce )
        {
            pnlEcommerce.toFront();
        }
          if (event.getSource() == btnMedecins )
        {
            pnlMedecins.toFront();
        }
           if (event.getSource() == btnEvenements )
        {
            pnlEvenements.toFront();
        }
            if (event.getSource() == btnPharmacie )
        {
            pnlPharmacie.toFront();
        }
             if (event.getSource() == btnAnnonce )
        {
            pnlAnnonce.toFront();
        }
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadData(ActionEvent event) {
    }
    
}
