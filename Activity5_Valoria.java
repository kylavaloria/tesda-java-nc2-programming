import java.util.Scanner;

public class Activity5_Valoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, k;
        
        System.out.print("Enter your First Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Favorite Number: ");
        int num = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your Favorite Anime Character: ");
        String favoriteAnimeCharacter = scanner.nextLine();

        System.out.println("\n========================RESULT========================\n");

        for (i = 0; i < 1; i++) {
            for (j = 0; j < 1; j++) {
                System.out.println("First Name: " + name + "\nFavorite Number: " + num + "\n");
            }
        }

        int count = 0;
        do {
            System.out.println("Favorite Anime Character: " + favoriteAnimeCharacter);
            count++;
        } while (count < 5);
        
        
        System.out.println("\nOdd Numbers:");

        for (k = 41; k <= 49; k++) {
            if (k % 2 == 1) {
                System.out.println(k);
            } else {
                continue;
            }
        }
        
        scanner.close();
    }
}
