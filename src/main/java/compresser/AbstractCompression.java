package compresser;

// Template Method pour la compression
public abstract class AbstractCompression {
    // Template method
    public final int[] compresser(int[] data) {
        int[] preparedData = prepareData(data);
        int[] compressedData = compress(preparedData);
        return optimize(compressedData);
    }

    // Étapes abstraites à implémenter par les sous-classes
    protected abstract int[] prepareData(int[] data);
    protected abstract int[] compress(int[] data);
    protected abstract int[] optimize(int[] data);
}