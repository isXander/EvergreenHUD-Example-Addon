package co.uk.isxander.exampleaddon.elements;

import co.uk.isxander.evergreenhud.elements.Element;
import co.uk.isxander.evergreenhud.elements.ElementData;

public class ExampleElement extends Element {

    @Override
    public void initialise() {

    }

    @Override
    protected ElementData metadata() {
        return new ElementData("Example Element", "This is an example description.");
    }

    @Override
    protected String getValue() {
        return "My Cool Element";
    }

    @Override
    public String getDisplayTitle() {
        return "Example Element";
    }

}
