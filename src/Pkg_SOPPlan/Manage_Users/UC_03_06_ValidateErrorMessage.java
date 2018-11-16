package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_06_ValidateErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_06_ValidateErrorMessage";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_06_ValidateErrorMessage";
		cl.readXML();
		cl.loadTestData();
		
		if(cl.isLoginRequired.equals("YES"))
		{
			cl.loadURL("");
			cl.login();
		}
		else
		{
			cl.createResultFolder();
		}
		
		if(cl.isMenuNavigationRequired.equals("YES"))
		{
			cl.executeTestStep("mci_administrator_menu", "mouseover");
			cl.executeTestStep("mus_manage_users_menu", "click");
		}
		
		cl.executeTestStep("mus_add_users_manually", "click");
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mus_first_name", "set");
		cl.executeTestStep("mus_last_name", "set");
		cl.executeTestStep("mus_email_id", "set");
		cl.executeTestStep("mus_display_name", "set");
		
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mus_first_name", "set");
		cl.executeTestStep("mus_last_name", "set");
		cl.executeTestStep("mus_email_id", "set");
		cl.executeTestStep("mus_display_name", "set");
		
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mus_first_name", "set");
		cl.executeTestStep("mus_last_name", "set");
		cl.executeTestStep("mus_email_id", "set");
		cl.executeTestStep("mus_display_name", "set");
				
		cl.executeTestStep("mus_save_changes", "click");		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok");

		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mus_existing_email_validator", "validate");
				
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mus_empty_first_name_validator", "validate");
		cl.executeTestStep("mus_empty_email_validator", "validate");
		
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mus_empty_last_name_validator", "validate");
		cl.executeTestStep("mus_invalid_email_validator", "validate");
				
		Thread.sleep(10000);
		cl.resultfinal();
	}
}
