package gui;

import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MargemRiscoController {
	
	@FXML
	private TextField txtMontante;
	@FXML
	private TextField txtPorcentagem;
	@FXML
	private TextField txtResult ;
	@FXML
	private TextField txtPatamar;
	@FXML
	private Label labelLote;
	@FXML
	private Button btnOk;
	@FXML
	private Button btnVr;
	
	
	public void onBtnVrAction() {
		Locale.setDefault(Locale.US);
		double montante = Double.parseDouble(txtMontante.getText());
		double porcentagem = Double.parseDouble(txtPorcentagem.getText());
		double sum = montante * (porcentagem / 100);
		txtResult.setText(String.format("%.2f", sum));
	}
	
	public void onBtnOkAction() {
		Locale.setDefault(Locale.US);
		double result = Double.parseDouble(txtResult.getText());
		double patamar = Double.parseDouble(txtPatamar.getText());
		double sum = result / patamar / 10;
		labelLote.setText(String.format("%.2f", sum));
	}
	/*
	public void valorRisco() {
		Locale.setDefault(Locale.US);
		double montante = Double.parseDouble(txtMontante.getText());
		double porcentagem = Double.parseDouble(txtPorcentagem.getText());
		double sum = montante * (porcentagem / 100);
		txtResult.setText(String.format("%.2f", sum));
	}*/
}
