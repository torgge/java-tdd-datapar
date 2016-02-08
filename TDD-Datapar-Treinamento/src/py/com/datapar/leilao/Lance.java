package br.com.bonespirito.leilao;

public class Lance {

	private Usuario usuario;
	private double valor = Double.NEGATIVE_INFINITY;
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Lance(Usuario usuario, float valor) {
		super();
		this.usuario = usuario;
		this.valor = valor;
	}
	
}
