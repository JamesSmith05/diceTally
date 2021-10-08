import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides does your dice have? ");
        int diceSideCount = input.nextInt();
        System.out.println("How many times do you want to roll? ");
        int rollCount = input.nextInt();
        Random rand = new Random();

        HashMap <Integer,Integer> scores = new HashMap<Integer, Integer>();
        for(int i = 0; i < rollCount;i++){
            int randNum = rand.nextInt(diceSideCount)+1;
            int count = scores.containsKey(randNum) ? scores.get(randNum) : 0;
            scores.put(randNum, count + 1);

        }
        System.out.println(scores);
    }
}
