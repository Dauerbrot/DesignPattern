package com.tobi.design.pattern;

import com.tobi.design.pattern.configuration.Configuration;

/**
 * Class to run the specific builder pattern in mode
 */
public interface Activator {
    void run();
    void editConfig(Configuration configuration);
}
