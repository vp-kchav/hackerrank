package javaconcept;

public class TipTop {
    static final Integer i1= 1;
    final Integer i2 = 2;
    Integer i3 =3;

    // because main didn't call anything so
    // system complile but print nothing.
    public static void main (String arg[]) {
        final Integer i4 = 4;
        Integer i5= 5;

        class Inner {
            final Integer i6 = 6;
            Integer i7 = 7;
            Inner() {
                System.out.println(i6+i7);
            }
        }
        // this will print the contructor of class Inner whic is 13
        // Inner inner = new Inner();
    }
}
