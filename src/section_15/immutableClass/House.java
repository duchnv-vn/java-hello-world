package section_15.immutableClass;

public record House(String address, int area) implements Cloneable {

    public House {
        if (address == null) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public House clone() throws CloneNotSupportedException {
        return (House) super.clone();
    }
}
