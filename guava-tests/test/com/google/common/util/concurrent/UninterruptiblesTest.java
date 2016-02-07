package com.google.common.util.concurrent;

import com.google.common.testing.NullPointerTester;

import junit.framework.TestCase;

import java.util.concurrent.Semaphore;

/**
 * @author Ram Anvesh Reddy
 */
public class UninterruptiblesTest extends TestCase {

  public void testNulls() throws Exception {
    NullPointerTester nullPointerTester = new NullPointerTester();
    nullPointerTester.setDefault(Semaphore.class, new Semaphore(1));

    nullPointerTester.testAllPublicStaticMethods(Uninterruptibles.class);
    nullPointerTester.testAllPublicConstructors(Uninterruptibles.class);
    nullPointerTester.testAllPublicInstanceMethods(nullPointerTester);
  }
}