package exercicio1;

public class Animal {
    protected String nome;
    protected int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void descrever(){
        System.out.println("Animal: "+nome+", "+idade+" anos.");
    }
}
