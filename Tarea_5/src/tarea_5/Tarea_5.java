package tarea_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tarea_5 {

    public void leer() {

        System.out.println("*********************************");
        System.out.println("|          Bienvenido           |");
        System.out.println("|        ¿Que desa hacer?       |");
        System.out.println("|1.Leer un documento.           |");
        System.out.println("|2.Escribir un documento.       |");
        System.out.println("|3.Salir.                       |");
        System.out.println("*********************************");
        Scanner Res = new Scanner(System.in);
        int respuesta = Res.nextInt();
        switch (respuesta) {
            case 1:
                File archivo;
                FileReader leer; //
                BufferedReader almacenamiento;
                archivo = new File("Prueba().txt");
                try {
                    leer = new FileReader(archivo);
                    almacenamiento = new BufferedReader(leer);
                    String linea = "";
                    while ((linea = almacenamiento.readLine()) != null) {
                        System.out.println(linea);
                    }
                } catch (Exception e) {
                    System.out.println("El archivo no se encontro");
                }
                break;
            case 2:
                File Archivo = new File("Nuevo_texto.txt");
                FileWriter escribir;
                PrintWriter linea;

                String palabra = "hola mundo";
                if (!Archivo.exists()) {
                    try {
                        Archivo.createNewFile();
                        escribir = new FileWriter(Archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.print(palabra);
                        linea.print("Puede empezar a escribir");
                        linea.print("sin espacios");
                        linea.close();
                        escribir.close();
                    } catch (Exception e) {

                    }
                } else {
                    try {
                        escribir = new FileWriter(Archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println("Este es su documento");
                        linea.print("puede escribir, pero sin espacios");
                        linea.close();
                        escribir.close();
                    } catch (Exception e) {

                    }
                }
        }

//
    }

    public static void main(String[] args) {
Tarea_5 tarea = new Tarea_5();
tarea.leer();
    }

}
