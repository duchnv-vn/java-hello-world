package section_16;

public class Section16 {
    public static void main(String[] args) {
        var var1 = 1;
        Integer wrappedVar1 = Integer.valueOf(var1); // INTEGER WRAPPED OBJECT - BOXING PROCESS
        var unwrappedVar1 = wrappedVar1.intValue(); // UNBOXING PROCESS

        Integer autoWrappedVar1 = var1; // AUTO BOXING PROCESS
        int autoUnwrappedVar1 = autoWrappedVar1; // AUTO UNBOXING PROCESS
    }
}
