package com.imooc.activiti.config;

import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试
 *
 * @author jimmy
 **/
public class ConfigTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigTest.class);

    @Test
    public void testConfig1(){
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration
                .createProcessEngineConfigurationFromResourceDefault();

        LOGGER.info("configuration = {}",configuration);
    }

    @Test
    public void testConfig2(){
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration
                .createStandaloneProcessEngineConfiguration();
        LOGGER.info("configuration = {}",configuration);
    }
}
