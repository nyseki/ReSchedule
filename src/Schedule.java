import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List<String> scheduleListAM;
    List<String> scheduleListPM;

    public Schedule() {
        scheduleListAM = new ArrayList<>();
        scheduleListPM = new ArrayList<>();

        for(int i = 0; i < 31; i++){
            scheduleListAM.add("");
            scheduleListPM.add("");
        }
    }

    public void setScheduleList(int day, int time, String plan) {
        if(getScheduleList(day, time) == "") {
            if (time == 1) {
                scheduleListAM.set(day - 1, plan);
            } else scheduleListPM.set(day - 1, plan);
        }
        else displayError();
    }

    public String getScheduleList(int day, int time) {
        if(time == 1){
            return scheduleListAM.get(day - 1);
        }
        else return scheduleListPM.get(day - 1);
    }

    public void remove(int day, int time){
        if(getScheduleList(day, time) == "") {
            displayError();
        }
        else {
            if (time == 1) {
                scheduleListAM.set(day - 1, "");
            } else scheduleListPM.set(day - 1, "");
        }
    }

    public void display(){
        System.out.println("          AM　　　　  PM");
        for(int i = 0; i < scheduleListPM.size(); i++){
            System.out.printf("%2d日　",i + 1);
            System.out.printf("%8s",scheduleListAM.get(i));
            System.out.printf("%10s\n",scheduleListPM.get(i));
        }
    }

    private void displayError(){
        System.out.println("エラーです。入力し直してください。");
    }
}
