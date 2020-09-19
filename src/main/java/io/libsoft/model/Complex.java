package io.libsoft.model;

import lombok.Data;

@Data
public class Complex {

  private final double a;
  private final double b;
  private final double r;
  private final double theta;

  private Complex(double a, double b) {
    this.a = a;
    this.b = b;
    this.r = Math.hypot(this.a, this.b);
    this.theta = Math.atan2(this.b, this.a);
  }

  public static Complex of(double a, double b) {
    return new Complex(a, b);
  }

  public Complex add(Complex other) {
    return new Complex(this.a + other.a, this.b + other.b);
  }

  public Complex multi(Complex other) {
    double a_n = a * other.a - b * other.b;
    double b_n = a * other.a + b * other.b;
    return new Complex(a_n, b_n);
  }

  public Complex pow(double power) {



    return new Complex(1, 1);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Complex complex = (Complex) o;

    if (Double.compare(complex.a, a) != 0) {
      return false;
    }
    return Double.compare(complex.b, b) == 0;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(a);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(b);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "Complex{" +
        "a=" + a +
        ", b=" + b +
        '}';
  }
}
