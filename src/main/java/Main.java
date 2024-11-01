import compresser.JPEGCompression;
import filter.FilterAdapter;
import filter.IFilterStrategy;
import filter.ImplNonStandard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Création du framework
            ImageFramework framework = new ImageFramework();

            // Exemple de données d'image
            int[] imageData = {1, 2, 3, 4, 5};

            // Configuration dynamique du filtre
//            String filterClassName = "MeanFilter"; // Pourrait être saisi par l'utilisateur
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter filter class name: ");
            String filterClassName = scanner.nextLine();
            Class<?> filterClass = Class.forName(filterClassName);
            IFilterStrategy filter = (IFilterStrategy) filterClass.getDeclaredConstructor().newInstance();
            framework.setFilterStrategy(filter);

            // Application du filtre
            int[] filteredData = framework.applyFilter(imageData);

            // Utilisation de l'ancien filtre via l'adapter
            ImplNonStandard oldImpl = new ImplNonStandard();
            FilterAdapter adapter = new FilterAdapter(oldImpl, "OldFilter");
            framework.setFilterStrategy(adapter);
            filteredData = framework.applyFilter(imageData);

            // Configuration de la compression
            framework.setCompression(new JPEGCompression());
            int[] compressedData = framework.applyCompression(imageData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}