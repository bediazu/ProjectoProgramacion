package controladores;

import inicio.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author brunodiazu
 */
public class RegistroController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void volverLogin(MouseEvent event) throws Exception {
        
        System.out.println("Evento: Boton Volver presionado");
        
        //Metodo necesita manejo de excepcion
        Parent root = FXMLLoader.load(getClass().getResource("/vistas/Login.fxml"));
        Main.stage_aux.getScene().setRoot(root);
        
        System.out.println("Accion: Escena cambiada");
    }
    
}
