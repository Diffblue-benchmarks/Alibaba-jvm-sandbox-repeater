package com.caucho.burlap.client;

import com.caucho.burlap.client.BurlapProxy;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class BurlapProxyTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNullNullOutputNotNull() {

    // Act, creating object to test constructor
    final BurlapProxy actual = new BurlapProxy(null, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getURL());
  }
}
