public class LaFinta extends Pizza{
    @Override
    void Label() {
        System.out.println("Pizza: LaFinta"+"\nweight: "+getWeight()+"\nprice:"+getPrice());
    }
    int  Special(int num) {
        if (num == 1) {
            System.out.println("With mushrooms");
            return num;
        } else if (num == 2) {
            System.out.println("Without mushrooms");
            return num;
        }
        else{
            System.out.println("Comes without mushrooms by default");
        }
        return num;
    }
}