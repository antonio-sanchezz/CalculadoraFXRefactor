package gui.viewsandcontrollers.calculadora;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CalculadoraController {

	@FXML
	private Label label;

	@FXML
	private TextField num1;

	@FXML
	private TextField num2;

	@FXML
	private TextField resultado;

	private double num1Calc, num2Calc, result;

	private static final String FAIL = "Recuerda que debes utilizar números, no letras.";

	@FXML
	private void sumarButtonAction(ActionEvent event) throws IOException {

		try {
			num1Calc = Double.parseDouble(num1.getText());
			num2Calc = Double.parseDouble(num2.getText());
			result = num1Calc + num2Calc;
			setResult(result);
		} catch (NumberFormatException e) {
			resultado.setText(FAIL);
		}

	}

	@FXML
	private void restarButtonAction(ActionEvent event) {

		try {
			num1Calc = Double.parseDouble(num1.getText());
			num2Calc = Double.parseDouble(num2.getText());
			result = num1Calc - num2Calc;
			setResult(result);
		} catch (NumberFormatException e) {
			resultado.setText(FAIL);
		}

	}

	@FXML
	private void multiplicarButtonAction(ActionEvent event) {

		try {
			num1Calc = Double.parseDouble(num1.getText());
			num2Calc = Double.parseDouble(num2.getText());
			result = num1Calc * num2Calc;
			setResult(result);
		} catch (NumberFormatException e) {
			resultado.setText(FAIL);
		}

	}

	@FXML
	private void dividirButtonAction(ActionEvent event) {

		try {
			num1Calc = Double.parseDouble(num1.getText());
			num2Calc = Double.parseDouble(num2.getText());
			result = num1Calc / num2Calc;
			if (num2Calc == 0) {
				resultado.setText("No se puede dividir entre 0.");
			} else {
				setResult(result);
			}

		} catch (NumberFormatException e) {
			resultado.setText(FAIL);
		}

	}

	private void setResult(double result) {
		resultado.setText(result + "");
	}

}
