import java.util.List;
import java.util.Random;
import biuoop.DrawSurface;
import biuoop.GUI;


public class GameFlow {

    public GameFlow(){

    }

    public int getRandomElement(List<Integer> list)
    {
        int size = list.size();;
        Random rand = new Random();
        if (size <= 1){
            return 0;
        }
        int x = list.size() - 1;
        return list.get(rand.nextInt(x)) - 1;
    }

    public void RunQuestions(List<Questions> question,List<Integer> numbers, int num){
        Questions q = question.get(num);
        q.theQuestion();
        q.correctAnswer();
        try{Thread.sleep(500);}
        catch(InterruptedException ignored){}
        //CorrectScreen cs = new CorrectScreen(true);

        if(!q.checkFlag()){
            removeQuestion(question, numbers, num);
        }
        q.nextQ();

        //cs.getGui();
    }

    public void removeQuestion(List<Questions> lsq, List<Integer>lsn, int num){
        lsq.remove(num);
        lsn.remove(num);
    }
}
