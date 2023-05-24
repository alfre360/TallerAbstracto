package com.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static Scanner sc= new Scanner(System.in);

    public static void main( String[] args )
    {
        //Crear lista de productos
        ArrayList<ProductoElectronico> productos = new ArrayList<ProductoElectronico>();

        int opcion = 99;
        while(opcion!=0)
        {
            opcion = menu();
            switch(opcion)
            {
                case 1: Celular nuevoCel = crearCelular();
                        productos.add(nuevoCel);
                        break;
                case 2: Computadora nuevaComp = crearComputadora();
                        productos.add(nuevaComp);
                        break;
                case 3: imprimirProductos(productos);
                        break;
                case 4: cargarProductos(productos);
                        break;
                case 0: System.out.println("Adios");
                        break;
                default: System.out.println("Opcion invalida");
            }
        }
       
    }

    public static int menu()
    {
        System.out.println("MENU");
        System.out.println("1. Crear celular");
        System.out.println("2. Crear computadora");
        System.out.println("3. Imprimir info de productos");
        System.out.println("4. Cargar productos");
        System.out.println("0. Salir");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    public static Celular crearCelular()
    {
        // Solicitar datos
        System.out.println("CREAR CELULAR");
        System.out.println("Ingrese el nombre del celular");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el precio del celular");
        double precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad de días de garantia del celular");
        double garantia = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese la telefonia del celular");
        String telefonia = sc.nextLine();
        System.out.println("Ingrese el sistema operativo del celular");
        String sistemaOperativo = sc.nextLine();
        System.out.println("Ingrese la marca del celular");
        String marca = sc.nextLine();

        //Crear celular
        Celular celular = new Celular(nombre, precio, garantia, telefonia, sistemaOperativo, marca);
        System.out.println("Celular creado exitosamente");
        return celular;
    }

    public static Computadora crearComputadora()
    {
        // Solicitar datos
        System.out.println("CREAR COMPUTADORA");
        System.out.println("Ingrese el nombre de la computadora");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el precio de la computadora");
        double precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad de días de garantia de la computadora");
        double garantia = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese el sistema operativo de la computadora");
        String sistemaOperativo = sc.nextLine();
        System.out.println("Ingrese la cantidad de RAM de la computadora");
        int ram = sc.nextInt();
        System.out.println("Ingrese la cantidad de almacenamiento de la computadora");
        int almacenamiento = sc.nextInt();

        //Crear computadora
        Computadora computadora = new Computadora(nombre, precio, garantia, sistemaOperativo, ram, almacenamiento);
        System.out.println("Computadora creada exitosamente");
        return computadora;
    }

    public static void imprimirProductos(ArrayList<ProductoElectronico> productos)
    {
        System.out.println("LISTA DE PRODUCTOS");
        for (ProductoElectronico producto : productos) {
            System.out.println(producto.imprimirInfo());
            System.out.println();
        }
    }

    public static void cargarProductos(ArrayList<ProductoElectronico> productos)
    {
        System.out.println("CARGAR PRODUCTOS");
        for (ProductoElectronico producto : productos) {
            //Generar un numero aleatorio entre 1 y 60
            double cargaInicial = (double) (Math.random() * 60 + 1);
            System.out.println(producto.cargar(cargaInicial));
            System.out.println();
        }
    }


}
