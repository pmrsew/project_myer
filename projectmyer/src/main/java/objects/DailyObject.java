package objects;

//object that is pooled to create daily list
//can be single tasks or task pools
//set limit amount of tasks per pool
//order can be rearranged but im unsure if that is handled here or not...

public abstract class DailyObject {

    private int id;
    private String name;
    private String dailyObjectLabel;
    private final static String DAILY_POOL_LABEL = "POOL";
    private final static String DAILY_TASK_LABEL = "TASK";

    public abstract void clearCompletion();
    public abstract void completeAll();

    public DailyObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDailyObjectLabel(){return dailyObjectLabel;}
    public void setDailyObjectLabel(String dailyObjectLabel){this.dailyObjectLabel = dailyObjectLabel;}
}
