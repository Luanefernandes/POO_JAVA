package aviao;


public class aviao {

	private String nomeCompanhia;
	private int numVoo;
	private boolean statusVoo;

	public aviao(String nomeC, int numV, boolean statusV) {
		nomeCompanhia = nomeC;
		numVoo = numV;
		statusVoo = statusV;
	}

	public String mostrarDados() {
		String informacoes = "Nome da Companhia de Voo:" + nomeCompanhia + "\nN�mero do Voo:" + numVoo;

		return informacoes;
	}

	public String verificarStatus() {
		String verificacao;
		if (statusVoo == true) {
			verificacao = "O avi�o decolou";
		} else {
			verificacao = "O avi�o ainda n�o decolou";
		}
		return verificacao;
	}
}