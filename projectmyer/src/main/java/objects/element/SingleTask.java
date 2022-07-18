package objects.element;

import java.time.LocalDate;

public class SingleTask implements Element{

    //Instance Variables
    private int taskId;
    private String taskName;
    private boolean isCompleted;
    private boolean hasDueDate;
    private LocalDate dueDate;
    private final static String ELEMENT_VALUE = "TASK";

    //Constructors
    public SingleTask(){
    }
    public SingleTask(int taskId, String taskName, boolean isCompleted, boolean hasDueDate, LocalDate dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.isCompleted = isCompleted;
        this.hasDueDate = hasDueDate;
        this.dueDate = dueDate;
    }

    //Methods
    @Override
    public int getElementId() {
        return taskId;
    }

    @Override
    public String getElementType() {
        return ELEMENT_VALUE;
    }


    public void trackTask(){
        //track task method
        //used to add to history
    }

    //Getters Setters
    public int getTaskId() {
        return taskId;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public boolean isHasDueDate() {
        return hasDueDate;
    }
    public void setHasDueDate(boolean hasDueDate) {
        this.hasDueDate = hasDueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }



}
