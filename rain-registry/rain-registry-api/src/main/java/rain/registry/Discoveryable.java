package rain.registry;

import java.util.List;

import rain.common.URL;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author liming
 * @version [版本号, 十二月 08, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface Discoveryable
{
    void subscribe(URL url, NotifyListener listener);

    void unsubscribe(URL url, NotifyListener listener);

    List<URL> lookUp(URL url);
}
