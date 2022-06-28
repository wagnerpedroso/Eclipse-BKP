public class Cliente {
    private IServicoEmail _servicoEmail;

    public Cliente(IServicoEmail servicoEmail) {
        this._servicoEmail = servicoEmail;
    }

    public void emailCliente(String email, String titulo, String mensagem) {
        _servicoEmail.enviarEmail(mensagem);
    }
}
