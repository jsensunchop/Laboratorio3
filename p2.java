  
package headfirst.designpatterns.factory.pizzafm;

public class MedalloPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("frijoles")) {
			return new PaisaStyleBeansPizza();
		} else if (item.equals("chicharron")) {
			return new PaisaStyleRicePizza();
		} else if (item.equals("Trifacica")) {
			return new PaisaStyleThreePhasePizza();
		} else return null;
	}
}

public class PaisaStyleBeansPizza extends Pizza {

	public PaisaStyleBeansPizza() { 
		name = "Paisa Style con frijolitos";
		dough = "Tradicional";
		sauce = "BBQ";
 
		toppings.add("Porcion de Chicharron");
        toppings.add("Porcion de Platano Maduro");
	}
}


public class PaisaStyleRicePizza extends Pizza {

	public PaisaStyleRicePizza() {
		name = "PaisaStyle Pizza de Arrocito Paisa";
		dough = "Tradicional";
		sauce = "Al gusto";
        
        toppings.add("Arrocito");
		toppings.add("Porcion de Chicharron");
		toppings.add("Porcion de platano Maduro");
	}
}

public class PaisaStyleThreePhasePizza extends Pizza {

	public PaisaStyleThreePhasePizza() {
		name = "Paisa Style La Trifasica ome";
		dough = "masita con borde de hogao";
		sauce = "al gusto";
 
		toppings.add("Carne desmechada");
		toppings.add("lomo de cerdo desmechado");
        toppings.add("pollo desmechado");
		toppings.add("Porcion de platano Maduro");
		
	}
}