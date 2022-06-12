
/**
 * SI - POO - Prof. Fausto Ayres
 * Projeto: Relacionamento *:* e heran�a
 * Teste das classes Participante - Convidado
 *
 */
public class Aplicacao1 {
	public static void main(String[] args) {
		/*
		  Exemplo:
			um participante de 17 anos ter� um percentual de desconto de 50% pela idade, 
			um convidado de 17 anos ter� um percentual de 100% (50% pela idade + 50% de b�nus). 
			Para um evento com pre�o de R$1000,00, o participante pagar� R$500,00 e convidado n�o pagar� nada.
			(valor pago = preco - preco*percentual/100)
		 */

		Participante joao = 	new Participante("joao@gmail.com", "joao", 17);
		Participante maria = 	new Participante("maria@gmail.com", "maria", 30);
		Participante pedro = 	new Participante("pedro@gmail.com", "pedro", 70);
		Convidado paulo = 		new Convidado("paulo@gmail.com", "paulo",  17, "empresa1");
		Convidado katia = 		new Convidado("katia@gmail.com", "katia",  30, "empresa2");
		Convidado antonio =		new Convidado("antonio@gmail.com", "antonio",  70, "empresa3");

		System.out.println("\n----participantes");
		System.out.println(joao);
		System.out.println(maria);
		System.out.println(pedro);

		System.out.println("\n----convidados");
		System.out.println(paulo);
		System.out.println(katia);
		System.out.println(antonio);

		System.out.println("\nvalores pagos pelos participantes para preco de 1000");
		System.out.println("joao =R$"+joao.getValorPago(1000.0));
		System.out.println("maria=R$"+maria.getValorPago(1000.0));
		System.out.println("pedro=R$"+pedro.getValorPago(1000.0));

		System.out.println("\nvalores pagos pelos convidados para preco de 1000");
		System.out.println("paulo=R$"+paulo.getValorPago(1000.0));
		System.out.println("katia=R$"+katia.getValorPago(1000.0));
		System.out.println("antonio=R$"+antonio.getValorPago(1000.0));;
	}

}
