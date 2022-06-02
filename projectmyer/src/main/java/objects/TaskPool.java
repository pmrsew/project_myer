package objects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TaskPool {

    //Instance Variables
    private List<SingleTask> singleTaskList;
    //percentage out of hundred
    private int completionPercent;

    private LocalDateTime  completionDateTime;
    private boolean isOrdered;

    //Constructors
    public TaskPool() {
    }
    public TaskPool(List<SingleTask> singleTaskList, int completionPercent, LocalDateTime completionDateTime, boolean isOrdered) {
        this.singleTaskList = singleTaskList;
        this.completionPercent = completionPercent;
        this.completionDateTime = completionDateTime;
        this.isOrdered = isOrdered;
    }

    //Methods

    //remove task
    public void removeTask(int taskId){
        for(SingleTask singleTask : singleTaskList) {
            if(singleTask.getTaskId() == (taskId)){
                singleTaskList.remove(taskId);
            }
        }
    }

    //add one task
    public void addSingleTask(SingleTask singleTask){
        singleTaskList.add(singleTask);
    }
    //add many task
    public void addSingleTask(List<SingleTask> taskHashMap){
        singleTaskList.addAll(taskHashMap);
    }

    //total amount of task
    public int totalSingleTasks(){
        return singleTaskList.size();
    }

    //Getters Setters
    public List<SingleTask> getSingleTaskList() {
        return singleTaskList;
    }
    public void setSingleTaskList(List<SingleTask> singleTaskList) {
        this.singleTaskList = singleTaskList;
    }

    //acts as refresh to percentage with each method call
    public int getCompletionPercent() {
        int completedTasks = 0;
        for(SingleTask singleTask : singleTaskList) {
            if(singleTask.isCompleted()){
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
