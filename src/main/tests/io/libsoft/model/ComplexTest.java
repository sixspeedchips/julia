package io.libsoft.model;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

  @org.junit.jupiter.api.Test
  void multi() {
    Complex one = Complex.of(5,5);
    Complex two = Complex.of(1,4);
    assertEquals(one.multi(two), Complex.of(-15, 25));

  }
}