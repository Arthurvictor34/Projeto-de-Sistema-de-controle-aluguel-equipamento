

public class Aluguel {

     // protected, private, public são as declarações, alem da default
     // atribuido de alugel do equipamento
     private double valorhora;
     private String formapagamento;
     private String datainicio; // a data em que foi alugada o equipamento
     private String datafim; // data de devolução do equipamento
     private double valordiaria;
     private String status; // se o equipamento já está alugado ou disponivel

     // Construtor sobrecarregado
     public Aluguel( double valorhora, String formapagamento, String datainicio, String datafim, double valordiaria, String status ){
          this.valorhora = valorhora;
          this.formapagamento = formapagamento;
          this.datainicio = datainicio;
          this.datafim = datafim;
          this.valordiaria = valordiaria;
          this.status = status;
     }
     
     // Construtor Vazio
     public Aluguel(){
     
     }

     //Construtor Padrão
     public Aluguel( double valorhora ){
          this.valorhora = valorhora;
     }


     // Getters e Setters
     public void setValorHora( double valorhora ){
          this.valorhora = valorhora;
     }
     
     public double getValorHora(){
          return this.valorhora;
     }

     public void setFormaPagamento( String formapagamento ){
          this.formapagamento = formapagamento;
     }
     
     public String getFormaPagamento(){
          return this.formapagamento;
     }

     public void setDataInicio( String datainicio ){
          this.datainicio = datainicio;
     }
     
     public String getDataInicio(){
          return this.datainicio;
     }

     public void setDataFim( String datafim ){
          this.datafim = datafim;
     }
     
     public String getDataFim(){
          return this.datafim;
     }

     public void SetValorDiaria( double valordiaria ){
          this.valordiaria = valordiaria;
     }
     
     public double GetValorDiaria(){
          return this.valordiaria;
     }

     public void setStatus( String status ){
          this.status = status;
     }
     
     public String getStatus(){
          return this.status;
     }
}