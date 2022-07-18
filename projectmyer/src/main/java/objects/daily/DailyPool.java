package objects.daily;

//list of daily single objects
//randomization happens here
//make generate pool?


//TODO This class extends from TemplatePool. Make use of Element!

import objects.template.TemplatePool;

import java.time.LocalDate;
import java.util.List;

public class DailyPool extends TemplatePool {

    private LocalDate dateCreated;
    private LocalDate dateLastChange;
    private LocalDate poolStartDate;
    private boolean sameDay;
    private LocalDate poolEndDate;
    private String status; //in progress, skipped, submitted, changed

    //manual make
    public DailyPool(int id, String name) {
        super(id, name);
    }

    //made from template
    public DailyPool(TemplatePool template){
        super(template.getId(),template.getName());
    }

    //add dpo
    public void addDailyObject(DailyObject dailyObject){
        this.getDailyObjects().add(dailyObject);
    }
    public void addAllDailyObjects(List<DailyObject> dailyObjects){
        dailyObjects.addAll(dailyObjects);
    }

    //clear
    public void clearDailyObject(DailyObject dailyObject){
        this.getDailyObjects().clear();
    }

    //generate dailytaskpool list, returns new dailytaskpool
    //filters for non-completed
    //this is where the algorithm can go

    //clear complete
    public void clearCompletedSingleTasks(){
        for(DailyObject dailyObject: this.getDailyObjects()){
            dailyObject.clearCompletion();
        }
    }

    //complete all
    public void completeAllSingleTasks(){
        for(DailyObject dailyObject: this.getDailyObjects()){
            dailyObject.completeAll();
        }
    }

    //save progress
    //    used to transfer statistics
    //    confirm completion of tasks
}
