package FundamentoDiseno;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuBarra extends Application {

    @Override
    public void init() throws Exception {

        super.init();
        System.out.println("Init");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Stop");
    }
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Star");
        
        MenuBar menuBar = new MenuBar();

        BorderPane root = new BorderPane();
        root.setTop(menuBar);

        Menu Menu = new Menu("Archivo");
        Menu editar = new Menu("Editar");
        Menu ayuda = new Menu("Ayuda");

        menuBar.getMenus().addAll(Menu, editar, ayuda);

        //?Archivo


        MenuItem Nuevo = new MenuItem("Nuevo");
        MenuItem Abrir = new MenuItem("Abrir");
        MenuItem Guardar = new MenuItem("Guardar");
        MenuItem Salir = new MenuItem("Exit");

        Nuevo.setOnAction(e -> System.out.println("A seleccionado Nuevo "));
        Abrir.setOnAction(e -> System.out.println("A seleccionadoAbrir"));
        Guardar.setOnAction(e -> System.out.println("A seleccionado Guardar "));
        Salir.setOnAction(e -> System.exit(0));//salir

        
        Menu.getItems().addAll(Nuevo, Abrir, Guardar, new SeparatorMenuItem(), Salir);



        //?Editar

        MenuItem pega = new MenuItem("Pegar");
        MenuItem cortar = new MenuItem("Cortar");
        MenuItem capiar = new MenuItem("Copiar");
       
        cortar.setOnAction(e -> System.out.println("A seleccionado Cortar "));
        capiar.setOnAction(e -> System.out.println("A seleccionado Copiar "));
        pega.setOnAction(e -> System.out.println("A seleccionado Pegar"));

        editar.getItems().addAll(pega, cortar, capiar);



        //?Ayuda
    
        MenuItem aboutItem = new MenuItem("?");
        aboutItem.setOnAction(e -> System.out.println("A seleccionado Ayuda, que desea"));
        ayuda.getItems().add(aboutItem);

        // Crear el layout principal
        
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Barra de Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}