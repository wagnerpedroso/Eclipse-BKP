import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Pessoa> lista = new ArrayList<>();

	public void adiciona(Pessoa pessoa) {
		lista.add(pessoa);
	}
	
	public List<Pessoa> getPessoas(){
		return lista;
	}
}
