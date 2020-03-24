package com.ljqiii;

import org.apache.maven.eventspy.AbstractEventSpy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.inject.Named;
import javax.inject.Singleton;

@Named("Docker Judger Event Spy")
@Singleton
public class JudgerEventSpy extends AbstractEventSpy {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void init(Context context) throws Exception {
        System.out.println("=========init context");
    }

    @Override
    public void onEvent(Object event) throws Exception {
        System.out.println("=========on event");
    }

    @Override
    public void close() throws Exception {
        super.close();
    }
}
