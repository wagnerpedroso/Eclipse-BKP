public class ServicoEmailColaborador implements IServicoEmail {
    @Override
    public void enviarEmail(String mensagem) {
        System.out.println("Email Corporativo");
        System.out.println("Mensagem: " + mensagem);
    }
}
