import uulib.Console;

class Main {
  public static void main(String[] args) {
     //set counter 
     int counter = 1;
     
     while (counter <= 20){
        if ( counter % 3 == 0 && counter % 5 == 0){
            System.out.println("Fizzbuzz");
        }else if (counter % 3 == 0 ){
            System.out.println("Fizz");
        } else if ( counter % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(counter);
        }

        counter = counter + 1;
     }
  }
}

