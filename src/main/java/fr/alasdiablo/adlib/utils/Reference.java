package fr.alasdiablo.adlib.utils;

import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Reference {
    public static final String MOD_ID = "adlib";
    public static final Marker LOCALIZATION_MARKER = MarkerManager.getMarker("LOCALIZATION");
    public static final Marker CORE_MARKER = MarkerManager.getMarker("CORE");
    public static final String WARN_MISSING_ARGUMENT = "Invalid call, missing argument!";
    public static final String WARN_INVALID_ARGUMENT = "Invalid call, invalid argument!";
    public static final String DEBUG_LOCALIZATION = "Try to get localization for: '{}'.";
}
