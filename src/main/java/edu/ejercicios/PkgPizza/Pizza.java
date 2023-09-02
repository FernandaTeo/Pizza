package  PkgPizza;

public class Pizza {
    private String nombre;

    public double price;

    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String nombre, Topping... toppings) {
        this.nombre = nombre;
        this.price = price;
        for (Topping topping : toppings) {
            this.toppings.add(to);

        }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);

    }

    public void removeTopping(int index
        this.toppings.remove(index);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza" + nombre + ", price=" + price ;

    }

}
