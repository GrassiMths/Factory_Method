public class ApplePayFactory extends PagamentoFactory{

    private double saldo;

    public ApplePayFactory(double saldo){
        this.saldo = saldo;
    }

    @Override
    public Pagamento criarPagamento() {
        return new ApplePay(saldo);
    }
}
