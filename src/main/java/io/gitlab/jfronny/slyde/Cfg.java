package io.gitlab.jfronny.slyde;

import io.gitlab.jfronny.libjf.config.Entry;
import io.gitlab.jfronny.libjf.config.JfConfig;

public class Cfg implements JfConfig {
    @Entry
    public static boolean sodiumCompat = true;
    @Entry
    public static boolean forceSodiumCompat = false;
    @Entry
    public static boolean holdKeyToActivate = false;
}
