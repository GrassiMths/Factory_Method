public class Bitcoin implements Pagamento{

private double saldo;

public Bitcoin(double saldo){
    this.saldo = saldo;
}

    @Override
    public String processarPagamento(Double valor) {
        if(saldo >= valor){
            return "Pagamento de " + valor + " processado com sucesso via Criptomoeda.";
        }else{
            return "Erro: Saldo insuficiente.";
        }
    }

}
