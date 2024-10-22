package co.edu.uniquindio.parcial2.parcial_2_yamis.viewController;

import co.edu.uniquindio.parcial2.parcial_2_yamis.controller.ClienteController;
import co.edu.uniquindio.parcial2.parcial_2_yamis.factory.dto.PrestamoDto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ClienteViewController implements Initializable {

    private ClienteController clienteController;

    @FXML
    private TableView<PrestamoDto> tablaPrestamos;

    @FXML
    private TableColumn<PrestamoDto, String> tcNumeroPrestamo;

    @FXML
    private TableColumn<PrestamoDto, String> tcNombreObjeto;

    @FXML
    private TableColumn<PrestamoDto, String> tcIdObjeto;

    @FXML
    private TableColumn<PrestamoDto, String> tcFechaPrestamo;

    @FXML
    private TableColumn<PrestamoDto, String> tcFechaEntrega;

    @FXML
    private TableColumn<PrestamoDto, String> tcVecesPrestado;

    public ClienteViewController(){
        this.clienteController = new ClienteController();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tcNumeroPrestamo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().numeroPrestamo()));
        tcNombreObjeto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombreObjeto()));
        tcIdObjeto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().idObjeto()));
        tcFechaPrestamo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().fechaPrestamo()));
        tcFechaEntrega.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().fechaEntrega()));
        tcVecesPrestado.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().vecesPrestado()));

    }

    public void listarPrestamos(String cedulaCliente){
        List<PrestamoDto> lista =
                clienteController.listarPrestamos(cedulaCliente);

        tablaPrestamos.setItems(FXCollections.observableArrayList(lista));
    }

}
