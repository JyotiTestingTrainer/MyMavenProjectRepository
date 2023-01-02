package day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration {
  @Test
  public void regist() {
	  System.out.println("This is Registration 1");
  }

  @Test
  public void regist2() {
	  System.out.println("This is Registration for user 2");
  }
  @Test
  public void registFailed() {
	  Assert.assertTrue(true);
  }
}
