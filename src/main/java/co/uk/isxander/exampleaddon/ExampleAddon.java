package co.uk.isxander.exampleaddon;

import co.uk.isxander.evergreenhud.EvergreenHUD;
import co.uk.isxander.evergreenhud.addon.AddonMeta;
import co.uk.isxander.evergreenhud.addon.EvergreenAddon;
import co.uk.isxander.exampleaddon.elements.ExampleElement;

public class ExampleAddon extends EvergreenAddon {

    public static final String MOD_ID = "${GRADLE_MOD_ID}";
    public static final String MOD_NAME = "${GRADLE_MOD_NAME}";
    public static final String MOD_DESCRIPTION = "${GRADLE_MOD_DESCRIPTION}";
    public static final String MOD_VERSION = "${GRADLE_MOD_VERSION}";

    @Override
    public void init() {
        EvergreenHUD.getInstance().getElementManager().registerElement("EXAMPLE_ELEMENT", ExampleElement.class);
    }

    @Override
    public AddonMeta metadata() {
        return new AddonMeta(MOD_NAME, MOD_DESCRIPTION, MOD_VERSION);
    }

}
