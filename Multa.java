package com.example.listadinamica;

public class Multa {
    private String nominativo;
    private String numeroDocumento;
    private double importo;
    private int numeroVerbale;

    public Multa(String nominativo, String numeroDocumento, double importo, int numeroVerbale) {
        this.nominativo = nominativo;
        this.numeroDocumento = numeroDocumento;
        this.importo = importo;
        this.numeroVerbale = numeroVerbale;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public int getNumeroVerbale() {
        return numeroVerbale;
    }

    public void setNumeroVerbale(int numeroVerbale) {
        this.numeroVerbale = numeroVerbale;
    }

    @Override
    public String toString() {
        return "Multa:" + "\n" +
                "Nominativo= " + nominativo + "\n" +
                "NumeroDocumento= " + numeroDocumento + "\n" +
                "Importo= " + importo + "\n" +
                "NumeroVerbale= " + numeroVerbale + "\n";
    }
}