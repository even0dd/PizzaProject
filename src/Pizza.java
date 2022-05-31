public class Pizza {
    private int price;
    private double weight;
    static int counter;

    static void Cooking(){
        counter++;
        System.out.println("Preparing pizza №"+counter);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void Label(){
        System.out.println("Pizza");
    }
}
