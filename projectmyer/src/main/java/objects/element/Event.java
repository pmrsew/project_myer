package objects.element;

//It is not a check marked task, instead an event that will occur
public class Event implements Element {
    private final static String ELEMENT_VALUE = "EVENT";

    @Override
    public int getElementId() {
        return 0;
    }

    @Override
    public String getElementType() {
        return ELEMENT_VALUE;
    }
}
