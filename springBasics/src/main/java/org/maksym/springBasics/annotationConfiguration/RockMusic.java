package org.maksym.springBasics.annotationConfiguration;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements IMusic{
    @Override
    public String getSong() {
        return "Seven Nation Army";
    }
}
