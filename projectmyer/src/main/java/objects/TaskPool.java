package objects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class TaskPool {

    //Instance Variables
    private HashMap<Integer,SingleTask> singleTaskList;
    //percentage out of hundred
    private int completionPercent;
    private LocalDateTime  completionDateTime;
    private boolean isOrdered;

    //Constructors
    public TaskPool() {
    }
    public TaskPool(HashMap<Integer,SingleTask> singleTaskList, int completionPercent, LocalDateTime completionDateTime, boolean isOrdered) {
        this.singleTaskList = singleTaskList;
        this.completionPercent = completionPercent;
        this.completionDateTime = completionDateTime;
        this.isOrdered = isOrdered;
    }

    //Methods

    //remove task
    public void removeTask(int taskId){
        for(Map.Entry<Integer,SingleTask> singleTask : singleTaskList.entrySet()) {
            if(singleTask.getKey().equals(taskId)){
                singleTaskList.remove(taskId);
            }
        }
    }

    //add one task
    public void addSingleTask(SingleTask singleTask){
        singleTaskList.put(singleTask.getTaskId(), singleTask);
    }
    //add many task
    public void addSingleTask(HashMap<Integer,SingleTask> taskHashMap){
        singleTaskList.putAll(taskHashMap);
    }

    //total amount of task
    public int totalSingleTasks(){
        return singleTaskList.size();
    }


    //Getters Setters
    public HashMap<Integer,SingleTask> getSingleTaskList() {
        return singleTaskList;
    }
    public void setSingleTaskList(HashMap<Integer,SingleTask> singleTaskList) {
        this.singleTaskList = singleTaskList;
    }

    //acts as refresh to percentage with each method call
    public int getCompletionPercent() {
        int completedTasks = 0;
        for(Map.Entry<Integer,SingleTask> singleTask : singleTaskList.entrySet()) {
            if(singleTask.getValue().isCompleted()){
                completedTasks++;
            }
        }
        completionPercent = completedTasks/this.totalSingleTasks();
        return completionPercent;
    }

    public LocalDateTime getCompletionDateTime() {
        return completionDateTime;
    }
    public void setCompletionDateTime(LocalDateTime completionDateTime) {
        this.completionDateTime = completionDateTime;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }
}
