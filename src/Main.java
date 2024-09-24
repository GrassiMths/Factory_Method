public class Main {
    public static void main(String[] args) {


        PagamentoService service = new PagamentoService();

        // Escolha de pagamento via cartão de crédito
        PagamentoFactory factoryCartao = new CartaoFactory("1234567812345678");
        System.out.println(service.processarPagamento(factoryCartao, 500.0));

        // Escolha de pagamento via PayPal
        PagamentoFactory factoryPayPal = new PaypalFactory("Teste@teste.com");
        System.out.println(service.processarPagamento(factoryPayPal, 200.0));

        // Escolha de pagamento via Criptomoeda
        PagamentoFactory factoryCripto = new BitcoinFactory(2000.0);
           System.out.println(service.processarPagamento(factoryCripto, 300.0));

        // Escolha de pagamento via Criptomoeda

        PagamentoFactory factoryApplePay = new ApplePayFactory(4000.0);
        System.out.println(service.processarPagamento(factoryApplePay, 1000.0));

    }
}