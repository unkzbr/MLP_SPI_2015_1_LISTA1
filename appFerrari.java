import java.util.Scanner;

public class appFerrari {
	public static void main(String[] args) {
		int x = 0;
		Scanner read = new Scanner(System.in);
		Carro carro = new Carro();
		carro.setCor("vermelho");
		carro.setModelo("LaFerrari");
		carro.setEstado(true);
		if (carro.isEstado()) {
			System.out.println("O carro está ligado");
			System.out.println("A sua cor é: " +carro.getCor());
			System.out.println("O modelo do carro é: "+carro.getModelo());
			System.out.printf("Sua velocidade atual é: %dkm\\h%n",
					carro.getVelocidadeAtual());

		}
		do {
		System.out.printf("%nDigite a velocidade da aceleração:\n");
		x = read.nextInt();
		carro.acelerar(x);
		
		if (carro.getVelocidadeMaxima() > carro.getVelocidadeAtual() && carro.getVelocidadeAtual() > 0){
			System.out.printf(
					"A velocidade atual após a aceleração é: %dkm\\h\n",
					carro.getVelocidadeAtual());
		} else {
			carro.setEstado(false);
		}
		} while (x > carro.getVelocidadeMaxima());
		read.close();
	}

}
