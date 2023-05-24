package com.example;

public class Celular extends ProductoElectronico {

    //Atributos
    private String telefonia;
    private String sistemaOperativo;
    private String marca;

    //Constructor
    public Celular(String nombre, double precio, double garantia, String telefonia, String sistemaOperativo,
            String marca) {
        super(nombre, precio, garantia);
        this.telefonia = telefonia;
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
    }

    //Getters y Setters
    public String getTelefonia() {
        return telefonia;
    }

    public void setTelefonia(String telefonia) {
        this.telefonia = telefonia;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Metodos
    @Override
    public String cargar(double cargaInicial) {
        
        //El tiempo de carga se calcula con la formula: (cargaInicial*8 horas)/100
        double tiempoCarga = (cargaInicial*8)/100;

        //Formatear los numeros a dos decimales
        String cargaInicialString = String.format("%.2f", cargaInicial);
        String tiempoString = String.format("%.2f", tiempoCarga);
        
        return "Con una carga inicial de "+cargaInicialString+", el tiempo de carga del Celular "+ this.getNombre()+" es de "+tiempoString+" horas";
    }

    @Override
    public String imprimirInfo() {
        String cadena = "";
        cadena+="CELULAR\n";
        cadena+="Nombre: "+getNombre()+"\n";
        cadena+="Precio: "+getPrecio()+"\n";
        cadena+="Garantia en días: "+getGarantia()+"\n";
        cadena+="Telefonia: "+getTelefonia()+"\n";
        cadena+="Sistema Operativo: "+getSistemaOperativo()+"\n";
        cadena+="Marca: "+getMarca()+"\n";
        return cadena;
    }
    

    

    

    
    
}
