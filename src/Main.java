import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int operation = 0;
        int day = 1;
        int time = 1;
        String plan;

        Scanner scan = new Scanner(System.in);
        Schedule schedule = new Schedule();

        while(true) {
            System.out.println("操作（登録：0 消去：1 終了：2）");
            operation = scan.nextInt();
            if(operation == 2) return;
            System.out.println("日にちは？");
            day = scan.nextInt();
            System.out.println("時間帯は？（午前：1 午後：2）");
            time = scan.nextInt();

            if (operation == 0) {
                System.out.println("予定は？");
                plan = scan.next();
                schedule.setScheduleList(day, time, plan);
            } else schedule.remove(day, time);

            schedule.display();
        }

    }
}
