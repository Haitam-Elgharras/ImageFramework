package filter;

// Implémentations concrètes des filtres
public class MeanFilter implements IFilterStrategy {
    @Override
    public int[] filter(int[] data) {
        System.out.println("Applying mean filter");
        // Implémentation du filtre moyenne
        return data;
    }
}