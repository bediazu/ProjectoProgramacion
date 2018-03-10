package controladores;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author brunodiazu
 */
public class LoginController implements Initializable {
    
    @FXML
    private Pane panelLoginRegistro;

    @FXML
    private JFXButton btnRegistro;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login_usuario(MouseEvent event) {
        System.out.println("Evento: Boton Login presionado");
        
    }

    @FXML
    private void registro_usuario(MouseEvent event) throws Exception {
        System.out.println("Evento: Boton Registro presionado");
        
        //Metodo requiere de un manejo de excepcion.
        Parent registroFXML = FXMLLoader.load(getClass().getResource("/vistas/Registro.fxml"));
        
        panelLoginRegistro.getChildren().removeAll();
        panelLoginRegistro.getChildren().setAll(registroFXML);
        
        System.out.println("Accion: Escena cambiada");
        
        
        
        
    }
    
}
