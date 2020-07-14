package AULA02;

public class exe_02 extends exe_01 {

	private Double valorCredito;
	private Double valorDivida;
	
	
	public exe_02(Double valorCredito, Double valorDivida, String nome, String endereco, String telefone) {
		
		super(nome,endereco,telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}	

	public Double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(Double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public Double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(Double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public Double obterSaldo() {
		double saldo = valorCredito - valorDivida;
		return saldo;
		
	}
	
	
}
