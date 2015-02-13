public class Main {
	public static void main(String[] args) {
		/*Conta cc = new Conta();
		Conta cc2 = new Conta();
			
		cc.creditar(200);
		cc.setNum(100);
		System.out.println(cc.getSaldo());
		cc.creditar(30);
		System.out.println(cc.getSaldo());
		cc.debitar(100);
		System.out.println(cc.getSaldo());
		System.out.println("Numero da conta: " + cc.getNumero());
		cc.transferir(50, cc2);
		System.out.println(cc.getSaldo());
		System.out.println(cc2.getSaldo());
		*/
		Fatura fatura = new Fatura();
		fatura.setNome("Xbox One");
		fatura.setNumber("1");
		fatura.setDesc("Console da Microsoft");
		fatura.setPreco(2100);
		fatura.setQntItem(4);
		System.out.printf("Saldo da fatura: R$ %.2f.",fatura.getValorFatura());
		
		
	}
	
}
