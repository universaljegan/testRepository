package Pkg_SOPPlan.Manage_Calendars;

import Pkg_SOPPlan.commonLibrary;

public class UC_07_10_CheckAndChangePublicHolidays2 {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "07_Manage_Calendar";
		cl.testCaseName = "UC_07_10_CheckAndChangePublicHolidays2";
		cl.tableName = "tbl_manage_calendar";
		cl.useCaseName = "UC_07_10_CheckAndChangePublicHolidays2";
		cl.readXML();
		cl.loadTestData();
		
		if(cl.isLoginRequired.equals("YES"))
		{
			cl.loadURL("");
			cl.login2();
		}
		else
		{
			cl.createResultFolder();
		}
		
		if(cl.isMenuNavigationRequired.equals("YES"))
		{
			cl.executeTestStep("mci_administrator_menu", "mouseover");
			cl.executeTestStep("mcl_menu_manage_calendar", "click");
		}
		
		cl.executeTestStep("mcl_menu_holidays", "click");
		
		//Validate Existing Holiday Dates 
		cl.tableValidationStatic("ctl00_ContentMenu_gvEditHolidays_ctl", "_txtHolidayName", "02", "ctl00_ContentMenu_gvEditHolidays", "mcl_holiday_name", "mcl_holiday_before_two_year", "checkEqualRowValue", "ctl00_ContentMenu_gvEditHolidays_ctl", "_ccTwoYearsBefore_txtDate");
		cl.tableValidationStatic("ctl00_ContentMenu_gvEditHolidays_ctl", "_txtHolidayName", "02", "ctl00_ContentMenu_gvEditHolidays", "mcl_holiday_name", "mcl_holiday_before_one_year", "checkEqualRowValue", "ctl00_ContentMenu_gvEditHolidays_ctl", "_ccOneYearBefore_txtDate");
		cl.tableValidationStatic("ctl00_ContentMenu_gvEditHolidays_ctl", "_txtHolidayName", "02", "ctl00_ContentMenu_gvEditHolidays", "mcl_holiday_name", "mcl_holiday_current_year", "checkEqualRowValue", "ctl00_ContentMenu_gvEditHolidays_ctl", "_ccCurrentYear_txtDate");
		
		//Change the Holiday Dates 
		cl.tableValidationStatic("ctl00_ContentMenu_gvEditHolidays_ctl", "_txtHolidayName", "02", "ctl00_ContentMenu_gvEditHolidays", "mcl_holiday_name_2", "mcl_holiday_edit_before_two_year", "setValue", "ctl00_ContentMenu_gvEditHolidays_ctl", "_ccTwoYearsBefore_txtDate");
		cl.tableValidationStatic("ctl00_ContentMenu_gvEditHolidays_ctl", "_txtHolidayName", "02", "ctl00_ContentMenu_gvEditHolidays", "mcl_holiday_name_2", "mcl_holiday_edit_before_one_year", "setValue", "ctl00_ContentMenu_gvEditHolidays_ctl", "_ccOneYearBefore_txtDate");
		cl.tableValidationStatic("ctl00_ContentMenu_gvEditHolidays_ctl", "_txtHolidayName", "02", "ctl00_ContentMenu_gvEditHolidays", "mcl_holiday_name_2", "mcl_holiday_edit_current_year", "setValue", "ctl00_ContentMenu_gvEditHolidays_ctl", "_ccCurrentYear_txtDate");
		
		cl.executeTestStep("mcl_holidays_save", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Holidays successfully updated");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}
