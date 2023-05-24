package com.example;

public abstract class ProductoElectronico {

    //Atributos
    private String nombre;
    private double precio;
    private double garantia;

    //Constructor
    public ProductoElectronico(String nombre, double precio, double garantia) {
        this.nombre = nombre;
        this.precio = precio;
        this.garantia = garantia;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getGarantia() {
        return garantia;
    }

    public void setGarantia(double garantia) {
        this.garantia = garantia;
    }

    //Metodos
    public abstract String cargar(double cargaInicial);
    public abstract String imprimirInfo();


    

    
    
}
