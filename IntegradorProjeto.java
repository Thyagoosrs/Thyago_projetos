import java.util.Scanner;

public class IntegradorProjeto {

	public static void main(String[] args) {
		String NomeJogador;
		String entrar = null, entrar2 = null, entrar3 = null;
		Scanner entrada = new Scanner(System.in);
		int menu = 0;

		System.out.println("--------------------------------------------");
		System.out.println("          ************************          ");
		System.out.println("          DarK CaseS oF MiddletowN          ");
		System.out.println("          ************************          ");
		System.out.println("--------------------------------------------");
		System.out.println("                  ");
		System.out.println("SEJA BEM-VINDO!");
		System.out.println("                  ");

		System.out.println("Digite seu nome: ");
		NomeJogador = entrada.next();

		do {
			System.out.println("                  ");
			System.out.println("Dê o comando no teclado:");
			System.out.println("1-      INSTRUÇÕES");
			System.out.println("2-           JOGAR");
			System.out.println("3-        CRÉDITOS");
			System.out.println("4-            SAIR");
			System.out.println("                  ");

			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Vejo que escolheu a opção 'INSTRUÇÕES' \n" + "Estamos ansiosos para conhecê-lo!\n"
						+ "Tomara que façamos progresso. As instruções para o jogo são, inicialmente, muito simples: \n"
						+ " \n"
						+ "1º: Ficar atento ao teclado, aos comandos do narrador. \n"
						+ "2º: Providenciar meio para calcularos problemas a serem resolvidos. \n"
						+ "3º: Trabalharemos com pistas, e essas pistas serão baseadas na matéria de Conceitos da Computação. \n"
						+ " \n"
						+ " \n"
						+ "UM ÓTIMO JOGO E BOA SORTE!");
				break;
			case 2:
				System.out.println("Bem-vindo, " + NomeJogador
						+ ", ao universo de MiddeTown. \n"
						+ "Você é o mais novo morador desta cidade pacata, do interior da Inglaterra. O lugar é pequeno, úmido e frio, além de\n"
						+ "um tanto quanto escuro. Não é raro ser pego de surpresa por uma chuva intensa e rápida.\n"
						+ "As pessoas têm uma receptividade meio estranha. Não se confia uns nos outros por aqui.");
				System.out.println(" ");
				System.out.println("A cidade de MiddleTown já foi comum um dia, diz o bonachão Mr. Thomas, dono da\n"
						+ "padaria. De uns anos pra cá, uma onda de mistérios tomou a cidade. Talvez seja porque\n"
						+ "a cidadela seja bastante distante das outras 'civilizações'. O que é mais interessante é que\n"
						+ "os cidadãos ficarm tão frios que parecem não se importar muito com o que tem havido. \n"
						+ "Todos no ritmo vagaroso da pacata cidade." + " \n"
						+ "Bem, o lugar é pitoresco, mas não é tão ruim assim. Tem a Dona Mary, que faz bolos deliciosos,\n"
						+ "tem a Emilly, que vende flores na esquina da rua Michael, e tem até o taxista, Mr. Patrick, \n"
						+ "o único da cidade, com seu carro antigo, mas tão bem cuidado que parece novo, pois é tudo o que tem na vida.\n"
						+ " \n" + "FAÇO-LHE ENTÃO O CONVITE PARA ENTRAR!" + " \n" + " \n" + "ENTRAR:\n" + "SIM\n"
						+ "NÃO\n");
				entrar = entrada.next();

				if ((entrar.equals("Sim")) || (entrar.equals("sim"))) {
					System.out.println("Pois bem, não diga que não avisei! Você acaba de entrar na cidade de \n"
							+ "MiddleTown, lugar de pessoas interessantes e outras excêntricas. Além disso, é um povoado \n"
							+ "onde ocorrem coisas estranhas. E é nesse ponto que eu queria chegar.\n" + " \n"
							+ "Alguém me disse que (não me pergunte como, meu caro), que você gosta de resolver problemas.\n"
							+ "Pois então, há dias que a situação da região tem complicado, desde que o Detetive, Sir Watson,\n"
							+ " homem de extrema elegância, mas que mancava de uma perna (tinha servido o exército e herdou a marca),\n"
							+ "foi embora. Disse que ia atrás de um velho amigo, que lhe ensinou tudo o que sabia sobre investigações.\n"
							+ " \n"
							+ "O fato é que o departamento de polícia da região, comandado pelo delegado Otho, não tem dado conta de resolver\n"
							+ "casos estranhos e adventícios da região. Foi desde então que o reservado Karl Rahnner, de cuja vida ninguém\n"
							+ "sabe a respeito, quem assumiu o cargo de Detetive. Não que seu currículo lhe permitisse, uma vez que sua formação\n"
							+ "se voltava às ciências biológicas. Mas de alguma forma todos sabiam que era vocacionado para tais situações: \n"
							+ "desvendar enigmas, mistérios, crimes.\n" + " \n"
							+ "E é aqui onde entra o 'x' da questão: Faço-lhe um convite para que você se junte à cidade, já com uma \n"
							+ "proposta de emprego. Bem, não é tanto um emprego, é mesmo uma missão. \n"
							+ "Você terá de tomar o lugar de auxiliar de Karl Rahnner nas investigações e ajudar a desvendar os mistérios da\n"
							+ "Cidade de MiddleTown.\n" + " \n" + "Você aceita a proposta? (SIM/NÃO)" + " \n" + " \n");
					entrar2 = entrada.next();

					if ((entrar2.equals("Sim")) || (entrar2.equals("sim"))) {
						System.out.println("Sem mais delongas, vamos aos fatos: É noite chuvosa nas ruas de MiddleTown.\n"
								+ "O viciado Karl Rahnner toma um copo de Whisky para acalmar os ânimos, enquanto acende seu charuto Hoyo de Monterrey,\n"
								+ "comprado na venda do auspicioso Ashburn. O corpo soa frio. É comum acontecer a quem é obcecado em resolver problemas.(****RANDOMICIDADE PARA OUTRAS AMARRAÇÕES NA HISTÓRIA****)\n"
								+ "\n"
								+ "Não lhe sai da cabeça os olhos amarelados. Não. Não seria a tradicional morte por hepatite fulminante, uma vez que os punhos \n"
								+ "encontravam-se cerrados.\n"
								+ "Mas o intrigara mais o anel, com uma grande pedra de oppenheimer. Sim, aquele diamante azu, aquela que era uma das pedras mais preciosas do mundo,\n"
								+ "era nela que se encontrava a chave para o problema. Aquela moça estirada, com uma beleza pálida e triste, onde conseguira artefatotão estimável?\n"
								+ "\n"
								+ "Karl Rahnner, com sua personalidade dubitável e escassez de senso moral, havia pegado, sem que ninguém percebesse,\n"
								+ "um tablet do local do crime, poucos minutos antes da inspetora Kate Morgan, por quem nitria um respeito desrespeitoso,\n"
								+ "chegar ao local.\n"
								+ "Rahnner andava em círculos em volta do tablet ao chão , pensando em como iria desvendar o código do aparelho,\n"
								+ "dado por um problema, envolvendo cálculo de números binários.\n"
								+ "Nada tão estranho ao astuto detetive, que estudara alguma coisa de informática na época da faculdade, com um vago conhecido\n"
								+ "que o tinha por amigo.\n"
								+ "O barulho dos passos era só o que se escutava, enquanto olhava para o código. \n"
								+ " \n"
								+ "Parece que Karl Rahnner tem algo à sua frente! \n"
								+ "É seu dever ajudá-lo a desvendar o mistério. Como você fará? \n"
								+ " \n"
								+ "DIGITE ALGO PARA EXIBIR O CÓDIGO DO TABLET: \n");
								String QualquerCoisa = entrada.next();
								
								System.out.println("*****EXIBIR PROBLEMA*****");
								
					} else {
						System.out.println(
								"É uma pena que, a essa altura, você queira desistir. Mas acredito que você tomou uma decisão sábia!\n"
										+ "Os que adentram esta realidade acabam por se deparar com desafios muitas vezes confusos e inconclusos.\n"
										+ "Quando se sentir preparado, ficarei feliz em acolhê-lo. Mas segue um aviso: Não retorne se não quiser ser desafiado.\n"
										+ "Se não estiver disposto a resolver problemas. O universo de MiddleTown é somente para os espíritos fortes.\n"
										+ " \n" + "Tem certeza que deseja recusar a proposta? (SIM/NÃO)");
						entrar3 = entrada.next();

						if ((entrar3.equals("Não")) || (entrar3.equals("não")) || (entrar3.equals("Nao"))
								|| (entrar3.equals("nao"))) {
							System.out.println("*********Continuar game daqui...**********");
						} else if ((entrar3.equals("Sim")) || (entrar3.equals("sim"))) {
							System.out.println("*****ENCERRAR GAME AQUI!!!!*****");
						}
					}

				} else if ((entrar.equals("Não")) || (entrar.equals("não")) || (entrar.equals("Nao"))
						|| (entrar.equals("nao"))) {
					System.out.println(
							"É uma pena que, a essa altura, você queira desistir. Mas acredito que você tomou uma decisão sábia!\n"
									+ "Os que adentram esta realidade acabam por se deparar com desafios muitas vezes confusos e inconclusos.\n"
									+ "Quando se sentir preparado, ficarei feliz em acolhê-lo. Mas segue um aviso: Não retorne se não quiser ser desafiado.\n"
									+ "Se não estiver disposto a resolver problemas. O universo de MiddleTown é somente para os espíritos fortes.\n"
									+ " \n" + "END GAME!");
				}
				break;
			case 3:
				System.out.println("Creditos: Thyago Rodrigues, Reyner, Victor e Matheus, alunos do 1º período \n"
						+ "do curso de Análise e Desenvolvimento de Sistemas, 2º semestre de 2019. ");
				break;
			case 4:
				System.out.println("Fim de Jogo!");
				break;
			}
		} while ((menu < 4) && (menu != 2));
	}

}
