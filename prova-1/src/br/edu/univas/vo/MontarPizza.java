package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class MontarPizza implements IngredientePizza{

	private List<IngredientePizza> ingredienteList;
	
	public MontarPizza() {
		ingredienteList = new ArrayList<>();
	}
	@Override
	public String description() {
		String description = "";
		for (IngredientePizza ingrediente : ingredienteList) {
			description += ingrediente.description();
			description+=" ";
		}
		return description;
	}

	@Override
	public double price() {
		int price = 0;
		for (IngredientePizza ingrediente : ingredienteList) {
			price += ingrediente.price();
		}
		return price;
	}
	
	public void addComponent(IngredientePizza ingrediente) {
		ingredienteList.add(ingrediente);
	}
	
	public void removeComponent(IngredientePizza ingrediente) {
		ingredienteList.remove(ingrediente);
	}

}