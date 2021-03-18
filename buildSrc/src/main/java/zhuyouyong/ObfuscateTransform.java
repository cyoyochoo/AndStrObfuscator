package zhuyouyong;

import com.android.build.api.transform.Context;
import com.android.build.api.transform.TransformException;
import com.android.build.api.transform.TransformInput;
import com.android.build.api.transform.TransformOutputProvider;
import com.quinn.hunter.transform.HunterTransform;

import org.gradle.api.Project;

import java.io.IOException;
import java.util.Collection;

/**
 * @author zhuyouyong <zhuyouyong@hangsheng.com.cn>
 * Created on 2021/3/18.
 */
public class ObfuscateTransform extends HunterTransform {
    private Project project;

    public ObfuscateTransform(Project project) {
        super(project);
        this.project = project;
        project.getExtensions().create("obfuscate", ObfuscateExtension.class );
        bytecodeWeaver = new ObfuscateWeaver();
    }

    @Override
    public void transform(
            Context context, Collection<TransformInput> inputs,
            Collection<TransformInput> referencedInputs, TransformOutputProvider outputProvider,
            boolean isIncremental
    ) throws IOException, TransformException, InterruptedException {
        bytecodeWeaver.setExtension(project.getExtensions().getByType(ObfuscateExtension.class));
        super.transform(context, inputs, referencedInputs, outputProvider, isIncremental);
    }
}
