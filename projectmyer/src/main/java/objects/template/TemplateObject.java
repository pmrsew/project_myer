package objects.template;

import objects.element.Element;

public abstract class TemplateObject {

    private int id;
    private String name;
    private Element element;



    //links to element
    public TemplateObject(int id, String name, Element element) {
        this.id = id;
        this.name = name;
        this.element = element;
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

    public Element getElement(){return element;}

    public void setElement(Element element) {
        this.element = element;
    }

    public String getElementLabel(){return element.getElementType();}

}
