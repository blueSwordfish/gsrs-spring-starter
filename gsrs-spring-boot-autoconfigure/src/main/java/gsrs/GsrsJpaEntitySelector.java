package gsrs;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class GsrsJpaEntitySelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{EntityProcessorFactory.class.getName(),
                GsrsEntityProcessorListener.class.getName(),
        };
    }
}
