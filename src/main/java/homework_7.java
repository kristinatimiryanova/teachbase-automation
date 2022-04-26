public class homework_7 {
    public static void main(String[] args) {
        FizzBuzz(0);
        FizzBuzz(3);
        FizzBuzz(-5);
        FizzBuzz(15);
    }
    public static void FizzBuzz (int a){
        System.out.print(a + "->");
        if (a%3==0) System.out.print("Fizz");
        if (a%5==0) System.out.print("Buzz");
        System.out.println();
    }
}
