package clases;

public class PMP_Circulo {
	private int id;
	private double radio;
	private String color;
	
	public PMP_Circulo() {}
	
	public PMP_Circulo(int id, double radio, String color) {
		this.id = id;
		this.radio = radio;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "PMP_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
	}
	
	
	
	
	
}
