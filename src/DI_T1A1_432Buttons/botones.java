package DI_T1A1_432Buttons;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class botones extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Creamos primer botón NEW
        Button btnNew = new Button("New");
        //Acción al pulsar botón NEW
        btnNew.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo Proceso");
            }
        });
        
        //Creamos segundo botón OPEN
        Button btnOpen = new Button("Open");
        //Acción al pulsar OPEN
        btnOpen.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir proceso");
            }
        });
        
        //Creamos tercer botón SAVE
        Button btnSave = new Button("Save");
        //Ación al pulsar SAVE
        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar proceso");
            }
        });
        
        //Creamos cuarto botón PRINT
        Button btnPrint = new Button("Print");
        //Acción al pulsar PRINT
        btnPrint.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("imprimir proceso");
            }
        });
        
        //Creamos un FlowPane
        FlowPane root = new FlowPane();
        //Indicamos la separacioón horizontal entre hijos del root
        root.setHgap(10);
        //Indicamos la separacioón vertical entre hijos del root
        root.setVgap(10);
        //Indicamos la separación con la parte superior, izquierda, inferior y derecha
        root.setPadding(new Insets(10,10,10,10));
        
        //Añadimos al root los 4 botones
        root.getChildren().add(btnNew);
        root.getChildren().add(btnOpen);
        root.getChildren().add(btnSave);
        root.getChildren().add(btnPrint);
        
        //Añadimos el root a una escena
        Scene scene = new Scene(root, 300, 50);
        
        //Indicamos el titulo de la ventana
        primaryStage.setTitle("Ejercicio 4.3.2");
        
        //Indicamos que escena tendrá la ventana
        primaryStage.setScene(scene);
        
        //Mostramos la ventana
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
