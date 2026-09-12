import java.util.ArrayList;
import java.util.List;

public class Pipeline<T, R> {

    private List<Transformer<?, ?>> transformers;

    public Pipeline() {
        transformers = new ArrayList<>();
    }

    public <V> Pipeline<T, V> addTransformer(Transformer<R, V> transformer) {

        Pipeline<T, V> newPipeline = new Pipeline<>();

        newPipeline.transformers.addAll(this.transformers);
        newPipeline.transformers.add(transformer);

        return newPipeline;
    }

    public Object execute(T input) {

        Object result = input;

        for (Transformer transformer : transformers) {
            result = transformer.transform(result);
        }

        return result;
    }
}