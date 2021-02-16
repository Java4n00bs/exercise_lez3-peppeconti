package exercise1;


public class Impiegato {

    String nome;
    String cognome;
    int salario;

    public Impiegato(){
        this.nome = "Gianni";
        this.cognome = "Bianchi";
        this.salario = 20000;
    }

    public Impiegato(String nome, String cognome, int salario){
        this.nome = nome;
        this.cognome = cognome;
        this.salario = salario;
    }

    public String dettagli(){
        String dettagli = "L'impiegato " + this.nome + " " + this.cognome + " guadagna " + this.salario + " euro all'anno.";
        return dettagli;
    }
    public void aumentaSalario(int percentuale){
     this.salario = this.salario + ((this.salario/100)*percentuale);
    }
}
