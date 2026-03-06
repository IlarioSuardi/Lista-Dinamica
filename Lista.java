package com.example.listadinamica;

public class Lista {

    private Nodo head;
    private Nodo cursor;

    public Lista() {
        head = null;
        cursor = null;
    }

    public void aggiungi(Multa multa) {
        Nodo nuovo = new Nodo(multa);
        if (head == null) {
            head = nuovo;
            return;
        }
        Nodo temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nuovo;
    }

    public void resetIteratore() {
        cursor = head;
    }

    public Multa visita() {
        if (cursor == null) return null;
        Multa valore = cursor.value;
        cursor = cursor.next;
        return valore;
    }

    public boolean modifica(String documento, double nuovoImporto) {
        Nodo temp = head;
        while (temp != null) {
            if (temp.value.getNumeroDocumento().equals(documento)) {
                temp.value.setImporto(nuovoImporto);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public boolean elimina(String documento) {
        if (head == null) return false;
        if (head.value.getNumeroDocumento().equals(documento)) {
            head = head.next;
            return true;
        }
        Nodo temp = head;
        while (temp.next != null) {
            if (temp.next.value.getNumeroDocumento().equals(documento)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public String toString() {
        String result = "";
        Nodo temp = head;
        while (temp != null) {
            result += temp.value.toString() + "\n";
            temp = temp.next;
        }
        return result;
    }
}