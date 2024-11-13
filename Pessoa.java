

public abstract class Pessoa {

     // protected, private, public são as declarações, alem da default
     // atribuidos de identificação 
     public String nome;
     public String sobrenome;
     protected String celular;
     protected String cpf;
     public int idade;

     // Construtor Sobrecarregado
     public Pessoa( String nome, String sobrenome, String celular, String cpf, int idade, double salario){
          this.nome = nome;
          this.sobrenome = sobrenome;
          this.celular = celular;
          this.cpf = cpf;
          this.idade = idade;
     }

     // Construtor Vazio
     public Pessoa(){

     }

     // Construtor Padrão
     public Pessoa( String nome){
          this.nome = nome;
     }

     // Getters e Setters
     public void setNome( String nome ){
          this.nome = nome;
     }

     public String getNome(){
          return this.nome;
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
          return this.cpf;
     }

     public void setIdade( int idade ){
          this.idade = idade;
     }

     public int getIdade(){
          return this.idade;
     }
}



