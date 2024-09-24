public class BitcoinFactory extends PagamentoFactory{

    private double saldo;

    public BitcoinFactory(double saldo){
        this.saldo = saldo;
    }

    @Override
    public Pagamento criarPagamento() {
        return new Bitcoin(saldo);
    }
}
