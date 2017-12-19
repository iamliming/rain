package rain.registry;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

import rain.common.URL;

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

    private Set<URL> registred = new CopyOnWriteArraySet<URL>();


    public URL url()
    {
        return null;
    }

    public void subscribe(URL url, NotifyListener listener)
    {
        doSubscribe(url, listener);
    }

    public void unsubscribe(URL url, NotifyListener listener)
    {
        doUnsubscribe(url, listener);
    }

    protected abstract void doUnsubscribe(URL url, NotifyListener listener);

    public void registry(URL url)
    {
        doRegistry(url);
    }

    public void unRegistry(URL url)
    {
        doUnRegistry(url);
    }

    protected abstract void doRegistry(URL url);

    protected abstract void doUnRegistry(URL url);

    protected abstract void doSubscribe(URL url, NotifyListener listener);

    public boolean abviable(URL url)
    {
        return false;
    }

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
