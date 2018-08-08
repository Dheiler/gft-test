package dishes.enums;

public enum Night {
	STEAK(1, "steak"),
	POTATO(2, "potato"),
	WINE(3, "wine"),
	CAKE(4, "cake");
	
	private int valor;
	private String descricao;
	
	private Night(int valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public static Night buscarPorValor(int valor) {
		for (Night n : Night.values()) {
			if(n.getValor() == valor) {
				return n;
			}
		}
		return null;
	}

	public int getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}
}
