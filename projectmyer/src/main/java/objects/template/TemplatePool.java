package objects.template;

import objects.daily.DailyObject;

import java.util.List;

public class TemplatePool {
    private int id;
    private String name;
    private List<DailyObject> dailyObjects;


    //daily pool object
    //contains zero to many daily objects

    //TODO Make use of element object that is coming from template object

    public TemplatePool(int id, String name) {
        this.name = name;
        this.id = id;
    }




    //Getters Setters
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

    public List<DailyObject> getDailyObjects() {
        return dailyObjects;
    }
    public void setDailyObjects(List<DailyObject> dailyObjects) {
        this.dailyObjects = dailyObjects;
    }

}
