package day3;

import org.testng.annotations.Test;

public class ForgotPassword {
  @Test
  public void forgotPasswordWithEmail() {
	  System.out.println("Link has been sent to your Email Id");
  }
  @Test
  public void forgotPasswordWithMobileNo() {
	  System.out.println("OTP has been sent to your Registered Mobile Number");
  }

}
