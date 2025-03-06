public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // Default values of primitive types
        boolean defaultBoolean = false;
        byte defaultByte = 0;
        short defaultShort = 0;
        int defaultInt = 0;
        long defaultLong = 0L;
        float defaultFloat = 0.0f;
        double defaultDouble = 0.0;
        char defaultChar = '\u0000';

        // Assigned values
        boolean booleanVal = true;
        byte byteVal = 100;
        short shortVal = 3000;
        int intVal = 100000;
        long longVal = 10000000000L;
        float floatVal = 10.5f;
        double doubleVal = 25.99;
        char charVal = 'A';

        System.out.println("Default Values:");
        System.out.println("boolean: " + defaultBoolean);
        System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: " + defaultChar);

        System.out.println("\nAssigned Values:");
        System.out.println("boolean: " + booleanVal);
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
    }
}
