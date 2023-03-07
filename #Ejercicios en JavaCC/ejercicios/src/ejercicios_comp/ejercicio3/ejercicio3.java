/* Generated By:JavaCC: Do not edit this line. ejercicio3.java */
package ejercicios_comp.ejercicio3;
import java.io.Reader;
import java.util.*;
public class ejercicio3 implements ejercicio3Constants {

public static void main(String[] args) {
        ejercicio3 parser = new ejercicio3(new StringReader("4"));
        Token token = parser.getNextToken();
        if (token.kind == ejercicio3.NUMEROPAR) {
            System.out.println("Soy un numero parrr");
        } else {
            System.out.println("No soy un numero par :c");
        }
    }

  final public void llamarNumeroPar() throws ParseException {
    jj_consume_token(NUMEROPAR);
                 System.out.println ("soy un numeroPar");
  }

  final public void principal() throws ParseException {
    jj_consume_token(INICIO);
    jj_consume_token(IDENTIFICADOR);
    label_1:
    while (true) {
      sentencias();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VAR:
      case ESCRIBIR:
      case LEER:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
    }
    jj_consume_token(FIN);
  }

  final public void sentencias() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VAR:
      declararVariable();
      break;
    case LEER:
      gramaticaLeer();
      break;
    case ESCRIBIR:
      gramaticaEscribir();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void declararVariable() throws ParseException {
    jj_consume_token(VAR);
    jj_consume_token(IDENTIFICADOR);
    tipoDato();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IGUAL:
      jj_consume_token(IGUAL);
      valor();
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
  }

  final public void tipoDato() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ENTERO:
      jj_consume_token(ENTERO);
      break;
    case CADENA:
      jj_consume_token(CADENA);
      break;
    case FLOTANTE:
      jj_consume_token(FLOTANTE);
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void valor() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VALOR_CADENA:
      jj_consume_token(VALOR_CADENA);
      break;
    case VALOR_ENTERO:
      jj_consume_token(VALOR_ENTERO);
      break;
    case VALOR_FLOTANTE:
      jj_consume_token(VALOR_FLOTANTE);
      break;
    case IDENTIFICADOR:
      jj_consume_token(IDENTIFICADOR);
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void gramaticaEscribir() throws ParseException {
    jj_consume_token(ESCRIBIR);
    jj_consume_token(PARENTESIS_IZQUIERDO);
    valor();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SUMA:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_2;
      }
      jj_consume_token(SUMA);
      valor();
    }
    jj_consume_token(PARENTESIS_DERECHO);
  }

  final public void gramaticaLeer() throws ParseException {
    jj_consume_token(LEER);
    jj_consume_token(PARENTESIS_IZQUIERDO);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(PARENTESIS_DERECHO);
  }

  /** Generated Token Manager. */
  public ejercicio3TokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[6];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1c00,0x1c00,0x80000000,0x380,0x0,0x1000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x780,0x0,};
   }

  /** Constructor with InputStream. */
  public ejercicio3(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ejercicio3(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ejercicio3TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ejercicio3(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ejercicio3TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ejercicio3(ejercicio3TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ejercicio3TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 6; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[45];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 6; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 45; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}