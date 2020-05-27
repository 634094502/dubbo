package org.apache.dubbo.demo.provider;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.AliceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service(filter = "qos")
public class AliceServiceImpl implements AliceService {
    private static final Logger logger = LoggerFactory.getLogger(AliceServiceImpl.class);

    @Override
    public String call(String name) {
        String result = "alice call " + name;
        logger.info(result);
        return result;
    }

}
