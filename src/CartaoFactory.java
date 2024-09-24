public class CartaoFactory extends PagamentoFactory{

    private String numeroCartao;

    public CartaoFactory(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }

    @Override
    public Pagamento criarPagamento() {
        return new Cartao(numeroCartao);
    }
}
