package co.uk.isxander.exampleaddon.elements;

import co.uk.isxander.evergreenhud.elements.Element;
import co.uk.isxander.evergreenhud.elements.ElementData;

public class ExampleElement extends Element {
    @Override
    public void initialise() {

    }

    @Override
    protected ElementData metadata() {
        return new ElementData("Example Element", "Cool element!");
    }

    @Override
    protected String getValue() {
        return "This is an example element.";
    }

    @Override
    public String getDisplayTitle() {
        return "Example Element";
    }
}
