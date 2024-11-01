package compresser;

// Implémentation concrète de compression
public class JPEGCompression extends AbstractCompression {
    @Override
    protected int[] prepareData(int[] data) {
        System.out.println("Preparing data for JPEG compression");
        return data;
    }

    @Override
    protected int[] compress(int[] data) {
        System.out.println("Compressing using JPEG algorithm");
        return data;
    }

    @Override
    protected int[] optimize(int[] data) {
        System.out.println("Optimizing JPEG compression");
        return data;
    }
}
