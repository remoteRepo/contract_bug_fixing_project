package DZ_1;

public class Pobitovieoperatsii {
    public static void main(String[] args) {
        int a = 0b1101;
        System.out.println("a = " + a);
        System.out.println("a before " + Integer.toBinaryString(a));

        a = a << 5;

        System.out.println("a after " + Integer.toBinaryString(a));
        System.out.println("a = " + a);
        int b = 0b0011;
        System.out.println(a|b);// побитовое или
        System.out.println(a&b);// побитовое и
        System.out.println("a = " + Integer.toBinaryString(a) +  "b =" + Integer.toBinaryString(b));
        System.out.println(a^b);// исключающее и

        int i = 3;
        int c = i++ + ++i + i-- + 4*i++ - 5*i--;
        System.out.println("c = " + c);
        System.out.println("i = " + i);
    }
}
