import java.util.ArrayList;
import preco, id;

public class Participante {
	private String email;
	private String nome;
	private id idade;
	private ArrayList<Evento> eventos = new ArrayList<Integer>();
	
	public int getPercentual() {
		int desconto;
		
		if (this.idade < 18)
			desconto = 50;
		else if (18 <= this.idade < 60)
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
	
}
