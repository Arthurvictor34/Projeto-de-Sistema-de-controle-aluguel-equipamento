public class MainProjeto{

    public static void main( String[] args ){
        Equipamento eq1 = new Equipamento();
        eq1.getNomeEquipamento = "Picareta";git init 
        eq1.getCustoEquipamento = 110.87f;
        eq1.getCodigoIdentificação = 54774021; // Codigo gerado aleatoriamente
        eq1.getCustoReparo = 20.76f;
        eq1.getTipoEquipamento = "Uso manual";

        Aluguel al1 = new Aluguel();
        al1.getValorHora = 20.50f;
        al1.getFormaPagamento = "Pix" // Pix, cartão de credito e debito ou dinheiro.
        al1.getDataInicio = "17/10/2024";
        al1.getDataFim = "20/10/2024";
        al1.GetValorDiaria = 200.76f;
        al1.getStatus = "Alugada"; // Se a ferramente está alugada ou livre.

        Cliente cl1 = new Cliente();
        cl1.getNome = "Roberto";
        cl1.getSobrenome = " Carlos";
        cl1.getCelular = "81 81234 8124";
        cl1.getCPF = "983-214-211-19";
        cl1.getIdade = 21;
    }

}