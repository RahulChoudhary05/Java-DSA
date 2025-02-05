import java.util.Scanner;

class Video {
    String title;
    boolean checkedOut;
    double averageRating;
    int ratingCount;
    double totalRating;

    public Video(String title) {
        this.title = title;
        this.checkedOut = false;
        this.averageRating = 0.0;
        this.ratingCount = 0;
        this.totalRating = 0;
    }

    public void checkOut() {
        this.checkedOut = true;
    }

    public void returnVideo() {
        this.checkedOut = false;
    }

    public void receiveRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            totalRating += rating;
            ratingCount++;
            averageRating = totalRating / ratingCount;
        } else {
            System.out.println("Invalid rating. Please provide a rating between 1 and 5.");
        }
    }

    @Override
    public String toString() {
        // Format the output in a table-like row
        return String.format("| %-30s | %-12s | %-10.2f |", title, (checkedOut ? "Yes" : "No"), averageRating);
    }
}

class VideoStore {
    Video[] inventory;
    int videoCount;

    public VideoStore(int capacity) {
        this.inventory = new Video[capacity];
        this.videoCount = 0;
    }

    public void addVideo(String title) {
        if (videoCount < inventory.length) {
            inventory[videoCount++] = new Video(title);
            System.out.println(title + " added to the inventory.");
        } else {
            System.out.println("Inventory is full. Cannot add more videos.");
        }
    }

    public void checkOut(String title) {
        Video video = findVideo(title);
        if (video != null) {
            if (!video.checkedOut) {
                video.checkOut();
                System.out.println(title + " checked out.");
            } else {
                System.out.println(title + " is already checked out.");
            }
        } else {
            System.out.println(title + " not found in the inventory.");
        }
    }

    public void returnVideo(String title) {
        Video video = findVideo(title);
        if (video != null) {
            if (video.checkedOut) {
                video.returnVideo();
                System.out.println(title + " returned.");
            } else {
                System.out.println(title + " is already in the store.");
            }
        } else {
            System.out.println(title + " not found in the inventory.");
        }
    }

    public void receiveRating(String title, int rating) {
        Video video = findVideo(title);
        if (video != null) {
            video.receiveRating(rating);
        } else {
            System.out.println(title + " not found in the inventory.");
        }
    }

    public void listInventory() {
        System.out.println("\nInventory:");
        System.out.printf("| %-30s | %-12s | %-10s |\n", "Title", "Checked Out", "Avg. Rating");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < videoCount; i++) {
            System.out.println(inventory[i]);
        }
        System.out.println("------------------------------------------------------------");
    }

    private Video findVideo(String title) {
        for (int i = 0; i < videoCount; i++) {
            if (inventory[i].title.equals(title)) {
                return inventory[i];
            }
        }
        return null;
    }

    public void interactiveAddVideo(Scanner scanner) {
        System.out.print("Enter the title of the new video: ");
        String title = scanner.nextLine(); // Use nextLine to handle spaces in titles
        addVideo(title);
    }
}

public class VideoStoreLauncher {
    public static void main(String[] args) {
        VideoStore store = new VideoStore(10);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nVideo Rental Store Menu:");
            System.out.println("1. Add a new video");
            System.out.println("2. Check out a video");
            System.out.println("3. Return a video");
            System.out.println("4. Receive a rating for a video");
            System.out.println("5. List inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        store.interactiveAddVideo(scanner);
                        break;
                    case 2:
                        System.out.print("Enter the title of the video to check out: ");
                        String checkoutTitle = scanner.nextLine();
                        store.checkOut(checkoutTitle);
                        break;
                    case 3:
                        System.out.print("Enter the title of the video to return: ");
                        String returnTitle = scanner.nextLine();
                        store.returnVideo(returnTitle);
                        break;
                    case 4:
                        System.out.print("Enter the title of the video to rate: ");
                        String ratingTitle = scanner.nextLine();
                        System.out.print("Enter the rating (1-5): ");
                        int rating = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        store.receiveRating(ratingTitle, rating);
                        break;
                    case 5:
                        store.listInventory();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
                choice = 0; // Reset choice to continue the loop
            }

        } while (choice != 6);

        scanner.close();
    }
}
