import java.util.Scanner;

public class MusicProgram {
    public static void main(String[] commandLineArguments) {
        // Ask the user for their favorite music genre
        System.out.print("What is your favorite music genre? ");
        Scanner scanner = new Scanner(System.in);
        String musicGenre = scanner.nextLine();

        // Print a message based on the user's input
        if (musicGenre.equalsIgnoreCase("rock")) {
            System.out.println("You're a rockstar!");
        } else if (musicGenre.equalsIgnoreCase("pop")) {
            System.out.println("You're a pop sensation!");
        } else {
            System.out.println("You have great taste in music!");
        }

        // Handle any exceptions that might occur
        try {
            // Simulate some music-related processing
            processMusic(musicGenre);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void processMusic(String musicGenre) {
        // Simulate some music-related processing
        System.out.println("Processing " + musicGenre + " music...");
        // Add more functionality here, such as interacting with a music database
    }
}