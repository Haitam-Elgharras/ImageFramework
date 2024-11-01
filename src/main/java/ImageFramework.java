import compresser.AbstractCompression;
import filter.IFilterStrategy;

// Classe principale du Framework
public class ImageFramework {
    private IFilterStrategy filterStrategy;
    private AbstractCompression compression;

    public void setFilterStrategy(IFilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setCompression(AbstractCompression compression) {
        this.compression = compression;
    }

    public int[] applyFilter(int[] data) {
        if (filterStrategy == null) {
            throw new IllegalStateException("Filter strategy not set");
        }
        return filterStrategy.filter(data);
    }

    public int[] applyCompression(int[] data) {
        if (compression == null) {
            throw new IllegalStateException("Compression not set");
        }
        return compression.compresser(data);
    }
}
