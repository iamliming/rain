/**
 * 节点类型
 *
 * @author liming
 * @version [版本号, 十二月 07, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public enum ZKNodeType
{
    AVAILABLE_SERVER("server"),
    DISABLE_SERVER("disableServer"),
    CLIENT("client");

    private String value;

    private ZKNodeType(String value)
    {
        this.value = value;
    }
}
