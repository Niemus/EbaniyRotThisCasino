import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int theNumber = (int)(Math.random()*10+1);
        String playAgain = "";

        //System.out.println("Случайное число: " + theNumber);
        do {
        int guess = 0;
        System.out.println("Введите число от 0 до 10: ");
        guess = scan.nextInt();
        System.out.println("Ваш ответ: " + guess);

        while (guess != theNumber) {
                if (guess > theNumber) 
                    System.out.println("Ваше число больше, чем загаданное!");
                else 
                    System.out.println("Ваше число меньше, чем загаданное!");
            System.out.println("Попробуйте еще раз: ");
            System.out.println("___________________________");
            count = count + 1;
            guess = scan.nextInt();
        }
        if (guess == theNumber) 
            System.out.println("Угадали!");
            System.out.println("Всего попыток: " + count);
            System.out.println("________________________");

        System.out.println("Хотите сыграть снова? (y/n): ");
        playAgain = scan.next();
        } 
        while (playAgain.equalsIgnoreCase ("y"));
    }
}
