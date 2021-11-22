import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько примеров ты хояешь решить ?");
        int numberOfQuestions = sc.nextInt();
        for(int i=1;i<=numberOfQuestions;i++){
            System.out.println("Пример № "+i);
            Question question = new Question();
            question.print();
            int userAnswer = sc.nextInt();
            if(question.checkAnswer(userAnswer)){
                System.out.println("Верно");
            }
            else{
                System.out.println("Невероно");
            }
        }
    }
}
