package io.github.bloodnighttw.CA4J.Body.Type;

public final class BasicType {

    //Types in java keyWords
    public final static String BYTE = "byte";
    public final static String SHORT = "short";
    public final static String INT = "int";
    public final static String LONG = "long";

    public final static String FLOAT = "float";
    public final static String DOUBLE = "double";

    public final static String CHAR = "char";

    public final static String VOID = "void";

    public static String basicTypeFinder(String string){

        switch (string) {
            case BYTE:
                return BYTE;
            case SHORT:
                return SHORT;
            case INT:
                return INT;
            case LONG:
                return LONG;
            case FLOAT:
                return FLOAT;
            case DOUBLE:
                return DOUBLE;
            case CHAR:
                return CHAR;
            case VOID:
                return VOID;
            default:
                return null;
        }

    }
}
