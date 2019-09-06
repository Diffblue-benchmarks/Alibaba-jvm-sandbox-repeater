package com.caucho.hessian.io;

import com.caucho.hessian.io.HessianOutput;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;

public class HessianOutputTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final HessianOutput actual = new HessianOutput();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.os);
    Assert.assertNull(actual._serializerFactory);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRefInputPositiveOutputNegative() {

    // Arrange
    final HessianOutput hessianOutput = new HessianOutput();

    // Act and Assert result
    Assert.assertEquals(-1, hessianOutput.getRef(2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void printStringInputNotNullPositivePositiveOutputStringIndexOutOfBoundsException()
      throws IOException {

    // Arrange
    final HessianOutput hessianOutput = new HessianOutput();

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    hessianOutput.printString("foo", 130, 2);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeRefInputPositiveOutputFalse() throws IOException {

    // Arrange
    final HessianOutput hessianOutput = new HessianOutput();

    // Act and Assert result
    Assert.assertFalse(hessianOutput.removeRef(2));
  }
}
