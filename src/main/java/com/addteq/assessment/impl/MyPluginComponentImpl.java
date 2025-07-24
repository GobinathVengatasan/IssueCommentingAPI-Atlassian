package com.addteq.assessment.impl;

import com.atlassian.sal.api.ApplicationProperties;
import com.addteq.assessment.api.MyPluginComponent;


public class MyPluginComponentImpl implements MyPluginComponent
{
        private final ApplicationProperties applicationProperties;

    
    public MyPluginComponentImpl(final ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    public String getName() {
        if (null != applicationProperties) {
            return "myComponent:" + applicationProperties.getDisplayName();
        }

        return "myComponent";
    }
}