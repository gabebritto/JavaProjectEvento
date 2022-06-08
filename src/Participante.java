import java.util.ArrayList;
import preco, id;

public class Participante {
	private String email;
	private String nome;
	private int idade;
	private ArrayList<Evento> eventos = new ArrayList<>();
	
	public Participante(String email, String nome, int idade) {
		this.email = email;
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getPercentual() {
		int desconto;
		
		if (this.getIdade() < 18)
			desconto = 50;
		else if (18 <= this.getIdade() && this.getIdade() < 60)
			desconto = 0;
		else
			desconto = 20;
		
		return desconto;
	}
	
	public double getValorPago(double preco) {
		return preco;
	}
	
	public void adicionar(ArrayList<Evento> eventos) {
		this.eventos =  eventos.add()
		return this.eventos
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public ArrayList<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}
	
}
