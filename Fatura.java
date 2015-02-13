public class Fatura {
	
	/*public double valorFatura() {
		return this.getQnt() * this.getValor();
	}
*/	
	private String nome;
	private String number;
	private String desc;
	private int qntItem;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQntItem() {
		return qntItem;
	}
	public void setQntItem(int qntItem) {
		this.qntItem = qntItem;
	}
	public double getPreco() {
		if (this.preco > 0) {
		return preco;
		}
		this.preco =0;
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getValorFatura() {
		double total = this.getQntItem() * this.getPreco();
		if(total > 0) {
		return total;
		}
		total =0;
		return total;
		
	}
	
	
	
}
