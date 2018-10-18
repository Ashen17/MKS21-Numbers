public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int n, int d){
    super(((double)n)/d);
    numerator = n;
    denominator = d;
    if (denominator == 0){
      numerator = 0;
      denominator = 1;
    }//do not allow denominator to be zero
    this.reduce();
  }
  public void reduce(){
    int g = gcd(numerator, denominator);
    numerator /= g;
    denominator /= g;
  }
  public boolean equals(RationalNumber other){
    return this.numerator == other.numerator && this.denominator == other.denominator;
  }
  public static int gcd(int a, int b){
    int c = a % b;
    if (c == 0){return b;}
    return gcd(b, c);
  }

  public RationalNumber reciprocal(){
    RationalNumber n = new RationalNumber(denominator, numerator);
    return n;
  }

  public RationalNumber add(RationalNumber other){
    int newNum = (this.numerator * other.denominator) + (this.denominator * other.numerator);
    int newDen = (this.denominator) * (other.denominator);
    RationalNumber n = new RationalNumber(newNum, newDen);
    return n;
  }

  public RationalNumber subtract(RationalNumber other){
    int newNum = (this.numerator * other.denominator) - (this.denominator * other.numerator);
    int newDen = (this.denominator) * (other.denominator);
    RationalNumber n = new RationalNumber(newNum, newDen);
    return n;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber n = new RationalNumber((this.numerator * other.denominator), (this.denominator * other.numerator));
    return n;
  }
  public RationalNumber multiply(RationalNumber other){
    RationalNumber n = new RationalNumber((this.numerator * other.numerator), (this.denominator * other.denominator));
    return n;
  }

  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public String toString(){
      int printNumerator = numerator;
      int printDenominator = denominator;
      if (numerator == 0){return "0";}
      if (denominator < 0){
        printNumerator *=  -1;
        printDenominator *= -1;
      }//
      if (denominator == 1){return "" + numerator;}
      return printNumerator + "/" + printDenominator;
      //return the string version as numerator/denominator
      //if numerator is zero, ignore denominator
    }
}
