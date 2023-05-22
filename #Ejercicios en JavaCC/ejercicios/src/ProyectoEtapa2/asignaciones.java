package ProyectoEtapa2;

import java.io.*;
import java.util.*;
import java.lang.*;

public class asignaciones {

    // validar asignaciones a caracteres (ichr)
    public static int segunda = 0;
    // Tabla de almacenamiento de tokens declarados
    private static Hashtable tabla = new Hashtable();

    // Lista para guardar tipos
    private static ArrayList<Integer> tipoEntero = new ArrayList<>();
    private static ArrayList<Integer> tipoString = new ArrayList<>();
    private static ArrayList<Integer> tipoFlotante = new ArrayList<>();
    private static ArrayList<Integer> tipoBooleano = new ArrayList<>();

    public static void insertarSimbolo(Token id, int tipo) {
        tabla.put(id.image, tipo);
    }

    public static void SetTables() {
        // inicialización de las tablas que almacenan los datos
        tipoString.add(19); // esto corresponde a la palabra reservada 'puts'
        tipoString.add(24); // esto corresponde al token cadena con significado "\"" (~[ "\"" ])* "\""

        tipoEntero.add(21);

        tipoBooleano.add(22);

        tipoFlotante.add(23);
    }

    public static String checkAsign(Token tokenIzq, Token tokenAsig) {
        int tipoIdent1;
        int tipoIdent2;

        if (tokenIzq.kind != 19 && tokenIzq.kind != 24) {
            try {
                tipoIdent1 = (Integer) tabla.get(tokenIzq.image);
            } catch (Exception e) {
                return "Error: el identificador " + tokenIzq.image + " no ha sido declarado en la línea " + tokenIzq.beginLine;
            }
        } else {
            tipoIdent1 = 0;
            if (tokenAsig.kind == 24) {
                // Verificar si la cadena es válida
                String cadena = tokenAsig.image;
                if (cadena.startsWith("\"") && cadena.endsWith("\"")) {
                    // Cadena válida
                    return "tipo de dato aceptado";
                } else {
                    // Cadena no declarada correctamente
                    return "Error: la cadena " + cadena + " no ha sido declarada correctamente en la línea " + tokenAsig.beginLine;
                }
            }
        }
        return "tipo de dato aceptado";
    }

    public static String revisarVariable(Token revisarToken) {
        try {
            int tipoIdent1 = (Integer) tabla.get(revisarToken.image);
            return "";
        } catch (Exception e) {
            return "Error " + revisarToken.image + " en la línea " + revisarToken.beginLine;
        }
    }
}