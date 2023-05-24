import java.util.Scanner;

class VideoTape {
    protected String title;
    protected double duration;

    public VideoTape(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class Movie extends VideoTape {
    private String director;
    private int releaseYear;

    public Movie(String title, double duration, String director, int releaseYear) {
        super(title, duration);
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public void displayInfo() {
        System.out.println("Movie Information");
        System.out.println("-----------------");
        super.displayInfo();
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
    }
}

class MusicVideo extends VideoTape {
    private String artist;
    private String genre;

    public MusicVideo(String title, double duration, String artist, String genre) {
        super(title, duration);
        this.artist = artist;
        this.genre = genre;
    }

    public void displayInfo() {
        System.out.println("Music Video Information");
        System.out.println("-----------------------");
        super.displayInfo();
        System.out.println("Artist: " + artist);
        System.out.println("Genre: " + genre);
    }
}

public class ClassHierarchyExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the details for a Video Tape:");
        System.out.print("Title: ");
        String title = input.nextLine();
        System.out.print("Duration (in minutes): ");
        double duration = input.nextDouble();
        input.nextLine(); // Consume the remaining newline character

        VideoTape videoTape = new VideoTape(title, duration);

        System.out.println("\nEnter the details for a Movie:");
        System.out.print("Title: ");
        title = input.nextLine();
        System.out.print("Duration (in minutes): ");
        duration = input.nextDouble();
        input.nextLine(); // Consume the remaining newline character
        System.out.print("Director: ");
        String director = input.nextLine();
        System.out.print("Release Year: ");
        int releaseYear = input.nextInt();
        input.nextLine(); // Consume the remaining newline character

        Movie movie = new Movie(title, duration, director, releaseYear);

        System.out.println("\nEnter the details for a Music Video:");
        System.out.print("Title: ");
        title = input.nextLine();
        System.out.print("Duration (in minutes): ");
        duration = input.nextDouble();
        input.nextLine(); // Consume the remaining newline character
        System.out.print("Artist: ");
        String artist = input.nextLine();
        System.out.print("Genre: ");
        String genre = input.nextLine();

        MusicVideo musicVideo = new MusicVideo(title, duration, artist, genre);

        input.close();

        System.out.println("\n--- Video Tape Information ---");
        videoTape.displayInfo();

        System.out.println("\n--- Movie Information ---");
        movie.displayInfo();

        System.out.println("\n--- Music Video Information ---");
        musicVideo.displayInfo();
    }
}
