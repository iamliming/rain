package rain.registry;

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
    /**
     * 注册服务，server client注册
     * rain://192.168.1.102:1055/RainService?version=1.0.0&application=sing
     * @param url
     */
    void registry(URL url/*, NotifyListener listener*/);

    void unRegistry(URL url/*, NotifyListener listener*/);

    boolean abviable(URL url);

}
