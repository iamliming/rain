package rain.registry;

import java.util.List;

import rain.common.URL;

/**
 * notify listener
 *
 * @author liming
 * @version [版本号, 十二月 07, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface NotifyListener
{
    void notify(List<URL> listeners);
}
