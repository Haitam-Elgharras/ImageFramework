package filter;

// Adapter pour l'ancienne implémentation
public class FilterAdapter implements IFilterStrategy {
    private ImplNonStandard oldImplementation;
    private String filterName;

    public FilterAdapter(ImplNonStandard oldImplementation, String filterName) {
        this.oldImplementation = oldImplementation;
        this.filterName = filterName;
    }

    @Override
    public int[] filter(int[] data) {
        return oldImplementation.appliquerFiltre(filterName, data);
    }
}