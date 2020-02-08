package fr.alasdiablo.adlib.localization;

import fr.alasdiablo.adlib.ADLib;
import fr.alasdiablo.adlib.utils.Reference;
import net.minecraft.client.resources.I18n;

/**
 * Public class for use the I18n localization system
 */
public class Localization {

    /**
     * Get a formatted string
     * @param key translation key (name of the key on the language file).
     * @param values value for the format
     * @return Formatted string
     */
    public static String format(String key, String... values) {
        log(key, values.length);
        return I18n.format(key, (Object) values);
    }

    /**
     * Get a non-formatted string
     * @param key translation key (name of the key on the language file).
     * @return Non-Formatted string
     */
    public static String get(String key) {
        log(key, -1);
        return I18n.format(key);
    }

    /**
     * Print all debug and warning
     * @param key translation key (name of the key on the language file).
     * @param length size of value for the format (-1 one if non-formatted call)
     */
    private static void log(String key, int length) {
        ADLib.LOGGER.debug(Reference.LOCALIZATION_MARKER, Reference.DEBUG_LOCALIZATION, key);
        if (!I18n.hasKey(key)) ADLib.LOGGER.warn(Reference.LOCALIZATION_MARKER, Reference.WARN_INVALID_ARGUMENT);
        if (length == 0) ADLib.LOGGER.warn(Reference.LOCALIZATION_MARKER, Reference.WARN_MISSING_ARGUMENT);
    }
}
