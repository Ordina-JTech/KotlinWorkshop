package nl.ordina.kotlin.helper;

public class JavaExampleClass {

    private String str;

    private boolean bool;

    public JavaExampleClass(String arg1, boolean arg2) {
        str = arg1;
        bool = arg2;
    }

    public String getStr() {
        return str;
    }

    public boolean isBool() {
        return bool;
    }

    public String getJavaFunction() {
        return "Argument 1 has value: " + str + " and argument 2 has value: " + bool;
    }

    public int getJavaFunctionWithParameters(int x, int y) {
        return x + y;
    }

}
