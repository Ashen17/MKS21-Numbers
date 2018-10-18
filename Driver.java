public class Driver{
  public static void main(String[] args){
    System.out.println("Testing RealNumber Functions at their basic level");
    RealNumber n = new RealNumber(3.11);
    RealNumber o = new RealNumber(4.21);
    System.out.println(n);
    System.out.println(o);
    System.out.println(n.add(o) == 7.32);
    System.out.println(n.subtract(o) == -1.1);
    System.out.println(n.multiply(o) == 3.11 * 4.21);
    System.out.println(n.divide(o) == 3.11 / 4.21);
    System.out.println("Testing RationalNumber Functions at their basic level");
    RationalNumber a = new RationalNumber(5, 8);
    RationalNumber b = new RationalNumber(4, 12);
    System.out.println(!(b.toString().equals("4/12")));
    System.out.println(b.toString().equals("1/3"));
    System.out.println(b.add(a));//0.95 or 23/24
    System.out.println(a.subtract(b));//0.291 or 7/24
    System.out.println(a.multiply(b).getValue() == (20.0/96));
    System.out.println(a.divide(b).getValue() == (0.625/(4.0/12)));
    System.out.println("Testing RationalNumber and RealNumber Functions in edge cases(negatives and 0's)");
    RationalNumber f = new RationalNumber(-3, -6);
    RationalNumber g = new RationalNumber(2, -4);
    System.out.println(f.subtract(g));//1
    System.out.println(RationalNumber.gcd(-3, 12));
    System.out.println(RationalNumber.gcd(-3, -12));
    System.out.println(RationalNumber.gcd(15, -225));
    RationalNumber z = new RationalNumber(-2, 8);
    RationalNumber y = new RationalNumber(2, -8);
    System.out.println(z.getNumerator() == 1 && z.getDenominator() == -4);
    System.out.println(y);
    RationalNumber c = new RationalNumber(0, 1);
    RationalNumber d = new RationalNumber(1, 0);
    System.out.println(c.toString().equals("0"));
    System.out.println(d.toString().equals("0"));
    System.out.println("Testing Functions with inheritence");
    //mostly used Driver2 for this
    RationalNumber s = new RationalNumber(1, 4);//0.25
    RealNumber t = new RationalNumber(2, 5);//0.4
    //RationalNumber t = new RealNumber(0.21);//error
    System.out.println(s.getValue());
    System.out.println(t.getValue());
    //System.out.println(t.getNumerator());//error
    //System.out.println(t.getDenominator());//error
  }
}
