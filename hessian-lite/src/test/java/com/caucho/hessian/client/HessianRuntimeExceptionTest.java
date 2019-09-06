package com.caucho.hessian.client;

import com.caucho.hessian.client.HessianRuntimeException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class HessianRuntimeExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull() {

    // Act, creating object to test constructor
    final HessianRuntimeException actual = new HessianRuntimeException("/");

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getRootCause());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final HessianRuntimeException actual = new HessianRuntimeException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getRootCause());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCauseOutputNull() {

    // Arrange
    final HessianRuntimeException hessianRuntimeException = new HessianRuntimeException();

    // Act and Assert result
    Assert.assertNull(hessianRuntimeException.getCause());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRootCauseOutputNull() {

    // Arrange
    final HessianRuntimeException hessianRuntimeException = new HessianRuntimeException();

    // Act and Assert result
    Assert.assertNull(hessianRuntimeException.getRootCause());
  }
}
