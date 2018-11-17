package sample.Logica;

import javafx.scene.control.TextArea;

public class Interprete {
    TextArea txtConsola;
    public Interprete(String renglones, TextArea con){
        compilar(renglones);
        this.txtConsola=con;
    }
    private void compilar(String renglones){
        String[] r=renglones.split("\\n");
        for(int x=0;x<r.length;x++){
            if(r[x].contains("print")){
                int x1=r[x].indexOf("(");
                int x2=r[x].indexOf(")");
                String texto=r[x].substring(x1,x2);
                this.txtConsola.setText(texto);
            }//llave print

        }//llave for

    }
}
