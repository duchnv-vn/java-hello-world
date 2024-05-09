package section_11;

public class MeClass implements PersonInterface, WorkInterface {
    private String name;
    private String comName;
    private String[] hobbies;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setComName(String name) {
        this.comName = name;
    }

    @Override
    public String getComName() {
        return this.comName;
    }

    @Override
    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String[] getHobbies() {
        return this.hobbies;
    }

    @Override
    public void duplicatedMethod() {
    };
}
