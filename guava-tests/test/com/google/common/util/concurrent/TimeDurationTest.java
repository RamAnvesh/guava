package com.google.common.util.concurrent;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

import junit.framework.TestCase;

/**
 * A duration of time in a particular {@link java.util.concurrent.TimeUnit TimeUnit}.
 * Time durations can only be non-negative. duration valuesgreater than
 *
 * @author Ram Anvesh Reddy
 */
public class TimeDurationTest extends TestCase {

  private TimeDuration timeDuration;

  @Override
  public void setUp() throws Exception {
    timeDuration = TimeDuration.of(10, NANOSECONDS);
  }

  public void testOf() throws Exception {
    assertNotNull(timeDuration);
  }

  public void testGetDuration() throws Exception {
    assertEquals(10, timeDuration.getDuration());
  }

  public void testGetUnit() throws Exception {
    assertEquals(NANOSECONDS, timeDuration.getUnit());
  }

}