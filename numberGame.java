import java.util.*;
class numberGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;
        int score = 0;
        System.out.println("you have only 6 attempts to guess");
        while(playAgain){
            int randomNum = rand.nextInt(100)+1;
            int attempts = 6;
            boolean guessedCorrect = false;
            System.out.println("Guess a number between 1 to 100.You have only 6 attempts!");
            while(attempts>0){
                System.out.print("Guess a number: ");
                int userGuess = sc.nextInt();
                if(userGuess < randomNum) System.out.println("your guess was too low!!");
                else if(userGuess > randomNum) System.out.println("Yoour guess was too high!!");
                else {
                    System.out.println("Your guess was correct!!!");
                    score++;
                    guessedCorrect=true;
                    break;
                }
                attempts--;
                System.out.println("Attempts letf: "+attempts);
            }
            if(!guessedCorrect){
                System.out.println("out of attempts,the number was: "+randomNum);
            }


            System.out.println("Do u want to play again(yes/no): ");
            String response=sc.next();
            playAgain = response.equalsIgnoreCase("yes");
        }


        System.out.println("Your final score: "+score);
        sc.close();
    }
}