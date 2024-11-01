package filter;

public class ImplNonStandard {
    public int[] appliquerFiltre(String filterName, int[] data) {
        System.out.println("Applying old filter: " + filterName);
        return data;
    }
}
