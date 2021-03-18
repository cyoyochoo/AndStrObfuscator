package zhuyouyong;

import com.android.build.gradle.AppExtension;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import java.util.Collections;

/**
 * @author zhuyouyong <zhuyouyong@hangsheng.com.cn>
 * Created on 2021/3/18.
 */
public class ObfuscatePlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        AppExtension app = project.getExtensions().getByType(AppExtension.class);
        app.registerTransform(new ObfuscateTransform(project), Collections.EMPTY_LIST);
    }
}
