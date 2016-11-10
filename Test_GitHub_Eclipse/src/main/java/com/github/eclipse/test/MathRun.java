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
		double result =  width * height;
		return "El area del cuadrado ["+width+","+height+"] es: " + result ;
	}

	@Override
	public String getInformationElement() {
		
		return "Rectangulo de ancho: " + width + " , alto: " + height;
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

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "MathRun [width=" + width + ", height=" + height + "]";
	}
	
}
