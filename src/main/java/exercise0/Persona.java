package exercise0;

public class Persona {

  String nome, cognome;
  int eta;

    public Persona(){
      this.nome = "Giuseppe";
      this.cognome = "Conti";
      this.eta = 40;
    }

    public Persona(String nome, String cognome, int eta){
      this.nome = nome;
      this.cognome = cognome;
      this.eta = eta;
    }

    public String dettagli(){
        String dettagli = "La persona si chiama " + this.nome + " " + this.cognome  + " " + "e ha " + this.eta + " " + "anni";
        return dettagli;
    }
}