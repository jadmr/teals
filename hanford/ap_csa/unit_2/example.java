class NumAdder {
    // Behavior? Or Attribute?
    int number;
    static int staticNumber;

    public NumAdder() {
        this.number = 0;

        staticNumber++;
    }

    // Behavior? Or Attribute?
    public void addOneToNumber() {
        number += 1;
    }

    // Behavior? Or Attribute?
    public void printNumber() {
        System.out.println(number);
    }

    public static void printStaticNumber(){
        System.out.println(staticNumber);
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

         System.out.print("static variable: ");
         NumAdder.printStaticNumber();
    }
}