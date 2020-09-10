package br.edu.univas.vo;

public class Onions implements IngredientePizza{
	@Override
	public String description() {
		return "Cebola";
	}
	@Override
	public double price() {
		return 1.5;
	}
}