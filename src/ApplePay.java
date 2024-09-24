public class ApplePay implements Pagamento{

    private double saldo;

    public ApplePay(double saldo){
        this.saldo = saldo;
    }

    @Override
    public String processarPagamento(Double valor) {

        if(saldo>= valor){
            return "Pagamento de " + valor + " processado com sucesso via ApplePay.";
        }else{
            return "Erro: Saldo insuficiente.";
        }

    }
}
