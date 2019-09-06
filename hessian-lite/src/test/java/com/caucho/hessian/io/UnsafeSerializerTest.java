package com.caucho.hessian.io;

import com.caucho.hessian.io.UnsafeSerializer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class UnsafeSerializerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.

  @Test
  public void isEnabledOutputTrue() {

    // Act
    final boolean actual = UnsafeSerializer.isEnabled();

    // Assert result
    Assert.assertTrue(actual);
  }
}
