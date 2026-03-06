package com.example.listadinamica;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GestioneListaController {

    @FXML
    private TextField nominativo;

    @FXML
    private TextField documento;

    @FXML
    private TextField importo;

    @FXML
    private TextField numeroMulte;

    @FXML
    private TextField cercaDocumento;

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

        String nom = nominativo.getText();
        String doc = documento.getText();
        double imp = Double.parseDouble(importo.getText());
        int num = Integer.parseInt(numeroMulte.getText());

        Multa multa = new Multa(nom, doc, imp, num);

        lista.aggiungi(multa);

        messaggioStato.setText("Multa aggiunta");

        nominativo.clear();
        documento.clear();
        importo.clear();
        numeroMulte.clear();

        aggiornaOutput();
    }

    @FXML
    protected void eliminaClick() {

        String doc = cercaDocumento.getText();

        if (lista.elimina(doc)) {
            messaggioStato.setText("Multa eliminata");
        } else {
            messaggioStato.setText("Documento non trovato");
        }

        cercaDocumento.clear();

        aggiornaOutput();
    }

    @FXML
    protected void modificaClick() {

        String doc = cercaDocumento.getText();
        double nuovoImporto = Double.parseDouble(importo.getText());

        if (lista.modifica(doc, nuovoImporto)) {
            messaggioStato.setText("Importo modificato");
        } else {
            messaggioStato.setText("Documento non trovato");
        }

        aggiornaOutput();
    }

    @FXML
    protected void cercaClick() {

        String doc = cercaDocumento.getText();

        lista.resetIteratore();

        Multa m;
        int posizione = 1;
        boolean trovato = false;

        while ((m = lista.visita()) != null) {

            if (m.getNumeroDocumento().equals(doc)) {
                messaggioStato.setText("Trovato in posizione: " + posizione);
                trovato = true;
                break;
            }

            posizione++;
        }

        if (!trovato) {
            messaggioStato.setText("Documento non trovato");
        }

        aggiornaOutput();
    }
}