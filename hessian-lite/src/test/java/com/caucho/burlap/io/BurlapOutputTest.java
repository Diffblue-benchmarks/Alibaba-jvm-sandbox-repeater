package com.caucho.burlap.io;

import com.caucho.burlap.io.BurlapOutput;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;

public class BurlapOutputTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final BurlapOutput actual = new BurlapOutput();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.os);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRefInputPositiveOutputNegative() {

    // Arrange
    final BurlapOutput burlapOutput = new BurlapOutput();

    // Act and Assert result
    Assert.assertEquals(-1, burlapOutput.getRef(2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void printStringInputNotNullPositivePositiveOutputStringIndexOutOfBoundsException()
      throws IOException {

    // Arrange
    final BurlapOutput burlapOutput = new BurlapOutput();

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    burlapOutput.printString("foo", 524_291, 2);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeRefInputPositiveOutputFalse() throws IOException {

    // Arrange
    final BurlapOutput burlapOutput = new BurlapOutput();

    // Act and Assert result
    Assert.assertFalse(burlapOutput.removeRef(2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeByteBufferEndInput0PositivePositiveOutputUnsupportedOperationException()
      throws IOException {

    // Arrange
    final BurlapOutput burlapOutput = new BurlapOutput();
    final byte[] buffer = {};

    // Act
    thrown.expect(UnsupportedOperationException.class);
    burlapOutput.writeByteBufferEnd(buffer, 2, 2);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeByteBufferPartInput0PositivePositiveOutputUnsupportedOperationException()
      throws IOException {

    // Arrange
    final BurlapOutput burlapOutput = new BurlapOutput();
    final byte[] buffer = {};

    // Act
    thrown.expect(UnsupportedOperationException.class);
    burlapOutput.writeByteBufferPart(buffer, 2, 2);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeByteBufferStartOutputUnsupportedOperationException() throws IOException {

    // Arrange
    final BurlapOutput burlapOutput = new BurlapOutput();

    // Act
    thrown.expect(UnsupportedOperationException.class);
    burlapOutput.writeByteBufferStart();

    // The method is not expected to return due to exception thrown
  }
}
