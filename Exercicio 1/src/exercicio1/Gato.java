package exercicio1;

public class Gato extends Animal{
    private String pelagem;
    
    public Gato(String nome, int idade, String pelagem){
        super(nome, idade);
        this.pelagem = pelagem;
    }
    
    @Override
    public void descrever(){
        System.out.println("Cachorro: "+nome+", pelagem "+pelagem+".");
    }
    
}
