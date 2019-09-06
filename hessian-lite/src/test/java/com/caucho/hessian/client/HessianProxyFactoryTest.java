package com.caucho.hessian.client;

import com.caucho.hessian.client.HessianProxyFactory;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class HessianProxyFactoryTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void encodeInputPositiveOutput1() {

    // Act and Assert result
    Assert.assertEquals('1', HessianProxyFactory.encode(53L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeInputPositiveOutputd() {

    // Act and Assert result
    Assert.assertEquals('d', HessianProxyFactory.encode(29L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeInputPositiveOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals('+', HessianProxyFactory.encode(62L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeInputPositiveOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals('/', HessianProxyFactory.encode(63L));
  }

  // Test written by Diffblue Cover.
  @Test
  public void encodeInputPositiveOutputV() {

    // Act and Assert result
    Assert.assertEquals('V', HessianProxyFactory.encode(21L));
  }
}
