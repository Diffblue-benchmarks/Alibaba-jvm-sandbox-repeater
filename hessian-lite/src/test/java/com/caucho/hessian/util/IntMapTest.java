package com.caucho.hessian.util;

import com.caucho.hessian.util.IntMap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class IntMapTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getBiggestPrimeInputPositiveOutputPositive() {

    // Act and Assert result
    Assert.assertEquals(67_108_859, IntMap.getBiggestPrime(67_108_862));
  }
}
