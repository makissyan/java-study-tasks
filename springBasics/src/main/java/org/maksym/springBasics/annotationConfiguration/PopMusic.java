package org.maksym.springBasics.annotationConfiguration;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements IMusic {
    @Override
    public String getSong() {
        return "Smooth";
    }
}
