import java.util.ArrayList;

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
	
	@Override
	public String toString() {
		return "email=" + email + ", nome=" + nome 
				+ ", idade=" + idade + ", percentual=" + (getPercentual()*100) 
				+ ", eventos:" + eventos;
	}
	
	public int getPercentual() {
		int desconto;
		
		if (this.getIdade() < 18) {
			desconto = 50;
		}else if (this.getIdade() < 60)
			desconto = 0;
		else
			desconto = 20;		
		return desconto;
	}
	
	public double getValorPago(double preco) {
		int desconto = getPercentual();
		
		double descontoReal = desconto / 100.0;
		double valorPago = preco - preco * descontoReal; 
		
		return valorPago;
	}

	public ArrayList<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public void adicionar(Evento ev) {
		this.getEventos().add(ev);
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

	public void remover(Evento ev) {
		this.getEventos().remove(ev);
	}
	
	public Evento localizar(int id) {
		for (Evento ev: this.getEventos())
			if (ev.getId() == id)
				return ev;
		
		return null;
	}
}
