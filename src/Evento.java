import java.util.ArrayList;


public class Evento {
	private int id;
	private String data;
	private String descricao;
	private double preco;
	private ArrayList<Participante> participantes;
	
	public Evento(int id, String data, String descricao, double preco) {
		this.id = id;
		this.data = data;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}
	
	public void setParticipantes(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getTotalValorPago() {
		double totalValor = 0;
		
		for (Participante p : this.getParticipantes()) {
			totalValor += p.getValorPago(this.getPreco());
		}
		return totalValor;
	}
	
	public void adicionar(Participante p) {
		this.getParticipantes().add(p);
	}
	
	public void remover(Participante p) {
		this.getParticipantes().remove(p);
	}
	
	public double getIadeMedia() {
		double idadeTotal = 0;
		double media;
		
		for(Participante p : this.getParticipantes()) {
			idadeTotal += p.getIdade();
		}
		media = idadeTotal/this.getParticipantes().size();
		return media;
	}
	
	public ArrayList<Participante> getParticipantesPorIdade(int idade){
		ArrayList<Participante> idadeIgual = new ArrayList<>();
		
		for (Participante p : this.getParticipantes()) {
			if (p.getIdade() == idade)
				idadeIgual.add(p);
		}
		
		return idadeIgual;
	}
	
	public int contarConvidados() {
		int nConvidados = 0;
		for (Participante p : this.getParticipantes()) {
			if (p.)
		}
		
		int convidados = 1;
		return convidados;
	}
	
	public ArrayList<Convidado> getConvidados(){
		ArrayList<Convidado> teste = new ArrayList<>();
		return teste;
	}
	
	public int contarGratuidades() {
		int gratuito = 1;
		return gratuito;
	}
	
	public ArrayList<Convidado> getConvidados(String empresa){
		ArrayList<Convidado> text = new ArrayList<>();
		return text;
	}
	
	public Participante localizar(String nome) {
		Participante a = null;
		return a;
	}
}

