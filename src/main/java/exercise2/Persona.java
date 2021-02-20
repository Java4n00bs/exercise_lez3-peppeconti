package exercise2;

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
        String dettagli = "La persona si chiama " + this.nome + " " + this.cognome  + "; " + "ha " + this.eta + " " + "anni";
        return dettagli;
    }
}

class Impiegato extends Persona {
  int salario;

  public Impiegato() {
      this.salario = 12000;
    }

  public Impiegato(String nome, String cognome, int eta, int salario){
      super(nome, cognome, eta);
      this.salario = salario;
    }
  public String dettagli_impiegato(){
        return this.dettagli() + ", fa l'impiegato e guadagna" + " " + this.salario + " euro";
    }  
}