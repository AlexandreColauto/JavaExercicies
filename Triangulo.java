package exercicios;

public class Triangulo extends Figura {
	private double base,altura;
	
	Triangulo (double base, double altura, String cor) {
		this.base = base;
		this.altura = altura;
		this.setCor(cor);
	}
	
	void setBase(double base) {
		this.base = base;
	}
	void setAltura(double altura) {
		this.altura = altura;
	}
	double getBase() {
		return this.base;
	}
	double getAltura() {
		return this.altura;
	}
	double area() {
		return (this.base * this.altura) / 2;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", getBase()=" + getBase() + ", getAltura()="
				+ getAltura() + ", area()=" + area() + ", getCor()=" + getCor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
