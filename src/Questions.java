import java.util.Scanner;

public interface Questions {
   // Scanner input = new Scanner(System.in);
    void theQuestion();

    void correctAnswer();

    boolean checkIfCorrectAnswer(String str);

    boolean checkFlag();

    void answers();

    void nextQ();
}
