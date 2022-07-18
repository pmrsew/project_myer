package objects.daily;

import objects.element.SingleTask;

public class DailySingleTask extends DailyObject {

    private SingleTask singleTask;
    private final static String DAILY_OBJECT_LABEL = "TASK";


    public DailySingleTask(int id, String name, SingleTask singleTask) {
        super(id, name);
        setElementLabel(DAILY_OBJECT_LABEL);
        this.singleTask = singleTask;
    }

    public SingleTask getSingleTask() {
        return singleTask;
    }

    @Override
    public void clearCompletion() {
        singleTask.setCompleted(false);
    }

    @Override
    public void completeAll() {
        singleTask.setCompleted(true);
    }
}
