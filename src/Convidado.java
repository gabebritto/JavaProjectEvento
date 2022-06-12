public class Convidado extends Participante{
	private String empresa;
	
	public Convidado(String email, String nome, int idade, String empresa) {
		super(email, nome, idade);
		this.setEmpresa(empresa);
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Empresa= " + empresa + ", " + super.toString();
	}
	@Override
	public int getPercentual() {
		int desconto;
		
		if (this.getIdade() < 18)
			desconto = 50;
		else if (18 <= this.getIdade() && this.getIdade() < 60)
			desconto = 0;
		else
			desconto = 20;
	
		return desconto + 50;
	}
}