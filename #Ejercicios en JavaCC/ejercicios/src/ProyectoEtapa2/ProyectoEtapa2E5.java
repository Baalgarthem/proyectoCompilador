/* Generated By:JavaCC: Do not edit this line. ProyectoEtapa2E5.java */
package ProyectoEtapa2;

public class ProyectoEtapa2E5 implements ProyectoEtapa2E5Constants {
  public static void main(String args []) throws ParseException
  {
    ProyectoEtapa2E5 parser = new ProyectoEtapa2E5(System.in);
    parser.definirMain();
  }

//=================AREA DEL MAIN Y LÓGICA RESUMIDA DEL PROGRAMA=================
  static final public void definirMain() throws ParseException {
    jj_consume_token(DEFINE);
    funcionamientoPrograma();
    jj_consume_token(FINAL);
    System.out.println("El programa no tiene errores (Compilaci\u00f3n Exitosa)");
  }

  static final public void funcionamientoPrograma() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SI:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      bucleIf();
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DIGITO:
      case LETRA:
      case IGUAL:
      case MENOR:
      case MAYOR:
      case MENOR_IGUALQUE:
      case MAYOR_IGUALQUE:
      case DIFERENTE_DE:
      case AND:
      case OR:
      case NOT:
      case 50:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      declararVariable();
    }
  }

  static final public void nombreVariable() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 50:
      jj_consume_token(50);
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DIGITO:
      case LETRA:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETRA:
        jj_consume_token(LETRA);
        break;
      case DIGITO:
        jj_consume_token(DIGITO);
        jj_consume_token(50);
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void valorDeUnaVariable() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ENTERO:
      jj_consume_token(ENTERO);
      break;
    case CADENA:
      jj_consume_token(CADENA);
      break;
    case LETRA:
      jj_consume_token(LETRA);
      jj_consume_token(FLOTANTE);
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void bucleIf() throws ParseException {
    label_4:
    while (true) {
      jj_consume_token(SI);
      condicion();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SI:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_4;
      }
    }
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SINO:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_5;
      }
      jj_consume_token(SINO);
      condicion();
                                              System.out.println("ELSE terminado");
    }
    jj_consume_token(FINAL);
                    System.out.println("IF terminado");
  }

  static final public void condicion() throws ParseException {
    jj_consume_token(PARENTESIS_IZQUIERDO);
    nombreVariable();
    comparador();
    valorDeUnaVariable();
    jj_consume_token(PARENTESIS_DERECHO);
  }

  static final public void declararVariable() throws ParseException {
    nombreVariable();
    comparador();
    valorDeUnaVariable();
  }

  static final public void comparador() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IGUAL:
      jj_consume_token(IGUAL);
      break;
    case MENOR:
      jj_consume_token(MENOR);
      break;
    case MAYOR:
      jj_consume_token(MAYOR);
      break;
    case MENOR_IGUALQUE:
      jj_consume_token(MENOR_IGUALQUE);
      break;
    case MAYOR_IGUALQUE:
      jj_consume_token(MAYOR_IGUALQUE);
      break;
    case DIFERENTE_DE:
      jj_consume_token(DIFERENTE_DE);
      break;
    case AND:
      jj_consume_token(AND);
      break;
    case OR:
      jj_consume_token(OR);
      break;
    case NOT:
      jj_consume_token(NOT);
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void operador() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MAS:
      jj_consume_token(MAS);
      break;
    case MENOS:
      jj_consume_token(MENOS);
      break;
    case MULTIPLICACION:
      jj_consume_token(MULTIPLICACION);
      break;
    case DIVISION:
      jj_consume_token(DIVISION);
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void tipoDato() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VERDADERO:
    case FALSO:
    case NULO:
      booleano();
      break;
    case ENTERO:
      jj_consume_token(ENTERO);
      break;
    case FLOTANTE:
      jj_consume_token(FLOTANTE);
      break;
    case CADENA:
      jj_consume_token(CADENA);
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void booleano() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VERDADERO:
      jj_consume_token(VERDADERO);
      break;
    case FALSO:
      jj_consume_token(FALSO);
      break;
    case NULO:
      jj_consume_token(NULO);
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public ProyectoEtapa2E5TokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x80,0x30000000,0x0,0x30000000,0x30000000,0x20a00000,0x80,0x100,0x0,0xf000000,0xee0000,0xe0000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x7fe00,0x40000,0x0,0x0,0x0,0x0,0x0,0x3fe00,0x0,0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public ProyectoEtapa2E5(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ProyectoEtapa2E5(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ProyectoEtapa2E5TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ProyectoEtapa2E5(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ProyectoEtapa2E5TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ProyectoEtapa2E5(ProyectoEtapa2E5TokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ProyectoEtapa2E5TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
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
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[51];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
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
    for (int i = 0; i < 51; i++) {
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
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
