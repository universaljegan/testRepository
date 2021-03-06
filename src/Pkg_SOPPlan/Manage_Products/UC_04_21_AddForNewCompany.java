package Pkg_SOPPlan.Manage_Products;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_21_AddForNewCompany {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_21_AddForNewCompany";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_21_AddForNewCompany";
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
			cl.executeTestStep("mpc_manage_products_menu", "click");
		}
		
//		cl.executeTestStep("mpc_add_product_cagegories_menu", "click");
//		
//		commonLibrary.curTableRow = "1";
//		cl.executeTestStep("mpc_add_product_category", "set");
//		cl.executeTestStep("mpc_add_category_manager", "select");
//
//		commonLibrary.curTableRow = "2";
//		cl.executeTestStep("mpc_add_product_category", "set");
//		cl.executeTestStep("mpc_add_category_manager", "select");
//		
//		commonLibrary.curTableRow = "3";
//		cl.executeTestStep("mpc_add_product_category", "set");
//		cl.executeTestStep("mpc_add_category_manager", "select");
//
//		commonLibrary.curTableRow = "4";
//		cl.executeTestStep("mpc_add_product_category", "set");
//		cl.executeTestStep("mpc_add_category_manager", "select");
//
//		commonLibrary.curTableRow = "5";
//		cl.executeTestStep("mpc_add_product_category", "set");
//		cl.executeTestStep("mpc_add_category_manager", "select");
//		
//		cl.executeTestStep("mpc_save_product_category", "click");
//		cl.clickAlert("ok");
//		Thread.sleep(2000);
//		cl.validateAlert("Product categories have been successfully added");
//		Thread.sleep(2000);		
//		cl.clickAlert("ok");
//		Thread.sleep(2000);
//		
//		commonLibrary.curTableRow = "1";
//		cl.executeTestStep("mpc_add_product_category_2", "set");
//		cl.executeTestStep("mpc_add_category_manager_2", "select");
//
//		commonLibrary.curTableRow = "2";
//		cl.executeTestStep("mpc_add_product_category_2", "set");
//		cl.executeTestStep("mpc_add_category_manager_2", "select");
//
//		cl.executeTestStep("mpc_save_product_category", "click");
//		cl.clickAlert("ok");
//		Thread.sleep(2000);
//		cl.validateAlert("Product categories have been successfully added");
//		Thread.sleep(2000);		
//		cl.clickAlert("ok");
//		Thread.sleep(2000);
		
		cl.executeTestStep("mpc_add_products_using_excel_menu", "click");
		Thread.sleep(2000);
		
		//Upload Excel File
		cl.executeTestStep("mus_browse_excel_file", "click");
		Thread.sleep(1000);
		cl.selectFile("mus_browse_csv_file");
		Thread.sleep(2000);
		cl.executeTestStep("mus_upload_excel", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
