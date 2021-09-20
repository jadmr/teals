class NumAdder {
    // Behavior? Or Attribute?
    int number;

    public NumAdder() {
        this.number = 0;
    }

    // Behavior? Or Attribute?
    public void addOneToNumber() {
        number += 1;
    }

    // Behavior? Or Attribute?
    public void printNumber() {
        System.out.println(number);
    }
}

class Startpoint {
    public static void main(String[] args) {
         NumAdder firstInstance = new NumAdder();
         NumAdder secondInstance = new NumAdder();

         firstInstance.printNumber();
         secondInstance.printNumber();

         firstInstance.addOneToNumber();
         firstInstance.addOneToNumber();

         secondInstance.addOneToNumber();

         firstInstance.printNumber();
         secondInstance.printNumber();
    }
}