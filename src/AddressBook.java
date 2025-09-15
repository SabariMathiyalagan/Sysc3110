import java.util.ArrayList;


public class AddressBook {
    private ArrayList<BuddyInfo> buddies;  // A collection of BuddyInfo objects

    // Constructor to initialize the address book
    public AddressBook() {
        buddies = new ArrayList<>();  // Using an ArrayList to store BuddyInfo objects
    }

    // Method to add a buddy to the address book
    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
        System.out.println("Buddy added: " + buddy.getName());
    }

    // Method to remove a buddy from the address book
    public void removeBuddy(BuddyInfo buddy) {
        if (buddies.contains(buddy)) {
            buddies.remove(buddy);
            System.out.println("Buddy removed: " + buddy.getName());
        } else {
            System.out.println("Buddy not found: " + buddy.getName());
        }
    }

    // Method to display all buddies in the address book
    public void displayBuddies() {
        System.out.println("Address Book:");
        for (BuddyInfo buddy : buddies) {
            System.out.println(buddy);
        }
    }
    public static void main(String[] args) {
        System.out.println("Address Book");


    }
}


