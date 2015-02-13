public class Produto {
	private String nome; // nome do produto
	private String desc; // descrição do produto
	private double valor;// valor do produto
	private int quant;// quantidade desse produto no estoque

	
	public void setAll(int quant, String nome, double valor, String desc){
		this.quant = quant;
		this.nome = nome;
		this.valor = valor; 
		this.desc = desc;
	}
	public int getQnt() {
		return quant;
	}

	public String getNome() {
		return this.nome;
	}
 
	public double getValor() {
		return this.valor;
	}

	public String getDesc() {
		return this.desc;
	}
	public static void e(Object... e) { //método para encurtar o processo de impressao na tela
		for (Object e2 : e)
			System.out.println(e2.toString());
	}
	public static  void showall(String nome, String desc, int qnt, double valor) {
		e("");
		e("Nome: " + nome);
		e("Descrição: " + desc);
		e("Quantidade: " + qnt);
		e("Valor: " + "R$ " + valor);
	}

	public static void main(String[] args) {
		Produto p = new Produto();
		p.setAll(1, "Xbox One", 2100.00, "Mais novo console da Microsoft");
		showall(p.getNome(), p.getDesc(), p.getQnt(), p.getValor());		
		p.setAll(100, "Ps4", 4000.00, "Mais novo console da Sony");
		showall(p.getNome(), p.getDesc(), p.getQnt(), p.getValor());	
	}
}
