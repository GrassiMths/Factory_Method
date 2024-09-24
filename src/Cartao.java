public class Cartao implements Pagamento{

    private String numeroCartao;

            public Cartao(String numeroCartao){
        this.numeroCartao = numeroCartao;
            }

    @Override
    public String processarPagamento(Double valor) {
        if(validarNumero()){
            return "Pagamento de " + valor + " processado com sucesso via Cartão de Crédito.";
        } else{
            return "Erro: Número de cartão inválido.";
        }
    }

    private Boolean validarNumero(){
        return numeroCartao.length() == 16;
    }

}
