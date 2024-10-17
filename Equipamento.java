
public class Equipamento {

     // protected, private, public são as declarações, alem da default
     // atrbuidos do equipamento 
     private String nomeequipamento;
     private float custoequipamento;
     private int codigoidentificação;
     private float custoreparo;
     private String tipoequipamento;

     // Construtor Sobrecarregado
     public Equipamento(String nomeequipamento, float custoequipamento, int codigoidentificação, float custoreparo, String tipoequipamento ){
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

     public void setCustoEquipamento( float custoequipamento ){
          this.custoequipamento = custoequipamento;
     }

     public float getCustoEquipamento(){
          return this.custoequipamento;
     }

     public void setCodigoIdentificação( int codigoidentificação ){
          this.codigoidentificação = codigoidentificação;
     } 

     public int getCodigoIdentificação(){
          return this.codigoidentificação;
     }

     public float setCustoReparo( float custoreparo){
          this.custoreparo = custoreparo;
     }

     public float getCustoReparo(){
          return this.custoreparo;
     }

     public void setTipoEquipamento( String tipoequipamento){
          this.tipoequipamento = tipoequipamento;
     }

     public String getTipoEquipamento(){
          return this.tipoequipamento;
     }
     
}
