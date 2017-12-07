package rain.common;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * URL
 *
 * @author liming
 * @version [版本号, 十二月 07, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class URL
{
    //协议
    private String protocol;
    //host
    private String host;
    //端口
    private int port;

    private Map<String, String> parameters;

    //--chache--
    private transient volatile Map<String, Number> numbers;

    public URL(String protocol, String host, int port)
    {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
    }

    public URL(String protocol, String host, int port, Map<String, String> parameters)
    {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.parameters = parameters;
    }

    public static URL parse(String url)
    {
        if(url == null || url.length() == 0)
        {
            return null;
        }
        String host = null;
        String protocol = null;



        return null;
    }

    public Map<String, Number> getNumbers()
    {
        if(parameters == null){
            numbers = new ConcurrentHashMap<String, Number>();
        }
        return numbers;
    }

    public int getIntParameters(String key, int defaultValue)
    {
        Number number = getNumbers().get(key);
        if(number != null)
        {
            return number.intValue();
        }
        String val = parameters.get(key);
        if(val == null || val.length() == 0)
        {
            return defaultValue;
        }
        int i = Integer.parseInt(val);
        getNumbers().put(key, i);
        return i;
    }

}
