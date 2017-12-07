package rain.registry;

import java.util.List;

import rain.common.URL;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author liming
 * @version [版本号, 十二月 07, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface RegistryService
{
    void registry(URL url, NotifyListener listener);

    void unRegistry(URL url, NotifyListener listener);

    void subscriber(URL url, NotifyListener listener);

    void unSubscriber(URL url, NotifyListener listener);

    boolean abviable(URL url);

    List<URL> lookup();
}
