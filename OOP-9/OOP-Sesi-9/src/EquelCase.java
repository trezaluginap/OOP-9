public class EquelCase {
    public static void main(String[] args) {
        String a = "Treza Lugina";
        String b = "Treza lugina";
        String c = "treza lugina";

        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equalsIgnoreCase(c));
    }
}
