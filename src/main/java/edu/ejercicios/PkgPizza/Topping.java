package PkgPizza;

import java.util.ArrayList;

public class Topping {
    private String nombre;

    private ArrayList<String> ingredientes = new ArrayList<>();

    public void agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);

    }

    public Topping (String nombre){
        this.nombre = nombre;

    }
    @Override
    public String toString() {
        return "Topping{"nombre:" +nombre  2+ " ingredientes:" + ingredientes";


    }

}
