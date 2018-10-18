public class RealNumber{
  private double value;

  public RealNumber(double val){
    value = val;
  }

  public double getValue(){
    return value;
  }

  public double add(RealNumber other){
    return value + other.getValue();
  }
  public double subtract(RealNumber other){
    //System.out.println("Value:" + value);
    //System.out.println("other.getValue():" + other.getValue());
    return value - other.getValue();

  }
  public double multiply(RealNumber other){
    return value * other.getValue();
  }
  public double divide(RealNumber other){
    return value / other.getValue();
  }

  public String toString(){
  return "" + value;
  }
}
