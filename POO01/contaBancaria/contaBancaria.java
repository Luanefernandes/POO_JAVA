package contaBancaria;

public class contaBancaria {

	private String nomeDono;
	private int codConta;
	private int agConta;
	private double saldo;
	private double valorDeposito;
	private double valorSaque;
	
	public contaBancaria(String nome, int contaC, int ag, double sal, double deposito, double saque)
	{
		nomeDono = nome;
		codConta = contaC;
		agConta = ag;
		saldo = sal;
		valorDeposito = deposito;
		valorSaque = saque;
	}
	
	public String mostrarDados() {
		String informacao= nomeDono+"\nC�digo da conta: "+codConta+"\nN�mero da ag�ncia: "+agConta+"\nSaldo Conta Corrente: "+saldo;
		return informacao;
	}
	
	public String sacarDinheiro() {
		String extrato;
		saldo = saldo - valorSaque;
		extrato = "Voc� sacou: "+ valorSaque+ "\nSaldo restante em conta: "+saldo;
		return extrato;
	}
	
	public String depositarDinheiro() {
		String extrato;
		saldo = saldo + valorDeposito;
		extrato = "Voc� depositou: "+valorDeposito+"\nSaldo restante em conta: "+saldo;
		return extrato;
	}
	
}
