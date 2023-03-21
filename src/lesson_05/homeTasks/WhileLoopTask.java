package lesson_05.homeTasks;

public class WhileLoopTask {
    public static void main(String[] args) {

        int i = 0;
        int summary = 0;
        while   (i<500) {
            if(i % 7 == 0){
                summary += i;
                if(i % 4 == 0){
                    i++;
                    continue;
                }
                System.out.println(i);
                i++;
                continue;
            }
            if (i == 100){
                System.out.println("summary = " + summary);
                break;
            }
            i++;
        }
    }
}
