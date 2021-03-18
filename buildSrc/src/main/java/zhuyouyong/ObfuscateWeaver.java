package zhuyouyong;

import com.quinn.hunter.transform.asm.BaseWeaver;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import zhuyouyong.bytecode.StringFieldClassVisitor;

/**
 * @author zhuyouyong <zhuyouyong@hangsheng.com.cn>
 * Created on 2021/3/18.
 */
public class ObfuscateWeaver extends BaseWeaver {
    private ObfuscateExtension extension;

    @Override
    public void setExtension(Object extension) {
        this.extension = (ObfuscateExtension) extension;
    }

    @Override
    protected ClassVisitor wrapClassWriter(ClassWriter classWriter) {
        return new StringFieldClassVisitor(classWriter);
    }

    @Override
    public boolean isWeavableClass(String fullQualifiedClassName) {
        if (!extension.enabled) return false;
        boolean isWeavable = super.isWeavableClass(fullQualifiedClassName);
        if (!isWeavable) return false;
        for (String mark : extension.packages) {
            if (fullQualifiedClassName.startsWith(mark)) {
                return true;
            }
        }
        return false;
    }
}
