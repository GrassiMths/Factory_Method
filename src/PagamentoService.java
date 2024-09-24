public class PagamentoService {

    public String processarPagamento(PagamentoFactory pagamentoFactory, double valor){

        Pagamento pagamento = pagamentoFactory.criarPagamento();

        return pagamento.processarPagamento(valor);
    }

}
