
import resources.CJRecordHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author sanjeet.kumar
 */
public class CJRecord extends CJRecordHelper
{
	/**
	 * Script Name   : <b>CJRecord</b>
	 * Generated     : <b>02-Jun-2020 10:44:05 am</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 18363 ()
	 * 
	 * @since  2020/06/02
	 * @author sanjeet.kumar
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		placeOrder().click();
		
		// Frame: Member Logon
		existingCustomer().click();
		password().click(atPoint(65,12));
		memberLogon().inputChars("1234");
		ok().click();
		
		// Frame: Place an Order
		item().setText("New Item");;
		quantity().setText("2");
		cardNumberIncludeTheSpaces().setText("7894561230");;
		//placeAnOrder().inputKeys("7894561230");
		expirationDate().setText("2023");
		//placeAnOrder().inputKeys("{Num2}{Num0}{Num2}{Num3}");
		relatedItems().click();
		
		// 
		addToOrder().click();
		
		// Frame: Place an Order
		placeOrder2().click();
		
		// 
		ok2().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
		
		
	}
}

