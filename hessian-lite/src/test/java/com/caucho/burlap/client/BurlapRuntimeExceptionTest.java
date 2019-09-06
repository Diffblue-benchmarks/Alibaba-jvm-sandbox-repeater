package com.caucho.burlap.client;

import com.caucho.burlap.client.BurlapRuntimeException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class BurlapRuntimeExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull() {

    // Act, creating object to test constructor
    final BurlapRuntimeException actual = new BurlapRuntimeException("/");

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getCause());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final BurlapRuntimeException actual = new BurlapRuntimeException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getCause());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCauseOutputNull() {

    // Arrange
    final BurlapRuntimeException burlapRuntimeException = new BurlapRuntimeException();

    // Act and Assert result
    Assert.assertNull(burlapRuntimeException.getCause());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRootCauseOutputNull() {

    // Arrange
    final BurlapRuntimeException burlapRuntimeException = new BurlapRuntimeException();

    // Act and Assert result
    Assert.assertNull(burlapRuntimeException.getRootCause());
  }
}
