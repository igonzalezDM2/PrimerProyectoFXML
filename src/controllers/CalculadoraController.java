package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CalculadoraController {

    @FXML
    private Button boton;

    @FXML
    private ToggleGroup operaciones;

    @FXML
    private TextField txtOperador1;

    @FXML
    private TextField txtOperador2;

    @FXML
    private TextField txtResultado;

    @FXML
    void calcular(ActionEvent event) {
    	String operador1str = txtOperador1.getText();
    	String operador2str = txtOperador2.getText();
    	if (operador1str != null && !operador1str.isBlank() && operador2str != null && !operador2str.isBlank()) {
    		try {
    			Double operando1 = Double.parseDouble(operador1str);
    		} catch (NumberFormatException e) {
    			txtResultado.setText("Operandos incorrectos");
    		} catch (ArithmeticException e) {
    			txtResultado.setText("Operación no soportada");
    		}
    	}
    }

}