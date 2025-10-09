package boxing;

public class wrapper {

    public static void main(String[] args) {
        // --------- Autoboxing ---------
        int a = 10;
        Integer intObj = a;

        double b = 20.5;
        Double doubleObj = b;

        char c = 'X';
        Character charObj = c;

        boolean d = true;
        Boolean boolObj = d;

        byte e = 1;
        Byte byteObj = e;

        short f = 12;
        Short shortObj = f;

        float g = 12.45f;
        Float floatObj = g;

        long h = 234;
        Long longObj = h;

        // --------- Unboxing ---------
        int i2 = intObj;          // intObj.intValue()
        double d2 = doubleObj;    // doubleObj.doubleValue()
        char c2 = charObj;        // charObj.charValue()
        boolean bool2 = boolObj;  // boolObj.booleanValue()
        byte b2 = byteObj;        // byteObj.byteValue()
        short s2 = shortObj;      // shortObj.shortValue()
        float f2 = floatObj;      // floatObj.floatValue()
        long l2 = longObj;        // longObj.longValue()

        // --------- Output ---------
        System.out.println("Autoboxing and Unboxing Demo:");

        // Autoboxing results
        System.out.println("byte -> Byte: " + byteObj);
        System.out.println("short -> Short: " + shortObj);
        System.out.println("int -> Integer: " + intObj);
        System.out.println("long -> Long: " + longObj);
        System.out.println("float -> Float: " + floatObj);
        System.out.println("double -> Double: " + doubleObj);
        System.out.println("char -> Character: " + charObj);
        System.out.println("boolean -> Boolean: " + boolObj);

        // Unboxing results
        System.out.println("Byte -> byte: " + b2);
        System.out.println("Short -> short: " + s2);
        System.out.println("Integer -> int: " + i2);
        System.out.println("Long -> long: " + l2);
        System.out.println("Float -> float: " + f2);
        System.out.println("Double -> double: " + d2);
        System.out.println("Character -> char: " + c2);
        System.out.println("Boolean -> boolean: " + bool2);
    }
}
