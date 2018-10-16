public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int n, int d){
    numerator = n;
    denominator = d;//do not allow denominator to be zero
    super((n+0.0)/d);//
    }
  public RationalNumber(RationalNumber n, int factor){
    //constructor for creating a multiple of the same RationalNumber
  }
  public RationalNumber compareTo(RationalNumber n){
    //uses cross multiplication/equalizes denominators to return the larger RationalNumber
  }
  public RationalNumber Reduce(RationalNumber n){
    //simplifies the rationalnumber by finding the GCF of both values;
  }

  public int getNum(){
    return numerator;
  }
  public int getDem(){
    return denominator;
  }
  public String toString(){
    //return the string version as numerator/denominator
    //if numerator is zero, ignore denominator
  }
}
