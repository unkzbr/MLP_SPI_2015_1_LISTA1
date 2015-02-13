
public class Carro {
private String cor;
private String modelo;
private int velocidadeAtual;
private int velocidadeMaxima;
private boolean estado;

public boolean isEstado() {
	return estado;
}
public void setEstado(boolean estado) {
	this.estado = estado;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public int getVelocidadeAtual() {
	return velocidadeAtual;
}
public void setVelocidadeAtual(int velocidadeAtual) {
	this.velocidadeAtual = velocidadeAtual;
}
public int getVelocidadeMaxima() {
	return velocidadeMaxima;
}
public void setVelocidadeMaxima(int velocidadeMaxima) {
	this.velocidadeMaxima = velocidadeMaxima;
}
public boolean ligar() {
	
	return true;
	
}
public boolean desligar() {
	
	return false;
	
}
public Carro () {
	this.setVelocidadeMaxima(350);
	this.setVelocidadeAtual(0);
}
public void acelerar(int speed) {
	if (speed < this.velocidadeMaxima)
	this.velocidadeAtual += speed;
	else
	System.out.println("A velocidade inserida excede a velocidade máxima do carro");
}
}

