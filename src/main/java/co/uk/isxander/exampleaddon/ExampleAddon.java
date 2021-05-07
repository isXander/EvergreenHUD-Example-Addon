package co.uk.isxander.exampleaddon;

import co.uk.isxander.evergreenhud.addon.AddonMeta;
import co.uk.isxander.evergreenhud.addon.EvergreenAddon;
import co.uk.isxander.evergreenhud.elements.ElementType;
import co.uk.isxander.exampleaddon.elements.ExampleElement;

public class ExampleAddon extends EvergreenAddon {

    public static final String NAME = "Example Addon";
    public static final String DESCRIPTION = "A cool example EvergreenHUD addon!";
    public static final String VERSION = "1.0";

    @Override
    public void init() {
        ElementType.instance.registerElement("EXAMPLE_ELEMENT", ExampleElement.class);
    }

    @Override
    public AddonMeta metadata() {
        return new AddonMeta(NAME, DESCRIPTION, VERSION);
    }

}
