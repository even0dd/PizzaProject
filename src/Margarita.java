public class Margarita extends Pizza{
    @Override
    void Label() {
        System.out.println("Pizza: Margarita"+"\nweight: "+getWeight()+"\nprice:"+getPrice());
    }
    int  Special(int num) {
        if (num == 1) {
            System.out.println("With meat");
            return num;
        } else if (num == 2) {
            System.out.println("Without meat");
            return num;
        }
        else {
            System.out.println("Comes without meat by default");
        }
        return num;
    }
}
