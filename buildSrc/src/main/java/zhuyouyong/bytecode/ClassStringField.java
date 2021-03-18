package zhuyouyong.bytecode;

/**
 * @author zhuyouyong <zhuyouyong@hangsheng.com.cn>
 * Created on 2021/3/18.
 */
public class ClassStringField {

    public static final String STRING_DESC = "Ljava/lang/String;";

    public ClassStringField(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String name;
    public String value;

}
