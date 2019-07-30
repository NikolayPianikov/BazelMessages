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
    System.out.println("##teamcity[buildProblem flowId='20' description='Test printTCMessage failed']");
  }

}
