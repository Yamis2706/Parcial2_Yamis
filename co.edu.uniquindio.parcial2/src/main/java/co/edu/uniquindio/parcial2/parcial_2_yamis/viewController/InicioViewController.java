package co.edu.uniquindio.parcial2.parcial_2_yamis.viewController;

import co.edu.uniquindio.parcial2.parcial_2_yamis.HelloApplication;
import co.edu.uniquindio.parcial2.parcial_2_yamis.controller.InicioController;
import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.ClienteDto;
import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.ObjetoDto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class InicioViewController implements Initializable {

    private InicioController inicioController;

    private ObservableList<ObjetoDto> listaObjetos =
            FXCollections.observableArrayList();

    private ObservableList<ClienteDto> listaClientes =
            FXCollections.observableArrayList();

    @FXML
    private Button btnBuscar;

    @FXML
    private TableView<ObjetoDto> tablaObjetos;

    @FXML
    private TableView<ClienteDto> tablaClientes;

    @FXML
    private TableColumn<ClienteDto, String> tcCedula;

    @FXML
    private TableColumn<ClienteDto, String> tcNombreCliente;

    @FXML
    private TableColumn<ClienteDto, String> tcApellido;

    @FXML
    private TableColumn<ClienteDto, String> tcEdad;

    @FXML
    private TableColumn<ObjetoDto, String> tcId;

    @FXML
    private TableColumn<ObjetoDto, String> tcNombreObjeto;

    @FXML
    private TableColumn<ObjetoDto, String> tcVecesPrestado;

    @FXML
    private TableColumn<ObjetoDto, String> tcDisponible;

    @FXML
    private TextField txtIdObjeto;

    @FXML
    private TextField txtRangoClientes;

    @FXML
    private TextField txtRangoPrestamos;

    @FXML
    private TextField txtCedulaCliente;

    @FXML
    void onBuscarObjeto(ActionEvent event) {
        //System.out.println("botón");
        String id = txtIdObjeto.getText();
        ObjetoDto informacionObjeto =
                inicioController.mostrarInformacionObjeto(id);

        if(informacionObjeto==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("No existe un objeto con el id dado");
            alert.setTitle("Información del objeto");
            alert.show();
        }else{
            tablaObjetos.setItems(FXCollections.observableArrayList(List.of(informacionObjeto)));
        }

    }

    @FXML
    void onObtenerObjetos(ActionEvent event) {
        int rango =Integer.parseInt(txtRangoPrestamos.getText());
        List<ObjetoDto> objetos = inicioController.obtenerObjetosMasPrestados(rango);
        tablaObjetos.setItems( FXCollections.observableArrayList(objetos) );
    }

    @FXML
    void onObtenerClientes(ActionEvent event) {
        int rango =Integer.parseInt(txtRangoClientes.getText());
        List<ClienteDto> clientes =
                inicioController.obtenerClientesMasPrestamos(rango);
        tablaClientes.setItems( FXCollections.observableArrayList(clientes) );
    }


    /*
    @FXML
    void onObtenerObjetos(ActionEvent event) {
        int rango =Integer.parseInt(txtRangoPrestamos.getText());
        List<ObjetoDto> objetos =
                inicioController.obtenerObjetosMasPrestados(rango);
        tablaObjetos.setItems( FXCollections.observableArrayList(objetos) );
    }

     */


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        inicioController = new InicioController();
        initViewObjetos();
        initViewClientes();
    }

    private void initViewObjetos() {
        initDataBindingObjetos();
        tablaObjetos.getItems().clear();
        tablaObjetos.setItems(listaObjetos);
        //listenerSelection();
    }

    private void initViewClientes() {
        initDataBindingClientes();
        tablaClientes.getItems().clear();
        tablaClientes.setItems(listaClientes);
        //listenerSelection();
    }

    /*private void listarObjetos() {
        listaObjetos.addAll(objetoController.listarVendedores());
    }*/

    private void initDataBindingObjetos() {
        tcId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().id()));
        tcNombreObjeto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombre()));
        tcVecesPrestado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().vecesPrestado()));
        tcDisponible.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().disponible()));
    }

    private void initDataBindingClientes() {
        tcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().cedula()));
        tcNombreCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombre()));
        tcApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().apellido()));
        tcEdad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().edad()));
    }

    public void onBuscarPrestamos(ActionEvent actionEvent) {

        try {

            String cedulaCliente = txtCedulaCliente.getText();

            if(cedulaCliente == null || cedulaCliente.isEmpty()){
                return;
            }

            FXMLLoader fxmlLoader =
                    new FXMLLoader(HelloApplication.class.getResource("Cliente" +
                            ".fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(fxmlLoader.load(), 750, 500);

            ClienteViewController controller = fxmlLoader.getController();
            controller.listarPrestamos(cedulaCliente);

            stage.setTitle("Panel Cliente!");
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /*private void listenerSelection() {
        tvObjeto.getSelectionModel().selectedItemProperty().addListener((obs,
                                                                           oldSelection, newSelection) -> {
            objetoSeleccionado = newSelection;
            mostrarInformacionObjeto(objetoSeleccionado);
        });
    }

    private void mostrarInformacionObjeto(Objeto objetoSeleccionado) {
        if(objetoSeleccionado != null){

            if(objetoSeleccionado.getId() == idObjeto){

            }

            txtNombre.setText(objetoSeleccionado.nombre());
            txtIdObjeto.setText(objetoSeleccionado.idObjeto());


        }
    }*/
}
