package com.example.myproject;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;

/**
 * Tests for correct dependency retrieval with maven rules.
 */
public class TestApp {

  @Test
  public void testCompare() throws Exception {
    App app = new App();
    assertEquals("should return 0 when both numbers are equal", 0, app.compare(1, 1));
  }

  /*
  @Test
  public void testFlaky1() throws Exception {
    File f = new File("C:/Projects/bazel_tests/dir1");
    if (f.exists()) {
      f.delete();
      assertEquals("flaky 1 test", 0, 1);
    }
    else {
      f.mkdir();
    }
  }
*/

  @Test
  public void testFlaky2() throws Exception {
    File f = new File("C:/Projects/bazel_tests/dir2");
    if (f.exists()) {
      f.delete();
    }
    else {
      f.mkdir();
      assertEquals("flaky 2 test", 0, 1);
    }
  }

}
