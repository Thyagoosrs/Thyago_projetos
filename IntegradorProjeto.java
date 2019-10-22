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
			System.out.println("D� o comando no teclado:");
			System.out.println("1-      INSTRU��ES");
			System.out.println("2-           JOGAR");
			System.out.println("3-        CR�DITOS");
			System.out.println("4-            SAIR");
			System.out.println("                  ");

			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Vejo que escolheu a op��o 'INSTRU��ES' \n" + "Estamos ansiosos para conhec�-lo!\n"
						+ "Tomara que fa�amos progresso. As instru��es para o jogo s�o, inicialmente, muito simples: \n"
						+ " \n"
						+ "1�: Ficar atento ao teclado, aos comandos do narrador. \n"
						+ "2�: Providenciar meio para calcularos problemas a serem resolvidos. \n"
						+ "3�: Trabalharemos com pistas, e essas pistas ser�o baseadas na mat�ria de Conceitos da Computa��o. \n"
						+ " \n"
						+ " \n"
						+ "UM �TIMO JOGO E BOA SORTE!");
				break;
			case 2:
				System.out.println("Bem-vindo, " + NomeJogador
						+ ", ao universo de MiddeTown. \n"
						+ "Voc� � o mais novo morador desta cidade pacata, do interior da Inglaterra. O lugar � pequeno, �mido e frio, al�m de\n"
						+ "um tanto quanto escuro. N�o � raro ser pego de surpresa por uma chuva intensa e r�pida.\n"
						+ "As pessoas t�m uma receptividade meio estranha. N�o se confia uns nos outros por aqui.");
				System.out.println(" ");
				System.out.println("A cidade de MiddleTown j� foi comum um dia, diz o bonach�o Mr. Thomas, dono da\n"
						+ "padaria. De uns anos pra c�, uma onda de mist�rios tomou a cidade. Talvez seja porque\n"
						+ "a cidadela seja bastante distante das outras 'civiliza��es'. O que � mais interessante � que\n"
						+ "os cidad�os ficarm t�o frios que parecem n�o se importar muito com o que tem havido. \n"
						+ "Todos no ritmo vagaroso da pacata cidade." + " \n"
						+ "Bem, o lugar � pitoresco, mas n�o � t�o ruim assim. Tem a Dona Mary, que faz bolos deliciosos,\n"
						+ "tem a Emilly, que vende flores na esquina da rua Michael, e tem at� o taxista, Mr. Patrick, \n"
						+ "o �nico da cidade, com seu carro antigo, mas t�o bem cuidado que parece novo, pois � tudo o que tem na vida.\n"
						+ " \n" + "FA�O-LHE ENT�O O CONVITE PARA ENTRAR!" + " \n" + " \n" + "ENTRAR:\n" + "SIM\n"
						+ "N�O\n");
				entrar = entrada.next();

				if ((entrar.equals("Sim")) || (entrar.equals("sim"))) {
					System.out.println("Pois bem, n�o diga que n�o avisei! Voc� acaba de entrar na cidade de \n"
							+ "MiddleTown, lugar de pessoas interessantes e outras exc�ntricas. Al�m disso, � um povoado \n"
							+ "onde ocorrem coisas estranhas. E � nesse ponto que eu queria chegar.\n" + " \n"
							+ "Algu�m me disse que (n�o me pergunte como, meu caro), que voc� gosta de resolver problemas.\n"
							+ "Pois ent�o, h� dias que a situa��o da regi�o tem complicado, desde que o Detetive, Sir Watson,\n"
							+ " homem de extrema eleg�ncia, mas que mancava de uma perna (tinha servido o ex�rcito e herdou a marca),\n"
							+ "foi embora. Disse que ia atr�s de um velho amigo, que lhe ensinou tudo o que sabia sobre investiga��es.\n"
							+ " \n"
							+ "O fato � que o departamento de pol�cia da regi�o, comandado pelo delegado Otho, n�o tem dado conta de resolver\n"
							+ "casos estranhos e advent�cios da regi�o. Foi desde ent�o que o reservado Karl Rahnner, de cuja vida ningu�m\n"
							+ "sabe a respeito, quem assumiu o cargo de Detetive. N�o que seu curr�culo lhe permitisse, uma vez que sua forma��o\n"
							+ "se voltava �s ci�ncias biol�gicas. Mas de alguma forma todos sabiam que era vocacionado para tais situa��es: \n"
							+ "desvendar enigmas, mist�rios, crimes.\n" + " \n"
							+ "E � aqui onde entra o 'x' da quest�o: Fa�o-lhe um convite para que voc� se junte � cidade, j� com uma \n"
							+ "proposta de emprego. Bem, n�o � tanto um emprego, � mesmo uma miss�o. \n"
							+ "Voc� ter� de tomar o lugar de auxiliar de Karl Rahnner nas investiga��es e ajudar a desvendar os mist�rios da\n"
							+ "Cidade de MiddleTown.\n" + " \n" + "Voc� aceita a proposta? (SIM/N�O)" + " \n" + " \n");
					entrar2 = entrada.next();

					if ((entrar2.equals("Sim")) || (entrar2.equals("sim"))) {
						System.out.println("Sem mais delongas, vamos aos fatos: � noite chuvosa nas ruas de MiddleTown.\n"
								+ "O viciado Karl Rahnner toma um copo de Whisky para acalmar os �nimos, enquanto acende seu charuto Hoyo de Monterrey,\n"
								+ "comprado na venda do auspicioso Ashburn. O corpo soa frio. � comum acontecer a quem � obcecado em resolver problemas.(****RANDOMICIDADE PARA OUTRAS AMARRA��ES NA HIST�RIA****)\n"
								+ "\n"
								+ "N�o lhe sai da cabe�a os olhos amarelados. N�o. N�o seria a tradicional morte por hepatite fulminante, uma vez que os punhos \n"
								+ "encontravam-se cerrados.\n"
								+ "Mas o intrigara mais o anel, com uma grande pedra de oppenheimer. Sim, aquele diamante azu, aquela que era uma das pedras mais preciosas do mundo,\n"
								+ "era nela que se encontrava a chave para o problema. Aquela mo�a estirada, com uma beleza p�lida e triste, onde conseguira artefatot�o estim�vel?\n"
								+ "\n"
								+ "Karl Rahnner, com sua personalidade dubit�vel e escassez de senso moral, havia pegado, sem que ningu�m percebesse,\n"
								+ "um tablet do local do crime, poucos minutos antes da inspetora Kate Morgan, por quem nitria um respeito desrespeitoso,\n"
								+ "chegar ao local.\n"
								+ "Rahnner andava em c�rculos em volta do tablet ao ch�o , pensando em como iria desvendar o c�digo do aparelho,\n"
								+ "dado por um problema, envolvendo c�lculo de n�meros bin�rios.\n"
								+ "Nada t�o estranho ao astuto detetive, que estudara alguma coisa de inform�tica na �poca da faculdade, com um vago conhecido\n"
								+ "que o tinha por amigo.\n"
								+ "O barulho dos passos era s� o que se escutava, enquanto olhava para o c�digo. \n"
								+ " \n"
								+ "Parece que Karl Rahnner tem algo � sua frente! \n"
								+ "� seu dever ajud�-lo a desvendar o mist�rio. Como voc� far�? \n"
								+ " \n"
								+ "DIGITE ALGO PARA EXIBIR O C�DIGO DO TABLET: \n");
								String QualquerCoisa = entrada.next();
								
								System.out.println("*****EXIBIR PROBLEMA*****");
								
					} else {
						System.out.println(
								"� uma pena que, a essa altura, voc� queira desistir. Mas acredito que voc� tomou uma decis�o s�bia!\n"
										+ "Os que adentram esta realidade acabam por se deparar com desafios muitas vezes confusos e inconclusos.\n"
										+ "Quando se sentir preparado, ficarei feliz em acolh�-lo. Mas segue um aviso: N�o retorne se n�o quiser ser desafiado.\n"
										+ "Se n�o estiver disposto a resolver problemas. O universo de MiddleTown � somente para os esp�ritos fortes.\n"
										+ " \n" + "Tem certeza que deseja recusar a proposta? (SIM/N�O)");
						entrar3 = entrada.next();

						if ((entrar3.equals("N�o")) || (entrar3.equals("n�o")) || (entrar3.equals("Nao"))
								|| (entrar3.equals("nao"))) {
							System.out.println("*********Continuar game daqui...**********");
						} else if ((entrar3.equals("Sim")) || (entrar3.equals("sim"))) {
							System.out.println("*****ENCERRAR GAME AQUI!!!!*****");
						}
					}

				} else if ((entrar.equals("N�o")) || (entrar.equals("n�o")) || (entrar.equals("Nao"))
						|| (entrar.equals("nao"))) {
					System.out.println(
							"� uma pena que, a essa altura, voc� queira desistir. Mas acredito que voc� tomou uma decis�o s�bia!\n"
									+ "Os que adentram esta realidade acabam por se deparar com desafios muitas vezes confusos e inconclusos.\n"
									+ "Quando se sentir preparado, ficarei feliz em acolh�-lo. Mas segue um aviso: N�o retorne se n�o quiser ser desafiado.\n"
									+ "Se n�o estiver disposto a resolver problemas. O universo de MiddleTown � somente para os esp�ritos fortes.\n"
									+ " \n" + "END GAME!");
				}
				break;
			case 3:
				System.out.println("Creditos: Thyago Rodrigues, Reyner, Victor e Matheus, alunos do 1� per�odo \n"
						+ "do curso de An�lise e Desenvolvimento de Sistemas, 2� semestre de 2019. ");
				break;
			case 4:
				System.out.println("Fim de Jogo!");
				break;
			}
		} while ((menu < 4) && (menu != 2));
	}

}
