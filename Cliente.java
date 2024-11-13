public class Cliente extends Pessoa {
    protected double salario;

    public Cliente(String nome, String sobrenome, String celular, String cpf, int idade, double salario){
        super(nome, sobrenome, celular, cpf, idade, salario);
        this.salario = salario;
    }

    // getters e setters

    public void setSalario( double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
}