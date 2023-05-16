
public class Studente {
	private String nome;
	private int annoNascita;
	
	public Studente(String nome, int annoNascita) {
		this.nome=nome;
		this.annoNascita=annoNascita;
	}
	public Studente() {
		nome="";
		annoNascita=0;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public int getAnnoNascita() {
		return this.annoNascita;
	}
	public void setAnnoNascita(int annoNascita) {
		this.annoNascita=annoNascita;
	}
	public String toString() {
		return "Studente("+"Nome = "+nome+" Anno nascita = "+annoNascita+")";
	}
}