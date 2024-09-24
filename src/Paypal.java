public class Paypal implements Pagamento{

    private String email;

    public Paypal(String email){
        this.email = email;
    }


    @Override
    public String processarPagamento(Double valor) {
        if (verificarEmail()){
            return "Pagamento de " + valor + " processado com sucesso via PayPal.";
        }else{
            return "Erro: Conta PayPal inválida.";
        }
    }

    private boolean verificarEmail(){
        return email.contains("@");
    }

}
