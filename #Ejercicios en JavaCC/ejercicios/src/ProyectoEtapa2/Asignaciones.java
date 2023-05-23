package ProyectoEtapa2;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Asignaciones {

    // Tabla de almacenamiento de tokens declarados
    private static Hashtable<String, Integer> tabla = new Hashtable<>();

    // Lista para guardar tipos
    private static ArrayList<Integer> tipoEntero = new ArrayList<>();
    private static ArrayList<Integer> palabraDefine = new ArrayList<>();
    private static ArrayList<Integer> palabraFinal = new ArrayList<>();
    private static ArrayList<Integer> tipoString = new ArrayList<>();
    private static ArrayList<Integer> tipoFlotante = new ArrayList<>();
    private static ArrayList<Integer> tipoBooleano = new ArrayList<>();
    private static ArrayList<Integer> tipoID = new ArrayList<>();
    private static ArrayList<Integer> tipoIgual = new ArrayList<>();

    public static void insertarSimbolo(Token id, int tipo) {
        tabla.put(id.image, tipo);
    }

    public static void SetTables() {
        // inicialización de las tablas que almacenan los datos
    	palabraDefine.add(11);
    	palabraFinal.add(7);
        tipoString.add(19); // esto corresponde a la palabra reservada 'puts'
        tipoString.add(24); // esto corresponde al token cadena con significado "\"" (~[ "\"" ])* "\""
        tipoEntero.add(21);
        tipoBooleano.add(22);
        tipoFlotante.add(23);
        tipoID.add(30); //identificador
        tipoIgual.add(42);
    }

    public static String revisarPrograma(Token token) {
        try {
            if (token.kind != 11) { //Este bloque if revisa el token.kind 11 que corresponde a la palabra reservada define
                System.out.println("No has inicializado el programa con 'define'.");
                System.out.println("El programa ha terminado, revisa tu archivo de gramáticas.");
                System.exit(1);
                return "";
            } else  {
               
            }
            
            return "Programa inicializado correctamente";
        } catch (Exception e) {
            return "Error: ha ocurrido un problema durante la revisión del programa";
        }
    }
}
