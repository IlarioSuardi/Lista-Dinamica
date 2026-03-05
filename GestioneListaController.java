package com.example.listadinamica;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GestioneListaController {

    @FXML
    private TextField inserisciTesto;

    @FXML
    private TextField cercaTesto;

    @FXML
    private TextField nuovoTesto;

    @FXML
    private TextField messaggioStato;

    @FXML
    private TextArea output;

    private Lista lista = new Lista();

    private void aggiornaOutput() {
        output.setText(lista.toString());
    }

    @FXML
    protected void aggiungiClick() {
        String valore = inserisciTesto.getText();

        if (!valore.isEmpty()) {
            lista.aggiungi(valore);
            messaggioStato.setText("Elemento aggiunto!");
            inserisciTesto.clear();
            aggiornaOutput();
        }
    }

    @FXML
    protected void modificaClick() {
        String vecchio = cercaTesto.getText();
        String nuovo = nuovoTesto.getText();

        if (lista.modifica(vecchio, nuovo)) {
            messaggioStato.setText("Modifica effettuata!");
        } else {
            messaggioStato.setText("Elemento non trovato.");
        }

        cercaTesto.clear();
        nuovoTesto.clear();
        aggiornaOutput();
    }

    @FXML
    protected void eliminaClick() {
        String valore = cercaTesto.getText();

        if (lista.elimina(valore)) {
            messaggioStato.setText("Elemento eliminato!");
        } else {
            messaggioStato.setText("Elemento non trovato.");
        }

        cercaTesto.clear();
        aggiornaOutput();
    }

    @FXML
    protected void cercaClick() {
        String valore = cercaTesto.getText();

        lista.resetIteratore();
        boolean trovato = false;
        String elemento;
        int posizione = 1;

        while ((elemento = lista.visita()) != null) {
            if (elemento.equals(valore)) {
                trovato = true;
                break;
            }
            posizione++;
        }

        if (trovato) {
            messaggioStato.setText("Elemento trovato in posizione: " + posizione);
        } else {
            messaggioStato.setText("Elemento non trovato.");
        }

        cercaTesto.clear();
        aggiornaOutput();
    }

    @FXML
    protected void visualizzaClick() {
        aggiornaOutput();
    }
}