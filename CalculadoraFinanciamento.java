public class CalculadoraFinanciamento{

    public static void main(String args[]){
    int valorDoCarro = 10000;
    int duracaoDoEmprestimo = 3;
    int taxaDeJuros = 5;
    int valorDeEntrada = 2000; 
    if(duracaoDoEmprestimo <=0 || taxaDeJuros <=0){
        System.out.println("erro, faça o emprestimo valido");
    }
    else if (valorDeEntrada >= valorDoCarro){
        System.out.println("O carro pode ser pago integralmente");
    }
    else{
    int saldoRestante = valorDoCarro - valorDeEntrada;
    int numeroDeMeses = duracaoDoEmprestimo * 12;
    int saldoMensal = saldoRestante / numeroDeMeses;
    int juros = saldoMensal * taxaDeJuros / 100;
    int pagamentoMensal = saldoMensal + juros;
    System.out.println(pagamentoMensal);
        }
    }
}

   

