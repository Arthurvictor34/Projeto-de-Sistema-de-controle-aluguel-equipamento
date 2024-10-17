public class Funcionario extends Cliente {
    private float salario;

    public Funcionario(String nome, String sobrenome, String celular, String cpf, int idade){
        super( nome, sobrenome, celular, cpf, idade );
    }

    // getters e setters

    public void setSalario( float salario){
        this.salario = salario;
    }

    public float getSalario(){
        return this.salario;
    }
}