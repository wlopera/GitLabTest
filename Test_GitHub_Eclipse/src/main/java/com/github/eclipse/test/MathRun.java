package com.github.eclipse.test;

public class MathRun implements MathInterface {
	private double width;
	private double height;
	
	public MathRun(double width, double height){
		this.width = width;
		this.height = height;
	}

	@Override
	public String calculeAreaElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInformationElement() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}
	
	public static void main(String[] args){
		MathRun mathRun = new MathRun(1500.0, 2500.0);
		System.out.println("Se creo el objeto MathRun con 1500 y 25000 de ancho y alto");
	}
	
}
