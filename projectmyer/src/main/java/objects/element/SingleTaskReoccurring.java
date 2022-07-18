package objects.element;

import objects.element.SingleTask;

import java.time.LocalDate;

//reoccurring tasks that happen on a schedule
public class SingleTaskReoccurring extends SingleTask implements Element{

    //Instance Variables
    private String intervalLabel;
    private int intervalAmount;

    //Constants
    private final static String DAY_LABEL = "DAY";
    private final static String WEEK_LABEL = "WEEK";
    private final static String MONTH_LABEL = "MONTH";

    //Constructors
    public SingleTaskReoccurring() {

    }
    public SingleTaskReoccurring(int taskId, String taskName, boolean isCompleted, boolean hasDueDate, LocalDate LocalDate, String intervalLabel, int intervalAmount) {
        super(taskId, taskName, isCompleted, hasDueDate, LocalDate);

        //Number must be greater than 1
        if(intervalAmount > 0){
            this.intervalAmount = intervalAmount;
        }else{
            // TO DO EXCEPTION
        }

        //Label must match pre-existing options
        if(intervalLabel.equals(DAY_LABEL)||intervalLabel.equals(WEEK_LABEL)||intervalLabel.equals(MONTH_LABEL)) {
            this.intervalLabel = intervalLabel;
        }else{
            // TO DO EXCEPTION
        }
    }

    //Getters Setters
    public String getIntervalLabel() {
        return intervalLabel;
    }
    public void setIntervalLabel(String intervalLabel) {
        this.intervalLabel = intervalLabel;
    }

    public int getIntervalAmount() {
        return intervalAmount;
    }
    public void setIntervalAmount(int intervalAmount) {
        this.intervalAmount = intervalAmount;
    }
}
