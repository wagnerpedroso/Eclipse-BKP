package filmes;

import java.time.LocalDate;

public class Conteudo {


		public String nomeF;
		protected Genero genero;
		protected LocalDate anoLancamento;
		protected String sinopse;
		protected int curtidas; 
		protected int descurtidas;
	//	private int recomendado;
		
//		public class curtirDescurtir { 
//			
//			
//			
//		}
//		
		
		
		public String getNomeF() {
			return nomeF;
		}
		public void setNome(String nomeF) {
			this.nomeF = nomeF;
		}
		public Genero getGenero() {
			return genero;
		}
		public void setGenero(Genero genero) {
			this.genero = genero;
		}
		public LocalDate getAnoLancamento() {
			return anoLancamento;
		}
		public void setAnoLancamento(LocalDate anoLancamento) {
			this.anoLancamento = anoLancamento;
		}
		public String getSinopse() {
			return sinopse;
		}
		public void setSinopse(String sinopse) {
			this.sinopse = sinopse;
		}
		public int getCurtidas() {
			return curtidas;
		}
		public void setCurtidas(int curtidas) {
			this.curtidas = curtidas;
		}
		public int getDescurtidas() {
			return descurtidas;
		}
		public void setDescurtidas(int descurtidas) {
			this.descurtidas = descurtidas;
		}


		
	
}
