public class ServicoEmailCliente implements IServicoEmail {
    @Override
    public void enviarEmail(String mensagem) {
        System.out.println("Email Cliente");
        System.out.println("Mensagem: " + mensagem);
    }
}
