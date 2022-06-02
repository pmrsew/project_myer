package objects;

//list of daily single objects
//randomization happens here
//make generate pool?

import java.util.List;

public class DailyPool {

    private int id;
    private String name;
    private List<DailyObject> dailyObjects;

    //daily pool object
    //contains zero to many daily objects

    public DailyPool(int id, String name) {
        this.name = name;
        this.id = id;
    }


    //add dpo
    public void addDailyObject(DailyObject dailyObject){
        dailyObjects.add(dailyObject);
    }
    public void addAllDailyObjects(List<DailyObject> dailyObjects){
        dailyObjects.addAll(dailyObjects);
    }

    //clear
    public void clearDailyObject(DailyObject dailyObject){
        dailyObjects.clear();
    }

    //generate dailytaskpool list, returns new dailytaskpool
    //filters for non-completed
    //this is where the algorithm can go

    //clear complete
    public void clearCompletedSingleTasks(){
        for(DailyObject dailyObject: dailyObjects){
            dailyObject.clearCompletion();
        }
    }

    //complete all
    public void completeAllSingleTasks(){
        for(DailyObject dailyObject: dailyObjects){
            dailyObject.completeAll();
        }
    }

    //save progress
    //    used to transfer statistics
    //    confirm completion of tasks

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
