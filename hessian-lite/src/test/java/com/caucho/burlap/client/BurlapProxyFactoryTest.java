package com.caucho.burlap.client;

import com.caucho.burlap.client.BurlapProxyFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class BurlapProxyFactoryTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void encodeInputPositiveOutput1() {

    // Act and Assert result
    Assert.assertEquals('1', BurlapProxyFactory.encode(53L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeInputPositiveOutputd() {

    // Act and Assert result
    Assert.assertEquals('d', BurlapProxyFactory.encode(29L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeInputPositiveOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals('+', BurlapProxyFactory.encode(62L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeInputPositiveOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals('/', BurlapProxyFactory.encode(63L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeInputPositiveOutputV() {

    // Act and Assert result
    Assert.assertEquals('V', BurlapProxyFactory.encode(21L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isOverloadEnabledOutputFalse() {

    // Arrange
    final BurlapProxyFactory burlapProxyFactory = new BurlapProxyFactory();

    // Act and Assert result
    Assert.assertFalse(burlapProxyFactory.isOverloadEnabled());
  }
}
