package day2;

import org.testng.annotations.Test;

public class Login {
  @Test
  public void validLogin() {
	  System.out.println("Login with Valid Credentials");
  }
  @Test
  public void blankUserAndpassLogin() {
	  System.out.println("Login with blank data");
  }
  @Test
  public void InvalidLogin() {
	  System.out.println("Login with InValid Credentials");
  }
}
