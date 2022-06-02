package objects;

//object that is pooled to create daily list
//can be single tasks or task pools
//set limit amount of tasks per pool
//order can be rearranged but im unsure if that is handled here or not...

public class DailyObject {

    private int id;
    private String name;

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
}
