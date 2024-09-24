public class PaypalFactory extends PagamentoFactory{

    private String email;

    public PaypalFactory(String email){
        this.email = email;
    }

    @Override
    public Pagamento criarPagamento() {
        return new Paypal(email);
    }
}
