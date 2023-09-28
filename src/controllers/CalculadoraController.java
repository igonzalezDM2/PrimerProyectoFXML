package controllers;

import java.util.Locale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
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
    			Double operando2 = Double.parseDouble(operador2str);
    			
    			RadioButton botonSeleccionado = (RadioButton) operaciones.getSelectedToggle();
    			final String btnTxt = botonSeleccionado.getText().toLowerCase();
    			Double resultado = 0d;
    			switch (btnTxt) {
				case "sumar": 
					resultado = operando1 + operando2;
					break;
				case "restar":
					resultado = operando1 - operando2;
					break;
				case "multiplicar":
					resultado = operando1 * operando2;
					break;
				case "dividir":
					resultado = operando1 / operando2;
					break;
				}    			
    			txtResultado.setText(String.format(Locale.GERMAN, "%,.2f", resultado));
    		} catch (NumberFormatException e) {
    			txtResultado.setText("Operandos incorrectos");
    		} catch (ArithmeticException e) {
    			txtResultado.setText("Operación no soportada");
    		}
    	}
    }

}