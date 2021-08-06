package exercicios;

public class Circulo extends Figura {
	private double raio;
	
	Circulo (double raio, String cor) {
		this.raio = raio;
		this.setCor(cor);
	}
	void setRaio(double raio) {
		this.raio = raio;
	}
	double getRaio () {
		return this.raio;
	}
	double area() {
		return Math.PI * Math.pow(this.raio, 2);
	}
	double diametro() {
		return 2 * this.raio;
	}
	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", getRaio()=" + getRaio() + ", area()=" + area() + ", diametro()="
				+ diametro() + "]";
	}
	
}