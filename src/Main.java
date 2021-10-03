import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int num;
        System.out.println("Welcome to Trivia Game!");
        GameFlow gf = new GameFlow();
        List<Questions> question = new ArrayList<>();
        List<Integer> numbers;
        initialize(question);
        numbers = parseFromQuestToInt(question);
        num = getRandomElement(numbers);
        while(numbers.size() != 0) {
            gf.RunQuestions(question, numbers, num);
            num = gf.getRandomElement(numbers);
            if (num == numbers.size())
                num--;
        }

    }

    private static void initialize(List<Questions> question){
        QuestionN1 q1 = new QuestionN1(true);
        QuestionN2 q2 = new QuestionN2(true);
        QuestionN3 q3 = new QuestionN3(true);
        QuestionN4 q4 = new QuestionN4(true);
        QuestionN5 q5 = new QuestionN5(true);
        question.add(q1);
        question.add(q2);
        question.add(q3);
        question.add(q4);
        question.add(q5);
    }

    private static List<Integer> parseFromQuestToInt(List<Questions> question){
        int i = 0;
        String[] arrOfStrings;
        String[] arrOfStrings2;
        List<Integer> newList = new ArrayList<Integer>();
        for (Questions q : question) {
            String str = question.get(i).toString();
            arrOfStrings = str.split("N", 5);
            arrOfStrings2 = arrOfStrings[1].split("@",5);
            int foo = Integer.parseInt(arrOfStrings2[0]);
            newList.add(foo);
            i++;
        }
        return newList;
    }

    private static int getRandomElement(List<Integer> list)
    {
        int size = list.size();;
        Random rand = new Random();
        if(size == 1){
            return list.get(0);
        }
        int x = list.size() - 1;
        return list.get(rand.nextInt(x)) - 1;
    }
}
