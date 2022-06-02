package objects;

public class DailyTaskPool extends DailyObject{

    private TaskPool taskPool;
    private int taskPoolLimit;
    private final static String DAILY_OBJECT_LABEL = "POOL";

    public DailyTaskPool(int id, String name, TaskPool taskPool, int taskPoolLimit) {
        super(id, name);

        this.taskPool = taskPool;
        this.taskPoolLimit = taskPoolLimit;
        setDailyObjectLabel(DAILY_OBJECT_LABEL);
    }

    public TaskPool getTaskPool() {
        return taskPool;
    }
    public void setTaskPool(TaskPool taskPool) {
        this.taskPool = taskPool;
    }

    public int getTaskPoolLimit() {
        return taskPoolLimit;
    }
    public void setTaskPoolLimit(int taskPoolLimit) {
        this.taskPoolLimit = taskPoolLimit;
    }

    @Override
    public void clearCompletion() {
        for(SingleTask singleTask: taskPool.getSingleTaskList()){
            singleTask.setCompleted(false);
        }
    }

    @Override
    public void completeAll() {
        for(SingleTask singleTask: taskPool.getSingleTaskList()){
            singleTask.setCompleted(true);
        }
    }
}
