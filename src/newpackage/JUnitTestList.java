package newpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitTestList {

	@Before
	public void deforeEveryTest() {
		System.out.println("beforeTest");
	}
	
	@Test
	public void loginLogoutTest() {
		LoginLogoutLA.mLoginLogoutLA();
	}
/*
	@Test
	public void dialOutPrefixColumnTest() {
		DialOutPrefixColumn.mDialOutPrefixColumn();
	}

	@Test
	public void numberOfDaysTest() {
		NumberOfDays.mNumberOfDays();
	}

	

	// Gmail account mail must be empty
	@Test
	public void SendToOneRecipientTest() {
		SendToOneRecipient.mSendToOneRecipient();
	}

	// Gmail accounts mail must be empty
	@Test
	public void SendToSeveralRecipientsTest() {
		SendToSeveralRecipients.mSendToSeveralRecipients();
	}

	// Gmail accounts mail must be empty
	@Test
	public void SendToMainCCRecipientTest() {
		SendToMainCCRecipient.mSendToMainCCRecipient();
	}

	// Gmail accounts mail must be empty
	@Test
	public void SendToMainBCCRecipientTest() {
		SendToMainBCCRecipient.mSendToMainBCCRecipient();
	}
	
	// Gmail accounts mail must be empty
		@Test
		public void SendToMainCCBCCRecipientTest() {
			SendToMainCCBCCRecipient.mSendToMainCCBCCRecipient();
		}
*/
	@After
	public void afterEveryTest() {
		System.out.println("afterTest");
	}

}
