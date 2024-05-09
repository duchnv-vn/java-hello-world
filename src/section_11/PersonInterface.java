package section_11;

public interface PersonInterface extends HobbieInterface {
    String NATIONALITY = "Vietnam";

    /**
     * @param name : First name of person
     **/
    void setName(String name);

    /**
     * @return Returns first name of person
     **/
    String getName();

    default String getFullName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    static String getNationality() {
        return NATIONALITY;
    }

    default void duplicatedMethod() {
        System.out.println("duplicated method of person interface is executing...");
    };
}
