package com.example.proyecto_iweb.models.beans;

public class EmpleadosTabla {

    private String nombre;
    private int juegosVendidos;
    private int juegosComprados;
    private double dineroGanado;
    private double dineroGastado;
    private double balance;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getJuegosVendidos() {
        return juegosVendidos;
    }

    public void setJuegosVendidos(int juegosVendidos) {
        this.juegosVendidos = juegosVendidos;
    }

    public int getJuegosComprados() {
        return juegosComprados;
    }

    public void setJuegosComprados(int juegosComprados) {
        this.juegosComprados = juegosComprados;
    }

    public double getDineroGanado() {
        return dineroGanado;
    }

    public void setDineroGanado(double dineroGanado) {
        this.dineroGanado = dineroGanado;
    }

    public double getDineroGastado() {
        return dineroGastado;
    }

    public void setDineroGastado(double dineroGastado) {
        this.dineroGastado = dineroGastado;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}



