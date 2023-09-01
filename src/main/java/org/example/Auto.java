package org.example;

public class Auto {
    private int id;
    private String marca;
    private String color;
    private String matricula;
    private String modelo;
    private int anio;
    private Combustible combustible;
    private double valor;
    private byte stock;

    public Auto(int id, String marca, String color, String matricula, String modelo, int anio, Combustible combustible, double valor, byte stock) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.modelo = modelo;
        this.anio = anio;
        this.combustible = combustible;
        this.valor = valor;
        this.stock = stock;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Combustible getCombustible() {
        return this.combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public byte getStock() {
        return this.stock;
    }

    public void setStock(byte stock) {
        this.stock = stock;
    }

    public String toString() {
        return "Auto [id=" + this.id + ", marca=" + this.marca + ", color=" + this.color + ", matricula=" + this.matricula + ", modelo=" + this.modelo + ", anio=" + this.anio + ", combustible=" + this.combustible + ", valor=" + this.valor + ", stock=" + this.stock + "]";
    }
}
