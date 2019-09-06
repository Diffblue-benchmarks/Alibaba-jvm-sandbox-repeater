package com.caucho.hessian.io;

import com.caucho.hessian.io.HessianInput;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class HessianInputTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void addRefInputPositiveOutputZero() {

    // Arrange
    final HessianInput hessianInput = new HessianInput();

    // Act and Assert result
    Assert.assertEquals(0, hessianInput.addRef(2));

    // Assert side effects
    final ArrayList arrayList = new ArrayList();
    arrayList.add(2);
    Assert.assertEquals(arrayList, hessianInput._refs);
  }

  // Test written by Diffblue Cover.
  @Test
  public void codeNameInputNegativeOutputNotNull() {

    // Arrange
    final HessianInput hessianInput = new HessianInput();

    // Act and Assert result
    Assert.assertEquals("end of file", hessianInput.codeName(-983_025));
  }

  // Test written by Diffblue Cover.
  @Test
  public void codeNameInputPositiveOutputNotNull() {

    // Arrange
    final HessianInput hessianInput = new HessianInput();

    // Act and Assert result
    Assert.assertEquals("0xa (\u600a)", hessianInput.codeName(483_338));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getMethodOutputNull() {

    // Arrange
    final HessianInput hessianInput = new HessianInput();

    // Act and Assert result
    Assert.assertNull(hessianInput.getMethod());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getReaderOutputNull() {

    // Arrange
    final HessianInput hessianInput = new HessianInput();

    // Act and Assert result
    Assert.assertNull(hessianInput.getReader());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getReplyFaultOutputNull() {

    // Arrange
    final HessianInput hessianInput = new HessianInput();

    // Act and Assert result
    Assert.assertNull(hessianInput.getReplyFault());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSerializerFactoryOutputNull() {

    // Arrange
    final HessianInput hessianInput = new HessianInput();

    // Act and Assert result
    Assert.assertNull(hessianInput.getSerializerFactory());
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseXMLOutputUnsupportedOperationException() throws IOException {

    // Arrange
    final HessianInput hessianInput = new HessianInput();

    // Act
    thrown.expect(UnsupportedOperationException.class);
    hessianInput.parseXML();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput0NegativeNegativeOutputZero() throws IOException {

    // Arrange
    final HessianInput hessianInput = new HessianInput();
    final byte[] buffer = {};

    // Act and Assert result
    Assert.assertEquals(0, hessianInput.read(buffer, -999_998, -999_999));
  }
}
