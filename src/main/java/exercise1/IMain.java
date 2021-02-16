package exercise1;

public class IMain {
    public static void main(String[] args) {

      Impiegato impiegato1 = new Impiegato("Marco", "Verdi", 5000);
      Impiegato impiegato2 = new Impiegato("Mario", "Bianchi", 22000);

      impiegato1.aumentaSalario(10);

      if (impiegato1.salario > impiegato2.salario) {
        System.out.println("L'impiegato " + impiegato1.nome + " " + impiegato1.cognome + " guadagna più dell'impiegato " + impiegato2.nome + " " + impiegato2.cognome +".");
      } else {
        System.out.println("L'impiegato " + impiegato1.nome + " " + impiegato1.cognome + " NON guadagna più dell'impiegato " + impiegato2.nome + " " + impiegato2.cognome +".");
      }

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
