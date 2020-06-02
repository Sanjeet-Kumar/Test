
import resources.CJRecordBHelper;
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
public class CJRecordB extends CJRecordBHelper
{
	/**
	 * Script Name   : <b>CJRecordB</b>
	 * Generated     : <b>02-Jun-2020 10:51:05 am</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 18363 ()
	 * 
	 * @since  2020/06/02
	 * @author sanjeet.kumar
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		startApp("ClassicsJavaB");
		
		// Frame: ClassicsCD
		placeOrder().click();
		
		// Frame: Member Logon
		password().click(atPoint(102,18));
		memberLogon().inputKeys("{Num7}{Num8}{Num9}{Num4}");
		ok().click();
		
		// Frame: Place an Order
		cardNumberIncludeTheSpaces().click(atPoint(30,13));
		placeAnOrder().inputKeys("{Num7}{Num8}{Num9}{Num7}{Num4}{Num5}{Num6}{Num4}{Num1}{Num2}");
		placeAnOrder().inputKeys("{Num3}{Num1}{Num1}{Num2}{Num3}{Num1}");
		expirationDate().click(atPoint(24,12));
		placeAnOrder().inputKeys("{Num1}{Num1}{Num/}{Num2}{Num5}");
		placeOrder2().click();
		
		// 
		ok2().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
		
		
		
        
	}
}

