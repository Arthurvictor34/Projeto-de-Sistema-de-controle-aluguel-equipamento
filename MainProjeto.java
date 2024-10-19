public class MainProjeto{

    public static void main( String[] args ){
        Equipamento eq1 = new Equipamento();
        eq1.setNomeEquipamento ( "Picareta");
        eq1.setCustoEquipamento ( 110.87);
        eq1.setCodigoIdentificação (  54774021); // Codigo gerado aleatoriamente
        eq1.setCustoReparo ( 20.76);
        eq1.setTipoEquipamento ( "Uso manual");

        Aluguel al1 = new Aluguel();
        al1.setValorHora( 20.50f);
        al1.setFormaPagamento( "Pix"); // Pix, cartão de credito e debito ou dinheiro.
        al1.setDataInicio ( "17/10/2024");
        al1.setDataFim( "20/10/2024");
        al1.SetValorDiaria ( 200.76);
        al1.setStatus( "Alugada"); // Se a ferramente está alugada ou livre.

        Cliente cl1 = new Cliente();
        cl1.setNome( "Roberto");
        cl1.setSobrenome( "Carlos");
        cl1.setCelular(  "81 81234 8124");
        cl1.setCPF( "983-214-211-19");
        cl1.setIdade( 21);

        // Exemplo de impimir a informação na tela
        System.out.print(" O nome do cliente é: " + cl1.getNome());
        System.out.print(" " + cl1.getSobrenome());


    }

}