package ProyectoEtapa2;

import java.util.Hashtable;
import java.util.ArrayList;

public class asignaciones {
    // Tabla de almacenamiento de tokens declarados
    private static Hashtable<String, Integer> tabla = new Hashtable<>();

    // Lista para guardar tipos
    private static ArrayList<Integer> tipoEntero = new ArrayList<>();
    private static ArrayList<Integer> tipoString = new ArrayList<>();
    private static ArrayList<Integer> tipoFlotante = new ArrayList<>();
    private static ArrayList<Integer> tipoBooleano = new ArrayList<>();
    
    public static void SetTables() {
        // inicialización de las tablas que almacenan los datos
        tipoString.add(19); // esto corresponde a la palabra reservada 'puts'
        tipoString.add(24); // esto corresponde al token cadena con significado "\"" (~[ "\"" ])* "\""

        tipoEntero.add(21); //esto corresponde al token.kind de los token <ENTERO>

        tipoBooleano.add(22); //esto corresponde al token.kind de los tokens < BOOLEANO>

        tipoFlotante.add(23); //esto corresponde al token.kind de los tokens <FLOTANTE>
    }

    public static void insertarSimbolo(Token id, int tipo) throws ParseException {
        if (tabla.containsKey(id.image)) {
            throw new ParseException("La variable '" + id.image + "' ya ha sido declarada");
        }

        switch (tipo) {
            case 19:
            case 24:
                if (!tipoString.contains(tipo)) {
                    throw new ParseException("Tipo de variable incorrecto para '" + id.image + "'");
                }
                break;
            case 21:
                if (!tipoEntero.contains(tipo)) {
                    throw new ParseException("Tipo de variable incorrecto para '" + id.image + "'");
                }
                break;
            case 22:
                if (!tipoBooleano.contains(tipo)) {
                    throw new ParseException("Tipo de variable incorrecto para '" + id.image + "'");
                }
                break;
            case 23:
                if (!tipoFlotante.contains(tipo)) {
                    throw new ParseException("Tipo de variable incorrecto para '" + id.image + "'");
                }
                break;
            default:
                throw new ParseException("Tipo de variable desconocido para '" + id.image + "'");
        }

        tabla.put(id.image, tipo);
    }

   
}
