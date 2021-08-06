package exercicios;

public class Quadrado extends Retangulo{
	public Quadrado(double lado,String cor) {
		super (lado,lado,cor);
	}

	@Override
	public String toString() {
		return "Quadrado [getBase()=" + getBase() + ", getAltura()=" + getAltura() + ", area()=" + area()
				+ ", toString()=" + super.toString() + ", getCor()=" + getCor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
