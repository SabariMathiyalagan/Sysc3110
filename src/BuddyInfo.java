

public class BuddyInfo {


    private String name;
    private String address;
    private String phoneNumber;

    /**
     * Constructor to initialize BuddyInfo with the specified name, address, and phone number.
     *
     * @param name the name of the buddy
     * @param address the address of the buddy
     * @param phoneNumber the phone number of the buddy
     */
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the name of the buddy.
     *
     * @return the name of the buddy
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the address of the buddy.
     *
     * @return the address of the buddy
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the phone number of the buddy.
     *
     * @return the phone number of the buddy
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Main method to create a BuddyInfo object and display a greeting message.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        BuddyInfo buddyInfo = new BuddyInfo("George", "Carleton University", "1231231234");

        System.out.println("Hello " + buddyInfo.getName());
    }
}
