

public class Cliente {

     // protected, private, public são as declarações, alem da default
     // atribuidos de identificação 
     private String nome;
     private String sobrenome;
     private String celular;
     private String cpf;
     private int idade;

     // Construtor Sobrecarregado
     public Cliente( String nome, String sobrenome, String celular, String cpf, int idade){
          this.nome = nome;
          this.sobrenome = sobrenome;
          this.celular = celular;
          this.cpf = cpf;
          this.idade = idade;
     }

     // Construtor Vazio
     public Cliente(){

     }

     // Construtor Padrão
     public Cliente( String nome){
          this.nome = nome;
     }

     // Getters e Setters
     public void setNome( String nome ){
          this.nome = nome;
     }

     public String getNome(){
          return this.Nome;
     }

     public void setSobrenome( String sobrenome){
          this.sobrenome = sobrenome;
     }

     public String getSobrenome(){
          return this.sobrenome;
     }

     public void setCelular( String celular ){
          this.celular = celular;
     }

     public String getCelular(){
          return this.celular;
     }

     public void setCPF( String cpf ){
          this.cpf = cpf;
     }

     public String getCPF(){
          return this.CPF;
     }

     public void setIdade( int idade ){
          this.idade = idade;
     }

     public int getIdade(){
          return this.idade;
     }
}



