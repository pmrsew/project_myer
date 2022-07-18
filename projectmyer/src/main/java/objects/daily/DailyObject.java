package objects.daily;

//object that is pooled to create daily list
//can be single tasks or task pools
//set limit amount of tasks per pool
//order can be rearranged but im unsure if that is handled here or not...

import objects.element.Element;
import objects.template.TemplateObject;

//TODO This class extends from TemplateObject. Make use of Element!

public abstract class DailyObject extends TemplateObject {

    public DailyObject(int id, String name, Element element) {
        super(id,name,element);

    }

    public abstract void clearCompletion();
    public abstract void completeAll();
}
