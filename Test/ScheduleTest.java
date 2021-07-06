import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class ScheduleTest {
    public Schedule schedule;

    @Before
    public void createInstance() {
        schedule = new Schedule();
    }


    @org.junit.Test
    public void setScheduleList_notNullテスト() {
        schedule.setScheduleList(0, 1,"Test");
        schedule.setScheduleList(0, 1,"NewTest");
        assertThat(schedule.scheduleListAM.get(0), is("Test"));
    }

    @org.junit.Test
    public void setScheduleList_setValueテスト() {
        schedule.setScheduleList(0, 1,"Test");
        assertThat(schedule.scheduleListAM.get(0), is("Test"));
    }

    @org.junit.Test
    public void getScheduleList_nullテスト() {
        assertThat(schedule.getScheduleList(0, 0), nullValue());
    }

    @org.junit.Test
    public void getScheduleList_getValueテスト() {
        schedule.scheduleListAM.set(0, "Test");
        assertThat(schedule.getScheduleList(0, 0), nullValue());
    }

    @org.junit.Test
    public void remove_Nullテスト() {
        assertThat(schedule.remove(0, 0), nullValue());
    }

    @org.junit.Test
    public void remove_removeValueテスト() {
        schedule.scheduleListAM.set(0, "Test");
        assertThat(schedule.remove(0, 0), nullValue());
    }

    @org.junit.Test
    public void displayテスト() {
        // test comment
    }

}