
    public class Calculator {
        // Constructor
        public Calculator(){

        }

        //Add Method
        public int add(int a, int b){
            return a+b;
        }

        //subtract method
        public int subtract(int a, int b){
            return a-b;
        }

        //Multiply method
        public int multiply(int a, int b){
            return a*b;
        }

        //Division Method
        public int division(int a, int b){
            return a/b;
        }

        //Modulo Method
        public int modulo(int a, int b){
            return a%b;
        }

        public static void main(String[] args){
            Calculator myCalculator = new Calculator();
            System.out.println(myCalculator.add(5,7));
            System.out.println(myCalculator.subtract(5,7));
            System.out.println(myCalculator.multiply(5,7));
            System.out.println(myCalculator.division(5,7));
            System.out.println(myCalculator.modulo(5,7));
        }
    }


