package dishes.enums;

public enum Morning {
	EGGS(1, "eggs"),
	TOAST(2, "Toast"),
	COFFEE(3, "coffee");
	
	private int valor;
	private String descricao;
	
	private Morning(int valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public static Morning buscarPorValor(int valor) {
		for (Morning m : Morning.values()) {
			if(m.getValor() == valor) {
				return m;
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
