package com.caucho.hessian;

import com.caucho.hessian.HessianException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class HessianExceptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullNotNullOutputNotNull() {

    // Arrange
    final Throwable rootCause = new Throwable();

    // Act, creating object to test constructor
    final HessianException actual = new HessianException("/", rootCause);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("/", actual.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull() {

    // Act, creating object to test constructor
    final HessianException actual = new HessianException("/");

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("/", actual.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNotNullOutputNotNull2() {

    // Arrange
    final Throwable rootCause = new Throwable();

    // Act, creating object to test constructor
    final HessianException actual = new HessianException(rootCause);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("java.lang.Throwable", actual.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final HessianException actual = new HessianException();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getMessage());
  }
}
