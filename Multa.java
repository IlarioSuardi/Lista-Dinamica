package com.example.listadinamica;

public class Multa {
    private String nomintivo;
    private String numeroDocumento;
    private double importo;
    private int numeroVerbale;

    public String getNomintivo() {
        return nomintivo;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public double getImporto() {
        return importo;
    }

    public int getNumeroVerbale() {
        return numeroVerbale;
    }

    public void setNomintivo(String nomintivo) {
        this.nomintivo = nomintivo;
    }

    private void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    private void setImporto(double importo) {
        this.importo = importo;
    }

    private void setNumeroVerbale(int numeroVerbale) {
        this.numeroVerbale = numeroVerbale;
    }

    public Multa(String nomintivo, String numeroDocumento, double importo, int numeroVerbale) {
        this.nomintivo = nomintivo;
        this.numeroDocumento = numeroDocumento;
        this.importo = importo;
        this.numeroVerbale = numeroVerbale;
    }

    @Override
    public String toString() {
        return "Multa:" + "\n" +
                "nomintivo= " + nomintivo + "\n" +
                "numeroDocumento= " + numeroDocumento + '\n' +
                "importo= " + importo + "\n" +
                "numeroVerbale= " + numeroVerbale + "\n";
        }
}
