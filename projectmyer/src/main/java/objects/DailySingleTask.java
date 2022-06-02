package objects;

public class DailySingleTask extends DailyObject {

    private SingleTask singleTask;

    public DailySingleTask(int id, String name, SingleTask singleTask) {
        super(id, name);
        this.singleTask = singleTask;
    }

    public SingleTask getSingleTask() {
        return singleTask;
    }
}
