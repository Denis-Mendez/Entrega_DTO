package org.example;

public class AutoDTO {
    private String marca;
    private String modelo;
    private double valor;
    private String color;
    private String matricula;
    private int anio;
    private Combustible combustible;
    private byte stock;

    public AutoDTO(String marca, String modelo, double valor, String color, String matricula, int anio, Combustible combustible, byte stock) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.color = color;
        this.matricula = matricula;
        this.anio = anio;
        this.combustible = combustible;
        this.stock = stock;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public byte getStock() {
        return this.stock;
    }

    public void setStock(byte stock) {
        this.stock = stock;
    }

    public String toString() {
        return "AutoDTO [marca=" + this.marca + ", modelo=" + this.modelo + ", valor=" + this.valor + "]";
    }
}

