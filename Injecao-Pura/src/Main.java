public class Main {
    public static void main(String [] args){
        Cliente clientA = new Cliente(new ServicoEmailCliente());
        clientA.emailCliente("a@a", "a", "aaaa");

        Cliente clientB = new Cliente(new ServicoEmailColaborador());
        clientB.emailCliente("b@b", "b", "b");
    }
}


