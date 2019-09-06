package com.caucho.burlap.client;

import com.caucho.burlap.client.MicroBurlapOutput;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;

public class MicroBurlapOutputTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void base64encodeInputPositiveOutput1() {

    // Act and Assert result
    Assert.assertEquals('1', MicroBurlapOutput.base64encode(53));
  }

  // Test written by Diffblue Cover.
  @Test
  public void base64encodeInputPositiveOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals('/', MicroBurlapOutput.base64encode(63));
  }

  // Test written by Diffblue Cover.
  @Test
  public void base64encodeInputPositiveOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals('+', MicroBurlapOutput.base64encode(62));
  }

  // Test written by Diffblue Cover.
  @Test
  public void base64encodeInputPositiveOutputV() {

    // Act and Assert result
    Assert.assertEquals('V', MicroBurlapOutput.base64encode(21));
  }

  // Test written by Diffblue Cover.
  @Test
  public void base64encodeInputPositiveOutputw() {

    // Act and Assert result
    Assert.assertEquals('w', MicroBurlapOutput.base64encode(48));
  }

  // Test written by Diffblue Cover.
  @Test
  public void writeCustomObjectInputPositiveOutputIOException() throws IOException {

    // Arrange
    final MicroBurlapOutput microBurlapOutput = new MicroBurlapOutput();

    // Act
    thrown.expect(IOException.class);
    microBurlapOutput.writeCustomObject(2);

    // The method is not expected to return due to exception thrown
  }
}
