package it.edu.iisgubbio.matematica.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class esercizio4 extends Application{
	TextField tQuanti=new TextField("");
	TextField tMax=new TextField("");
	Label lRis=new Label("");
	Label lStampa=new Label("");
	int vettore[];
	int somma;
	String elenco;
	
	public void start(Stage finestra) {
		Button bCalcola=new Button("calcola");
		Button bAlloca=new Button("alloca");
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia);
		finestra.setScene(scena);
		finestra.setTitle("esercizio 4");
		finestra.show();
		griglia.add(tQuanti, 0, 0);
		griglia.add(tMax, 0, 1);
		griglia.add(bAlloca, 0, 2);
		griglia.add(bCalcola, 0, 3);
		griglia.add(lRis, 0, 4);
		griglia.add(lStampa, 0, 5);
		
		bAlloca.setOnAction(e->alloca());
		bCalcola.setOnAction(e->calcola());
	}
	public void alloca() {
		int dimensione, max;
		dimensione = Integer.parseInt(tQuanti.getText());
		max = Integer.parseInt(tMax.getText());
		vettore = new int[dimensione];
		for (int i = 0; i < vettore.length; i++) {
			vettore[i] = (int) (Math.random() * max);
			}
	}
	public void calcola() {
		for(int i=0; i<vettore.length; i++) {
			if(vettore[i]%3==0) {
				somma = somma +vettore[i];
			}
			else {
				somma = somma +vettore[i];
			}
			elenco = elenco + vettore[i] + "-";
		}
		lRis.setText(somma+"");
		lStampa.setText(elenco+"");
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
