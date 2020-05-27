package filter;

import org.apache.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QosFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(QosFilter.class);
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        logger.info("qos invoked =======================================================================================");
        return invoker.invoke(invocation);
    }
}
