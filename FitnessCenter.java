import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());
        double back = 0;
        double chest = 0;
        double legs = 0;
        double abs = 0;
        double proteinshake = 0;
        double proteinbar = 0;
        double workout = 0;
        double protein = 0;
        for (int i = 1; i <= visitors ; i++) {
            String activity = scanner.nextLine();

            if (activity.equals("Back")) {
                back++;
                workout++;
            }
            else if (activity.equals("Chest")) {
                chest++;
                workout++;
            }
            else if (activity.equals("Legs")) {
                legs++;
                workout++;
            }
            else if (activity.equals("Abs")) {
                abs++;
                workout++;
            }
            else if (activity.equals("Protein shake")) {
                proteinshake++;
                protein++;
            }
            else if (activity.equals("Protein bar")) {
                proteinbar++;
                protein++;
            }
        }
        System.out.printf("%.0f - back%n", back);
        System.out.printf("%.0f - chest%n", chest);
        System.out.printf("%.0f - legs%n", legs);
        System.out.printf("%.0f - abs%n", abs);
        System.out.printf("%.0f - protein shake%n", proteinshake);
        System.out.printf("%.0f - protein bar%n", proteinbar);
        System.out.printf("%.2f%% - work out%n", (workout / visitors) * 100);
        System.out.printf("%.2f%% - protein", (protein / visitors) * 100);
    }
}
