
import resources.NewTestHelper;
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
public class NewTest extends NewTestHelper
{
	/**
	 * Script Name   : <b>NewTest</b>
	 * Generated     : <b>02-Jun-2020 11:51:16 am</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 18363 ()
	 * 
	 * @since  2020/06/02
	 * @author sanjeet.kumar
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		startApp("Google");
		
		// HTML Browser
		// Document: Google: https://www.google.com/
		text_search().click(atPoint(186,33));
		browser_htmlBrowser(document_google(),DEFAULT_FLAGS).inputKeys("Rational Functional Tester{ENTER}");
		// Document: Rational Functional Tester - Google Search: https://www.google.com/search?sxsrf=ALeKk008j9HUWPMezskSTZmZfRLb7J2YQQ%3A1591078940226&source=hp&ei=HPDVXvTTC_zDz7sPxamVuAQ&q=Rational+Functional+Tester&oq=Rational+Functional+Tester&gs_lcp=CgZwc3ktYWIQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADIGCAAQFhAeOgcIIxDqAhAnOgUIABCDAToECCMQJzoECAAQClDoZVj6iAFg8JABaAFwAHgAgAGTAogB3B6SAQYwLjI1LjGYAQCgAQGqAQdnd3Mtd2l6sAEK&sclient=psy-ab&ved=0ahUKEwj00aj4vuLpAhX84XMBHcVUBUcQ4dUDCAc&uact=5
		link_vn1s0p1c0().click();
		browser_htmlBrowser(document_softwareTestingIndiaI(),DEFAULT_FLAGS).close();
		
	}
}

