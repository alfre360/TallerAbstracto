package com.example;

public class Computadora extends ProductoElectronico {

    //Atributos
    private String sistemaOperativo;
    private int ram;
    private int almacenamiento;


    //Constructor
    public Computadora(String nombre, double precio, double garantia, String sistemaOperativo, int ram,
            int almacenamiento) {
        super(nombre, precio, garantia);
        this.sistemaOperativo = sistemaOperativo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }
    
    //Getters y Setters
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    //Metodos
    @Override
    public String cargar(double cargaInicial) {

        //El tiempo de carga se calcula con la formula: (cargaInicial*12 horas)/100
        double tiempoCarga = (cargaInicial*12)/100;

        //Formatear los numeros a dos decimales
        String cargaInicialString = String.format("%.2f", cargaInicial);
        String tiempoString = String.format("%.2f", tiempoCarga);
        
        return "Con una carga inicial de "+cargaInicialString+", el tiempo de carga de la Computadora "+ this.getNombre()+" es de "+tiempoString+" horas";
    }

    @Override
    public String imprimirInfo() {
        String cadena="";
        cadena+="COMPUTADORA\n";
        cadena+="Nombre: "+getNombre()+"\n";
        cadena+="Precio: "+getPrecio()+"\n";
        cadena+="Garantia en días: "+getGarantia()+"\n";
        cadena+="Sistema Operativo: "+getSistemaOperativo()+"\n";
        cadena+="Memoria RAM: "+getRam()+"\n";
        cadena+="Almacenamiento: "+getAlmacenamiento()+"\n";
        return cadena;
    }

    


    

    
    
}
