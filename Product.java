public class Product {

    private String name;
    private double value;
    private int amount;

    public Product(String name, double value, int amount){
        this.name = name;
        this.value = value;
        this.amount = amount;
    }

    public double total(){
        return this.value * this.amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
