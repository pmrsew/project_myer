package objects;

public class DailyTaskPool extends DailyObject{

    private TaskPool taskPool;
    private int taskPoolLimit;

    public DailyTaskPool(int id, String name, TaskPool taskPool, int taskPoolLimit) {
        super(id, name);
        this.taskPool = taskPool;
        this.taskPoolLimit = taskPoolLimit;
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
}
