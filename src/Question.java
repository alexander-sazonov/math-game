import java.util.Random;

public class Question {
    private int a;
    private int b;
    private int answer;
    private char operation;
    private Random rnd = new Random();
    public Question(){
        a = rnd.nextInt(100);
        b = rnd.nextInt(100);
        int operationId;
        operationId = rnd.nextInt(3);
        switch (operationId){
            case 0:
                operation='+';
                answer = a+b;
                break;
            case 1:
                operation='-';
                answer = a-b;
                break;
            case 2:
                operation = '*';
                answer = a*b;
                break;
        }

    }
    public void print(){
        System.out.println(""+a+operation+b+"=?");
    }
    public boolean checkAnswer(int playerAnswer){
        return playerAnswer == answer;
    }
}
