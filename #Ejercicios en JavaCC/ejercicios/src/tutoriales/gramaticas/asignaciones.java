package tutoriales.gramaticas;

import java.io.*;
import java.util.*;
import java.lang.*;

public class asignaciones {
	
	//validar asignaciones a caracteres (ichr)
	public static int  segunda= 0;
	//Tabla de almacenamiento de tokens declarados
	private static Hashtable tabla = new Hashtable ();
	
	//Lista para guardar tipos 
	private static ArrayList<Integer> tipoEntero = new ArrayList<>();
	private static ArrayList<Integer> tipoString = new ArrayList<>();
	private static ArrayList<Integer> tipoFlotante = new ArrayList<>();
	private static ArrayList<Integer> tipoBooleano = new ArrayList<>();

	public static void insertarSimbolo (Token id, int tipo)
	{
		tabla.put(id.image, tipo);
	}
	
	public static void SetTable ()
	{
		//inicialización de las tablas que almacenan los datos
		tipoEntero.add(7);
		tipoString.add(8);
	}
	
	public static String checkAsking(Token tokenIzq, Token tokenAsig) {
	    int tipoIdent1;
	    int tipoIdent2;

	    if (tokenIzq.kind != 7) {
	        try {
	            tipoIdent1 = (Integer) tabla.get(tokenIzq.image);
	        } catch (Exception e) {
	            return "Error: el identificador " + tokenIzq.image + " no ha sido declarado" + tokenIzq.beginLine;
	        }
	    } else {
	        tipoIdent1 = 0;
	    }
		return "tipo de dato aceptado";
	}

}
