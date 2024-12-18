
public class Equipamento {

     // protected, private, public são as declarações, alem da default
     // atrbuidos do equipamento 
     private String nomeequipamento;
     private double custoequipamento;
     private int codigoidentificação;
     private double custoreparo;
     private String tipoequipamento;

     // Construtor Sobrecarregado
     public Equipamento(String nomeequipamento, double custoequipamento, int codigoidentificação, double custoreparo, String tipoequipamento ){
          this.nomeequipamento = nomeequipamento;
          this.custoequipamento = custoequipamento;
          this.codigoidentificação = codigoidentificação;
          this.custoreparo = custoreparo;
          this.tipoequipamento = tipoequipamento;
          
     }
     
     // Construtor Vazio
     public Equipamento(){

     }

     // Construtor Padrão
     public Equipamento(String nomeequipamento){
          this.nomeequipamento = nomeequipamento;
     }

     // Getters e Setters
     public void setNomeEquipamento( String nomeequipamento ){
          this.nomeequipamento = nomeequipamento;
     }

     public String getNomeEquipamento(){
          return this.nomeequipamento;
     }

     public void setCustoEquipamento( double custoequipamento ){
          this.custoequipamento = custoequipamento;
     }

     public double getCustoEquipamento(){
          return this.custoequipamento;
     }

     public void setCodigoIdentificação( int codigoidentificação ){
          this.codigoidentificação = codigoidentificação;
     } 

     public int getCodigoIdentificação(){
          return this.codigoidentificação;
     }

     public void setCustoReparo( double custoreparo ){
          this.custoreparo = custoreparo;
     }

     public double getCustoReparo(){
          return this.custoreparo;
     }

     public void setTipoEquipamento( String tipoequipamento){
          this.tipoequipamento = tipoequipamento;
     }

     public String getTipoEquipamento(){
          return this.tipoequipamento;
     }
     
}
