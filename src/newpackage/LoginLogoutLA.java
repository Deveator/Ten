package newpackage;

public class LoginLogoutLA extends Help {
/*
	public static void main(String[] args) {

		/// String baseUrl = "https://test-5-7.ladesk.com/agent/#login;";

		// Set GoogleChrome Driver
		Help.setGCD();

		// Go to URL
		/// driver.get(baseUrl);

		// LoginLA
		Help.loginLA(driver);

		// check equals of userName
		if (Help.approveLoginLA(driver)) {
			// logout from LA
			Help.logoutLA(driver, nameOfUser);
		} else {
			System.out.println("TestNO");
		}

		Help.checkResult(result);

		driver.close();
	}
*/
	public static void mLoginLogoutLA() {

		/// String baseUrl = "https://test-5-7.ladesk.com/agent/#login;";

		// Set GoogleChrome Driver
		Help.setGCD();

		// Go to URL
		/// driver.get(baseUrl);

		// LoginLA
		Help.loginLA(driver);

		// check equals of userName
		if (Help.approveLoginLA(driver)) {
			// logout from LA
			Help.logoutLA(driver, nameOfUser);
		} else {
			System.out.println("TestNO");
		}

		Help.checkResult(result);

		driver.close();
	}

	

}
