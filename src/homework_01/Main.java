package homework_01;

public class Main {
    public static void main(String[] args) {
//        TASK 1
        char ch = 'G';
        int int1 = 89;
        byte byteValue = 4;
        short shortValue = 56;
        float floatValue = 4.7333436F;
        double doubleValue = 4.355453532;
        long longValue = 12121L;
        System.out.println(" TASK 1");
        System.out.println("char: " + ch);
        System.out.println("int: " + int1);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("long: " + longValue);
        System.out.println(" ");
        Character ch1 = 'G';
        Integer int2 = 89;
        Byte byteValue1 = 4;
        Short shortValue1 = 56;
        Float floatValue1 = 4.7333436F;
        Double doubleValue1 = 4.355453532;
        Long longValue1 = 12121L;
        System.out.println("char: " + ch1);
        System.out.println("int: " + int2);
        System.out.println("byte: " + byteValue1);
        System.out.println("short: " + shortValue1);
        System.out.println("float: " + floatValue1);
        System.out.println("double: " + doubleValue1);
        System.out.println("long: " + longValue1);
        System.out.println(" ");
        System.out.println(" TASK 2");
//        TASK 2

        int value = 345;

        //Option 1
        System.out.println("Число " + value + " -> " + value/100 + ", " + value/10%10 + ", " + value%10);

        //Option 2
        String valueStr = Integer.toString(value);
        System.out.println("Число " + value + " -> " + valueStr.charAt(0) + ", " + valueStr.charAt(1) + ", " + valueStr.charAt(2));

    }
}