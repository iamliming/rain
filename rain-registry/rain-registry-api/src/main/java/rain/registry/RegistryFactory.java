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
public interface RegistryFactory
{
    Registry createRegistry(URL url);
}
