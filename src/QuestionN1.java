import java.util.Scanner;
import java.lang.String;

public class QuestionN1 implements Questions {
    public String str;
    private boolean flag;
    public QuestionN1(boolean flag){
        this.flag = flag;
    }

    @Override
    public void theQuestion() {
        System.out.println("How many countries (at least) shall we pass by car to reach from Israel to Bulgaria? \n");
    }

    public void correctAnswer(){
        Scanner input = new Scanner(System.in);
        answers();
        int answer = input.nextInt();
        try {
            if (answer == 2) {
                System.out.println("Correct!");
                str = "Correct!";
                if(checkIfCorrectAnswer(str)){
                    flag = false;
                }
            }
            else if(answer > 0 && answer < 5){
                System.out.println("Wrong answer");
                str = "Wrong answer";
                if(checkIfCorrectAnswer(str)){
                    flag = false;
                }
            }
            else{
                System.out.println("Invalid answer");
            }
        }
        catch (Exception ignored){

        }
    }

    @Override
    public boolean checkIfCorrectAnswer(String str) {
        return str.equals("Correct!") || str.equals("Wrong answer");
    }

    @Override
    public boolean checkFlag() {
        return flag;
    }

    public void answers(){
        System.out.println("1. 3 countries\n2. 4 countries\n3. 5 countries\n4. 6 countries");
    }

    public void nextQ(){
        System.out.println("next question\n");
    }
}





class QuestionN2 implements Questions {
    public String str;
    private boolean flag;

    public QuestionN2(boolean flag){
        this.flag = flag;
    }

    @Override
    public void theQuestion() {
        System.out.println("Which city is bigger by area?\n");
    }

    public void correctAnswer(){
        Scanner input = new Scanner(System.in);
        answers();
        int answer = input.nextInt();
        try {
            if (answer == 1) {
                System.out.println("\nCorrect!\n");
                str = "Correct!";
                if(checkIfCorrectAnswer(str)){
                    flag = false;
                }
            }
            else if(answer > 0 && answer < 5){
                System.out.println("\nWrong answer\n");
                str = "Wrong answer";
                if(checkIfCorrectAnswer(str)){
                    flag = false;
                }
            }
            else{
                System.out.println("Invalid answer, try again");
            }
        }
        catch (Exception ignored){

        }
    }

    @Override
    public boolean checkIfCorrectAnswer(String str) {
        return str.equals("Correct!") || str.equals("Wrong answer");
    }

    @Override
    public boolean checkFlag() {
        return flag;
    }

    public void answers(){
        System.out.println("1. Rishon Lezion\n2. Tel Aviv\n3. Haifa\n4. Ramat Gan");
    }

    @Override
    public void nextQ() {
        System.out.println("next question\n");
    }
}




class QuestionN3 implements Questions {
    public String str;
    private boolean flag;

    public QuestionN3(boolean flag){
        this.flag = flag;
    }

    @Override
    public void theQuestion() {
        System.out.println("Which president (first name) served as a president of the USA before?\n");
    }

    public void correctAnswer(){
        Scanner input = new Scanner(System.in);
        answers();
        int answer = input.nextInt();
        try {
            if (answer == 1) {
                System.out.println("\nCorrect!\n");
                str = "Correct!";
                if(checkIfCorrectAnswer(str)){
                    flag = false;
                }
            }
            else if(answer > 0 && answer < 5){
                System.out.println("\nWrong answer\n");
                str = "Wrong answer";
                if(checkIfCorrectAnswer(str)){
                    flag = false;
                }
            }
            else{
                System.out.println("Invalid answer, try again");
            }
        }
        catch (Exception ignored){

        }
    }

    @Override
    public boolean checkIfCorrectAnswer(String str) {
        return str.equals("Correct!") || str.equals("Wrong answer");
    }

    @Override
    public boolean checkFlag() {
        return flag;
    }

    public void answers(){
        System.out.println("1. John\n2. James\n3. Thomas\n4. Andrew");
    }

    @Override
    public void nextQ() {
        System.out.println("next question\n");
    }
}




class QuestionN4 implements Questions {
    public String str;
    private boolean flag;

    public QuestionN4(boolean flag){
        this.flag = flag;
    }

    @Override
    public void theQuestion() {
        System.out.println("What is the exact distance in Kilometer between Earth and Sun\n");
    }

    public void correctAnswer(){
        Scanner input = new Scanner(System.in);
        answers();
        int answer = input.nextInt();
        try {
            if (answer == 3) {
                System.out.println("\nCorrect!\n");
                str = "Correct!";
                if(checkIfCorrectAnswer(str)){
                    flag = false;
                }
            }
            else if(answer > 0 && answer < 5){
                System.out.println("\nWrong answer\n");
                str = "Wrong answer";
                if(checkIfCorrectAnswer(str)){
                    flag = false;
                }
            }
            else{
                System.out.println("Invalid answer, try again");
            }
        }
        catch (Exception ignored){

        }
    }

    @Override
    public boolean checkIfCorrectAnswer(String str) {
        return str.equals("Correct!") || str.equals("Wrong answer");
    }

    @Override
    public boolean checkFlag() {
        return flag;
    }

    public void answers(){
        System.out.println("1. 1,500,000km\n2. 15,000,000km\n3. 150,000,000km\n4. 1,500,000,000km");
    }

    @Override
    public void nextQ() {
        System.out.println("next question\n");
    }
}

class QuestionN5 implements Questions {
    public String str;
    private boolean flag;

    public QuestionN5(boolean flag){
        this.flag = flag;
    }

    @Override
    public void theQuestion() {
        System.out.println("how many stairs are exist in Eiffel tower?\n");
    }

    public void correctAnswer(){
        Scanner input = new Scanner(System.in);
        answers();
        int answer = input.nextInt();
        try {
            if (answer == 4) {
                System.out.println("\nCorrect!\n");
                str = "Correct!";
                if(checkIfCorrectAnswer(str)){
                    flag = false;
                }
            }
            else if(answer > 0 && answer < 5){
                System.out.println("\nWrong answer\n");
                str = "Wrong answer";
                if(checkIfCorrectAnswer(str)){
                    flag = false;
                }
            }
            else{
                System.out.println("Invalid answer, try again");
            }
        }
        catch (Exception ignored){

        }
    }

    @Override
    public boolean checkIfCorrectAnswer(String str) {
        return str.equals("Correct!") || str.equals("Wrong answer");
    }

    @Override
    public boolean checkFlag() {
        return flag;
    }

    public void answers(){
        System.out.println("1. 2895\n2. 2021\n3. 1789\n4. 1665");
    }

    @Override
    public void nextQ() {
        System.out.println("next question\n");
    }
}



