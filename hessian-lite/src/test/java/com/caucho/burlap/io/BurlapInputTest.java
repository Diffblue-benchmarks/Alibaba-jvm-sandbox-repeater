package com.caucho.burlap.io;

import com.caucho.burlap.io.BurlapInput;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class BurlapInputTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void addRefInputPositiveOutputZero() {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertEquals(0, burlapInput.addRef(2));

    // Assert side effects
    final ArrayList arrayList = new ArrayList();
    arrayList.add(2);
    Assert.assertEquals(arrayList, burlapInput._refs);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getInputStreamOutputNull() {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertNull(burlapInput.getInputStream());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getMethodOutputNull() {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertNull(burlapInput.getMethod());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getReaderOutputNull() {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertNull(burlapInput.getReader());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getReplyFaultOutputNull() {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertNull(burlapInput.getReplyFault());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSerializerFactoryOutputNull() {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertNull(burlapInput.getSerializerFactory());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEndOutputFalse() throws IOException {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertFalse(burlapInput.isEnd());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isWhitespaceInputPositiveOutputFalse() throws IOException {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertFalse(burlapInput.isWhitespace(2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void isWhitespaceInputPositiveOutputTrue() throws IOException {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertTrue(burlapInput.isWhitespace(32));
  }

  // Test written by Diffblue Cover.
  @Test
  public void parseTagOutputZero() throws IOException {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertEquals(0, burlapInput.parseTag());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readHeaderOutputNull() throws IOException {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertNull(burlapInput.readHeader());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInput0PositivePositiveOutputUnsupportedOperationException() throws IOException {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();
    final byte[] buffer = {};

    // Act
    thrown.expect(UnsupportedOperationException.class);
    burlapInput.read(buffer, 2, 2);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readInputStreamOutputNull() {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertNull(burlapInput.readInputStream());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLengthOutputNegative() throws IOException {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertEquals(-1, burlapInput.readLength());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readListStartOutputZero() throws IOException {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertEquals(0, burlapInput.readListStart());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readMapStartOutputZero() throws IOException {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertEquals(0, burlapInput.readMapStart());
  }

  // Test written by Diffblue Cover.
  @Test
  public void readTypeOutputNotNull() throws IOException {

    // Arrange
    final BurlapInput burlapInput = new BurlapInput();

    // Act and Assert result
    Assert.assertEquals("", burlapInput.readType());
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputNegativeOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("end of file", BurlapInput.tagName(-1));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("unknown 107008", BurlapInput.tagName(107_008));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull2() {

    // Act and Assert result
    Assert.assertEquals("<base64>", BurlapInput.tagName(8));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull3() {

    // Act and Assert result
    Assert.assertEquals("</xml>", BurlapInput.tagName(107));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull4() {

    // Act and Assert result
    Assert.assertEquals("</string>", BurlapInput.tagName(106));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull5() {

    // Act and Assert result
    Assert.assertEquals("</fault>", BurlapInput.tagName(117));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull6() {

    // Act and Assert result
    Assert.assertEquals("</remote>", BurlapInput.tagName(114));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull7() {

    // Act and Assert result
    Assert.assertEquals("</burlap:call>", BurlapInput.tagName(115));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull8() {

    // Act and Assert result
    Assert.assertEquals("<burlap:call>", BurlapInput.tagName(15));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull9() {

    // Act and Assert result
    Assert.assertEquals("</burlap:reply>", BurlapInput.tagName(116));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull10() {

    // Act and Assert result
    Assert.assertEquals("<remote>", BurlapInput.tagName(14));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull11() {

    // Act and Assert result
    Assert.assertEquals("<fault>", BurlapInput.tagName(17));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull12() {

    // Act and Assert result
    Assert.assertEquals("<ref>", BurlapInput.tagName(13));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull13() {

    // Act and Assert result
    Assert.assertEquals("</ref>", BurlapInput.tagName(113));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull14() {

    // Act and Assert result
    Assert.assertEquals("<length>", BurlapInput.tagName(12));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull15() {

    // Act and Assert result
    Assert.assertEquals("<header>", BurlapInput.tagName(19));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull16() {

    // Act and Assert result
    Assert.assertEquals("</header>", BurlapInput.tagName(119));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull17() {

    // Act and Assert result
    Assert.assertEquals("<list>", BurlapInput.tagName(10));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull18() {

    // Act and Assert result
    Assert.assertEquals("</double>", BurlapInput.tagName(104));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull19() {

    // Act and Assert result
    Assert.assertEquals("</type>", BurlapInput.tagName(111));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull20() {

    // Act and Assert result
    Assert.assertEquals("<burlap:reply>", BurlapInput.tagName(16));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull21() {

    // Act and Assert result
    Assert.assertEquals("<type>", BurlapInput.tagName(11));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull22() {

    // Act and Assert result
    Assert.assertEquals("</map>", BurlapInput.tagName(109));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull23() {

    // Act and Assert result
    Assert.assertEquals("</list>", BurlapInput.tagName(110));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull24() {

    // Act and Assert result
    Assert.assertEquals("<xml>", BurlapInput.tagName(7));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull25() {

    // Act and Assert result
    Assert.assertEquals("</base64>", BurlapInput.tagName(108));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull26() {

    // Act and Assert result
    Assert.assertEquals("</length>", BurlapInput.tagName(112));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull27() {

    // Act and Assert result
    Assert.assertEquals("<map>", BurlapInput.tagName(9));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull28() {

    // Act and Assert result
    Assert.assertEquals("<string>", BurlapInput.tagName(6));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull29() {

    // Act and Assert result
    Assert.assertEquals("<double>", BurlapInput.tagName(4));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull30() {

    // Act and Assert result
    Assert.assertEquals("</long>", BurlapInput.tagName(103));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull31() {

    // Act and Assert result
    Assert.assertEquals("<long>", BurlapInput.tagName(3));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull32() {

    // Act and Assert result
    Assert.assertEquals("</int>", BurlapInput.tagName(102));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull33() {

    // Act and Assert result
    Assert.assertEquals("<int>", BurlapInput.tagName(2));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull34() {

    // Act and Assert result
    Assert.assertEquals("</boolean>", BurlapInput.tagName(101));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull35() {

    // Act and Assert result
    Assert.assertEquals("</null>", BurlapInput.tagName(100));
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagNameInputPositiveOutputNotNull36() {

    // Act and Assert result
    Assert.assertEquals("<boolean>", BurlapInput.tagName(1));
  }
}
