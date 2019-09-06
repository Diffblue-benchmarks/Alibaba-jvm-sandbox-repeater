package com.caucho.hessian.io;

import com.caucho.hessian.io.Hessian2Input.ObjectDefinition;
import com.caucho.hessian.io.Hessian2Input;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(PowerMockRunner.class)
public class Hessian2InputTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void addRefInputPositiveOutputZero() throws Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act and Assert result
    Assert.assertEquals(0, hessian2Input.addRef(2));

    // Assert side effects
    final ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add(2);
    Assert.assertEquals(arrayList, hessian2Input._refs);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void codeNameInputNegativeOutputNotNull() throws Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act and Assert result
    Assert.assertEquals("end of file", hessian2Input.codeName(-982_926));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void codeNameInputPositiveOutputNotNull() throws Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act and Assert result
    Assert.assertEquals("0xd (\r)", hessian2Input.codeName(13));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void constructorInputNullOutputNotNull() throws Exception {

    // Act, creating object to test constructor
    final Hessian2Input actual = new Hessian2Input(null);

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<Object> arrayList = new ArrayList<Object>();
    Assert.assertEquals(arrayList, actual._refs);
    Assert.assertNull(actual._serializerFactory);
    final ArrayList<Hessian2Input.ObjectDefinition> arrayList1 =
        new ArrayList<Hessian2Input.ObjectDefinition>();
    Assert.assertEquals(arrayList1, actual._classDefs);
    final ArrayList<String> arrayList2 = new ArrayList<String>();
    Assert.assertEquals(arrayList2, actual._types);
    Assert.assertNull(actual.getReplyFault());
    Assert.assertNull(actual._defaultSerializerFactory);
    Assert.assertNull(actual.getMethod());
    Assert.assertNull(actual.getRemoteResolver());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void constructorOutputNotNull() throws Exception {

    // Act, creating object to test constructor
    final Hessian2Input actual = new Hessian2Input();

    // Assert result
    Assert.assertNotNull(actual);
    final ArrayList<Object> arrayList = new ArrayList<Object>();
    Assert.assertEquals(arrayList, actual._refs);
    Assert.assertNull(actual._serializerFactory);
    final ArrayList<Hessian2Input.ObjectDefinition> arrayList1 =
        new ArrayList<Hessian2Input.ObjectDefinition>();
    Assert.assertEquals(arrayList1, actual._classDefs);
    final ArrayList<String> arrayList2 = new ArrayList<String>();
    Assert.assertEquals(arrayList2, actual._types);
    Assert.assertNull(actual.getReplyFault());
    Assert.assertNull(actual._defaultSerializerFactory);
    Assert.assertNull(actual.getMethod());
    Assert.assertNull(actual.getRemoteResolver());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void getMethodOutputNull() throws Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act and Assert result
    Assert.assertNull(hessian2Input.getMethod());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void getReaderOutputNull() throws Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act and Assert result
    Assert.assertNull(hessian2Input.getReader());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void getReplyFaultOutputNull() throws Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act and Assert result
    Assert.assertNull(hessian2Input.getReplyFault());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void isCloseStreamOnCloseOutputFalse() throws Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act and Assert result
    Assert.assertFalse(hessian2Input.isCloseStreamOnClose());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void parseXMLOutputUnsupportedOperationException() throws IOException, Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act
    thrown.expect(UnsupportedOperationException.class);
    hessian2Input.parseXML();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void readHeaderOutputNull() throws IOException, Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act and Assert result
    Assert.assertNull(hessian2Input.readHeader());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void readLengthOutputUnsupportedOperationException() throws IOException, Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act
    thrown.expect(UnsupportedOperationException.class);
    hessian2Input.readLength();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void setRefInputPositivePositiveOutputIndexOutOfBoundsException() throws Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    hessian2Input.setRef(3, 2);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Level.class, Logger.class})
  @Test
  public void unreadOutputIllegalStateException() throws Exception {

    // Arrange
    final Hessian2Input hessian2Input = new Hessian2Input();

    // Act
    thrown.expect(IllegalStateException.class);
    hessian2Input.unread();

    // The method is not expected to return due to exception thrown
  }
}
