import java.util.ArrayList;


public class Evento {
	private int id;
	private String data;
	private String descricao;
	private double preco;
	private ArrayList<Participante> participantes;
	
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
		double totalPago;
		return totalPago = 2;
	}
	
	public void adicionar(Participante p) {
		
	}
	
	public void remover(Participante p) {
		
	}
	
	public double getIadeMedia() {
		double idade;
		return idade= 1;
	}
	
	public ArrayList<Participante> getParticipantesPorIdade(int idade){
		ArrayList<Participante> teste = new ArrayList<>();
		return teste;
	}
	
	public int contarConvidados() {
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

