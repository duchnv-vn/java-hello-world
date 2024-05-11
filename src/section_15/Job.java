package section_15;

public class Job implements Cloneable {
    private String companyName;
    private String position;

    public Job(String companyName, String position) {
        this.companyName = companyName;
        this.position = position;
    }

    @Override
    protected Job clone() throws CloneNotSupportedException {
        return (Job) super.clone();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
