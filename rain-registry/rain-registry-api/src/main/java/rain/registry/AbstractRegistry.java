package rain.registry;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author liming
 * @version [版本号, 十二月 08, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public abstract class AbstractRegistry implements Registry
{
    // 关闭
    AtomicBoolean isDestryed = new AtomicBoolean(false);


    public void destry()
    {
        //如果其他关闭，退出.未关闭则设置关闭。并继续
        if(!isDestryed.compareAndSet(false, true))
        {
            return;
        }
        //清空资源。关闭链接
    }
}
