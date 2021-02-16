package exercise0;

public class PMain {
    public static void main(String[] args) {

      Persona persona1 = new Persona("Luca", "Aggio", 21);
      Persona persona2 = new Persona("Mario", "Rossi", 53);
      Persona persona3 = persona2;
      System.out.println(persona3.dettagli());

    }
}

/**
 * Come compilare dei sorgenti che utilizzano classi dello stesso package?
 *
 *  1)  mi posiziono nella cartellla che CONTIENE il package,
 *      in questo caso dentro la cartella /java.
 *  2)  compilo tutto il package, usando:  javac /<nomedelpackage>/*.java
 *  3)  se non ci sono errori di compilazione, posso eseguire
 *      la mia classe Main, ma nel formato <nomedelpackage>/Main,
 *      ovvero preceduta dal nome del suo stesso package.
 *
 */
