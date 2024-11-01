package filter;

public class MedianFilter implements IFilterStrategy {
    @Override
    public int[] filter(int[] data) {
        System.out.println("Applying median filter");
        // Implémentation du filtre médian
        return data;
    }
}
