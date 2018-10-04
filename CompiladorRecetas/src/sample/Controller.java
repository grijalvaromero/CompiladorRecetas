package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller extends Application {
    private Stage stage;

    public void evtSalir(ActionEvent event){
        System.exit(0);
    }
    public void evtAbrir(ActionEvent event){
        FileChooser of=new FileChooser();
        of.setTitle("Abrir archivo Food Compiler yea");
        FileChooser.ExtensionFilter filtro= new FileChooser.ExtensionFilter("Archivos .food","*.food");
        of.getExtensionFilters().add(filtro);
        File file=of.showOpenDialog(stage);
    }//llave abrir

    @Override
    public void start(Stage stage) throws Exception {
        this.stage=stage;
    }
}
