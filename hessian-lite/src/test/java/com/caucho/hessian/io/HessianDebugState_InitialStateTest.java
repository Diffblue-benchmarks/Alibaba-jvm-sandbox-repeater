package com.caucho.hessian.io;

import com.caucho.hessian.io.HessianDebugState;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class HessianDebugState_InitialStateTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNullOutputNotNull() {

    // Act, creating object to test constructor
    final HessianDebugState actual = new HessianDebugState(null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getDepth());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isIntegerInputPositiveOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(HessianDebugState.isInteger(2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isIntegerInputPositiveOutputTrue() {

    // Act and Assert result
    Assert.assertTrue(HessianDebugState.isInteger(73));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isStringInputPositiveOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(HessianDebugState.isString(60));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isStringInputPositiveOutputTrue() {

    // Act and Assert result
    Assert.assertTrue(HessianDebugState.isString(28));
  }
}
