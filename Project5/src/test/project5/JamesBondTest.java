package test.project5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import project5.JamesBond;

public class JamesBondTest {
	JamesBond bond;

	@Before
	public void setUp() throws Exception {
		bond = new JamesBond();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCase1(){assertFalse(bond.bondRegex("(()"));}
	@Test
	public void testCase2(){assertTrue(bond.bondRegex("((007)"));}
	@Test
	public void testCase3(){assertFalse(bond.bondRegex("((07)"));}
	@Test
	public void testCase4(){assertFalse(bond.bondRegex("((7)"));}
	@Test
	public void testCase5(){assertFalse(bond.bondRegex("()"));}
	@Test
	public void testCase6(){assertFalse(bond.bondRegex("())"));}
	@Test
	public void testCase7(){assertTrue(bond.bondRegex("()007)"));}
	@Test
	public void testCase8(){assertFalse(bond.bondRegex("()07)"));}
	@Test
	public void testCase9(){assertFalse(bond.bondRegex("()7)"));}
	@Test
	public void testCase10(){assertFalse(bond.bondRegex("(0()"));}
	@Test
	public void testCase11(){assertTrue(bond.bondRegex("(0(007)"));}
	@Test
	public void testCase12(){assertFalse(bond.bondRegex("(0(07)"));}
	@Test
	public void testCase13(){assertFalse(bond.bondRegex("(0(7)"));}
	@Test
	public void testCase14(){assertFalse(bond.bondRegex("(0)"));}
	@Test
	public void testCase15(){assertFalse(bond.bondRegex("(0))"));}
	@Test
	public void testCase16(){assertTrue(bond.bondRegex("(0)007)"));}
	@Test
	public void testCase17(){assertFalse(bond.bondRegex("(0)07)"));}
	@Test
	public void testCase18(){assertFalse(bond.bondRegex("(0)7)"));}
	@Test
	public void testCase19(){assertFalse(bond.bondRegex("(00()"));}
	@Test
	public void testCase20(){assertTrue(bond.bondRegex("(00(007)"));}
	@Test
	public void testCase21(){assertFalse(bond.bondRegex("(00(07)"));}
	@Test
	public void testCase22(){assertFalse(bond.bondRegex("(00(7)"));}
	@Test
	public void testCase23(){assertFalse(bond.bondRegex("(00)"));}
	@Test
	public void testCase24(){assertFalse(bond.bondRegex("(00))"));}
	@Test
	public void testCase25(){assertTrue(bond.bondRegex("(00)007)"));}
	@Test
	public void testCase26(){assertFalse(bond.bondRegex("(00)07)"));}
	@Test
	public void testCase27(){assertFalse(bond.bondRegex("(00)7)"));}
	@Test
	public void testCase28(){assertFalse(bond.bondRegex("(000)"));}
	@Test
	public void testCase29(){assertTrue(bond.bondRegex("(000007)"));}
	@Test
	public void testCase30(){assertTrue(bond.bondRegex("(00007)"));}
	@Test
	public void testCase31(){assertTrue(bond.bondRegex("(0007)"));}
	@Test
	public void testCase32(){assertFalse(bond.bondRegex("(001)"));}
	@Test
	public void testCase33(){assertTrue(bond.bondRegex("(001007)"));}
	@Test
	public void testCase34(){assertFalse(bond.bondRegex("(00107)"));}
	@Test
	public void testCase35(){assertFalse(bond.bondRegex("(0017)"));}
	@Test
	public void testCase36(){assertFalse(bond.bondRegex("(002)"));}
	@Test
	public void testCase37(){assertTrue(bond.bondRegex("(002007)"));}
	@Test
	public void testCase38(){assertFalse(bond.bondRegex("(00207)"));}
	@Test
	public void testCase39(){assertFalse(bond.bondRegex("(0027)"));}
	@Test
	public void testCase40(){assertFalse(bond.bondRegex("(003)"));}
	@Test
	public void testCase41(){assertTrue(bond.bondRegex("(003007)"));}
	@Test
	public void testCase42(){assertFalse(bond.bondRegex("(00307)"));}
	@Test
	public void testCase43(){assertFalse(bond.bondRegex("(0037)"));}
	@Test
	public void testCase44(){assertFalse(bond.bondRegex("(004)"));}
	@Test
	public void testCase45(){assertTrue(bond.bondRegex("(004007)"));}
	@Test
	public void testCase46(){assertFalse(bond.bondRegex("(00407)"));}
	@Test
	public void testCase47(){assertFalse(bond.bondRegex("(0047)"));}
	@Test
	public void testCase48(){assertFalse(bond.bondRegex("(005)"));}
	@Test
	public void testCase49(){assertTrue(bond.bondRegex("(005007)"));}
	@Test
	public void testCase50(){assertFalse(bond.bondRegex("(00507)"));}
	@Test
	public void testCase51(){assertFalse(bond.bondRegex("(0057)"));}
	@Test
	public void testCase52(){assertFalse(bond.bondRegex("(006)"));}
	@Test
	public void testCase53(){assertTrue(bond.bondRegex("(006007)"));}
	@Test
	public void testCase54(){assertFalse(bond.bondRegex("(00607)"));}
	@Test
	public void testCase55(){assertFalse(bond.bondRegex("(0067)"));}
	@Test
	public void testCase56(){assertTrue(bond.bondRegex("(007()"));}
	@Test
	public void testCase57(){assertTrue(bond.bondRegex("(007(007)"));}
	@Test
	public void testCase58(){assertTrue(bond.bondRegex("(007(07)"));}
	@Test
	public void testCase59(){assertTrue(bond.bondRegex("(007(7)"));}
	@Test
	public void testCase60(){assertTrue(bond.bondRegex("(007)"));}
	@Test
	public void testCase61(){assertTrue(bond.bondRegex("(007))"));}
	@Test
	public void testCase62(){assertTrue(bond.bondRegex("(007)007)"));}
	@Test
	public void testCase63(){assertTrue(bond.bondRegex("(007)07)"));}
	@Test
	public void testCase64(){assertTrue(bond.bondRegex("(007)7)"));}
	@Test
	public void testCase65(){assertTrue(bond.bondRegex("(0070)"));}
	@Test
	public void testCase66(){assertTrue(bond.bondRegex("(0070007)"));}
	@Test
	public void testCase67(){assertTrue(bond.bondRegex("(007007)"));}
	@Test
	public void testCase68(){assertTrue(bond.bondRegex("(00707)"));}
	@Test
	public void testCase69(){assertTrue(bond.bondRegex("(0071)"));}
	@Test
	public void testCase70(){assertTrue(bond.bondRegex("(0071007)"));}
	@Test
	public void testCase71(){assertTrue(bond.bondRegex("(007107)"));}
	@Test
	public void testCase72(){assertTrue(bond.bondRegex("(00717)"));}
	@Test
	public void testCase73(){assertTrue(bond.bondRegex("(0072)"));}
	@Test
	public void testCase74(){assertTrue(bond.bondRegex("(0072007)"));}
	@Test
	public void testCase75(){assertTrue(bond.bondRegex("(007207)"));}
	@Test
	public void testCase76(){assertTrue(bond.bondRegex("(00727)"));}
	@Test
	public void testCase77(){assertTrue(bond.bondRegex("(0073)"));}
	@Test
	public void testCase78(){assertTrue(bond.bondRegex("(0073007)"));}
	@Test
	public void testCase79(){assertTrue(bond.bondRegex("(007307)"));}
	@Test
	public void testCase80(){assertTrue(bond.bondRegex("(00737)"));}
	@Test
	public void testCase81(){assertTrue(bond.bondRegex("(0074)"));}
	@Test
	public void testCase82(){assertTrue(bond.bondRegex("(0074007)"));}
	@Test
	public void testCase83(){assertTrue(bond.bondRegex("(007407)"));}
	@Test
	public void testCase84(){assertTrue(bond.bondRegex("(00747)"));}
	@Test
	public void testCase85(){assertTrue(bond.bondRegex("(0075)"));}
	@Test
	public void testCase86(){assertTrue(bond.bondRegex("(0075007)"));}
	@Test
	public void testCase87(){assertTrue(bond.bondRegex("(007507)"));}
	@Test
	public void testCase88(){assertTrue(bond.bondRegex("(00757)"));}
	@Test
	public void testCase89(){assertTrue(bond.bondRegex("(0076)"));}
	@Test
	public void testCase90(){assertTrue(bond.bondRegex("(0076007)"));}
	@Test
	public void testCase91(){assertTrue(bond.bondRegex("(007607)"));}
	@Test
	public void testCase92(){assertTrue(bond.bondRegex("(00767)"));}
	@Test
	public void testCase93(){assertTrue(bond.bondRegex("(0077)"));}
	@Test
	public void testCase94(){assertTrue(bond.bondRegex("(0077007)"));}
	@Test
	public void testCase95(){assertTrue(bond.bondRegex("(007707)"));}
	@Test
	public void testCase96(){assertTrue(bond.bondRegex("(00777)"));}
	@Test
	public void testCase97(){assertTrue(bond.bondRegex("(0078)"));}
	@Test
	public void testCase98(){assertTrue(bond.bondRegex("(0078007)"));}
	@Test
	public void testCase99(){assertTrue(bond.bondRegex("(007807)"));}
	@Test
	public void testCase100(){assertTrue(bond.bondRegex("(00787)"));}
	@Test
	public void testCase101(){assertTrue(bond.bondRegex("(0079)"));}
	@Test
	public void testCase102(){assertTrue(bond.bondRegex("(0079007)"));}
	@Test
	public void testCase103(){assertTrue(bond.bondRegex("(007907)"));}
	@Test
	public void testCase104(){assertTrue(bond.bondRegex("(00797)"));}
	@Test
	public void testCase105(){assertFalse(bond.bondRegex("(008)"));}
	@Test
	public void testCase106(){assertTrue(bond.bondRegex("(008007)"));}
	@Test
	public void testCase107(){assertFalse(bond.bondRegex("(00807)"));}
	@Test
	public void testCase108(){assertFalse(bond.bondRegex("(0087)"));}
	@Test
	public void testCase109(){assertFalse(bond.bondRegex("(009)"));}
	@Test
	public void testCase110(){assertTrue(bond.bondRegex("(009007)"));}
	@Test
	public void testCase111(){assertFalse(bond.bondRegex("(00907)"));}
	@Test
	public void testCase112(){assertFalse(bond.bondRegex("(0097)"));}
	@Test
	public void testCase113(){assertFalse(bond.bondRegex("(01)"));}
	@Test
	public void testCase114(){assertTrue(bond.bondRegex("(01007)"));}
	@Test
	public void testCase115(){assertFalse(bond.bondRegex("(0107)"));}
	@Test
	public void testCase116(){assertFalse(bond.bondRegex("(017)"));}
	@Test
	public void testCase117(){assertFalse(bond.bondRegex("(02)"));}
	@Test
	public void testCase118(){assertTrue(bond.bondRegex("(02007)"));}
	@Test
	public void testCase119(){assertFalse(bond.bondRegex("(0207)"));}
	@Test
	public void testCase120(){assertFalse(bond.bondRegex("(027)"));}
	@Test
	public void testCase121(){assertFalse(bond.bondRegex("(03)"));}
	@Test
	public void testCase122(){assertTrue(bond.bondRegex("(03007)"));}
	@Test
	public void testCase123(){assertFalse(bond.bondRegex("(0307)"));}
	@Test
	public void testCase124(){assertFalse(bond.bondRegex("(037)"));}
	@Test
	public void testCase125(){assertFalse(bond.bondRegex("(04)"));}
	@Test
	public void testCase126(){assertTrue(bond.bondRegex("(04007)"));}
	@Test
	public void testCase127(){assertFalse(bond.bondRegex("(0407)"));}
	@Test
	public void testCase128(){assertFalse(bond.bondRegex("(047)"));}
	@Test
	public void testCase129(){assertFalse(bond.bondRegex("(05)"));}
	@Test
	public void testCase130(){assertTrue(bond.bondRegex("(05007)"));}
	@Test
	public void testCase131(){assertFalse(bond.bondRegex("(0507)"));}
	@Test
	public void testCase132(){assertFalse(bond.bondRegex("(057)"));}
	@Test
	public void testCase133(){assertFalse(bond.bondRegex("(06)"));}
	@Test
	public void testCase134(){assertTrue(bond.bondRegex("(06007)"));}
	@Test
	public void testCase135(){assertFalse(bond.bondRegex("(0607)"));}
	@Test
	public void testCase136(){assertFalse(bond.bondRegex("(067)"));}
	@Test
	public void testCase137(){assertFalse(bond.bondRegex("(07)"));}
	@Test
	public void testCase138(){assertTrue(bond.bondRegex("(07007)"));}
	@Test
	public void testCase139(){assertFalse(bond.bondRegex("(0707)"));}
	@Test
	public void testCase140(){assertFalse(bond.bondRegex("(077)"));}
	@Test
	public void testCase141(){assertFalse(bond.bondRegex("(08)"));}
	@Test
	public void testCase142(){assertTrue(bond.bondRegex("(08007)"));}
	@Test
	public void testCase143(){assertFalse(bond.bondRegex("(0807)"));}
	@Test
	public void testCase144(){assertFalse(bond.bondRegex("(087)"));}
	@Test
	public void testCase145(){assertFalse(bond.bondRegex("(09)"));}
	@Test
	public void testCase146(){assertTrue(bond.bondRegex("(09007)"));}
	@Test
	public void testCase147(){assertFalse(bond.bondRegex("(0907)"));}
	@Test
	public void testCase148(){assertFalse(bond.bondRegex("(097)"));}
	@Test
	public void testCase149(){assertFalse(bond.bondRegex("(1)"));}
	@Test
	public void testCase150(){assertTrue(bond.bondRegex("(1007)"));}
	@Test
	public void testCase151(){assertFalse(bond.bondRegex("(107)"));}
	@Test
	public void testCase152(){assertFalse(bond.bondRegex("(17)"));}
	@Test
	public void testCase153(){assertFalse(bond.bondRegex("(2)"));}
	@Test
	public void testCase154(){assertTrue(bond.bondRegex("(2007)"));}
	@Test
	public void testCase155(){assertFalse(bond.bondRegex("(207)"));}
	@Test
	public void testCase156(){assertFalse(bond.bondRegex("(27)"));}
	@Test
	public void testCase157(){assertFalse(bond.bondRegex("(3)"));}
	@Test
	public void testCase158(){assertTrue(bond.bondRegex("(3007)"));}
	@Test
	public void testCase159(){assertFalse(bond.bondRegex("(307)"));}
	@Test
	public void testCase160(){assertFalse(bond.bondRegex("(37)"));}
	@Test
	public void testCase161(){assertFalse(bond.bondRegex("(4)"));}
	@Test
	public void testCase162(){assertTrue(bond.bondRegex("(4007)"));}
	@Test
	public void testCase163(){assertFalse(bond.bondRegex("(407)"));}
	@Test
	public void testCase164(){assertFalse(bond.bondRegex("(47)"));}
	@Test
	public void testCase165(){assertFalse(bond.bondRegex("(5)"));}
	@Test
	public void testCase166(){assertTrue(bond.bondRegex("(5007)"));}
	@Test
	public void testCase167(){assertFalse(bond.bondRegex("(507)"));}
	@Test
	public void testCase168(){assertFalse(bond.bondRegex("(57)"));}
	@Test
	public void testCase169(){assertFalse(bond.bondRegex("(6)"));}
	@Test
	public void testCase170(){assertTrue(bond.bondRegex("(6007)"));}
	@Test
	public void testCase171(){assertFalse(bond.bondRegex("(607)"));}
	@Test
	public void testCase172(){assertFalse(bond.bondRegex("(67)"));}
	@Test
	public void testCase173(){assertFalse(bond.bondRegex("(7)"));}
	@Test
	public void testCase174(){assertTrue(bond.bondRegex("(7007)"));}
	@Test
	public void testCase175(){assertFalse(bond.bondRegex("(707)"));}
	@Test
	public void testCase176(){assertFalse(bond.bondRegex("(77)"));}
	@Test
	public void testCase177(){assertFalse(bond.bondRegex("(8)"));}
	@Test
	public void testCase178(){assertTrue(bond.bondRegex("(8007)"));}
	@Test
	public void testCase179(){assertFalse(bond.bondRegex("(807)"));}
	@Test
	public void testCase180(){assertFalse(bond.bondRegex("(87)"));}
	@Test
	public void testCase181(){assertFalse(bond.bondRegex("(9)"));}
	@Test
	public void testCase182(){assertTrue(bond.bondRegex("(9007)"));}
	@Test
	public void testCase183(){assertFalse(bond.bondRegex("(907)"));}
	@Test
	public void testCase184(){assertFalse(bond.bondRegex("(97)"));}
	@Test
	public void testCase185(){assertFalse(bond.bondRegex(")"));}
	@Test
	public void testCase186(){assertFalse(bond.bondRegex("))"));}
	@Test
	public void testCase187(){assertFalse(bond.bondRegex(")007)"));}
	@Test
	public void testCase188(){assertFalse(bond.bondRegex(")07)"));}
	@Test
	public void testCase189(){assertFalse(bond.bondRegex(")7)"));}
	@Test
	public void testCase190(){assertFalse(bond.bondRegex("0)"));}
	@Test
	public void testCase191(){assertFalse(bond.bondRegex("0007)"));}
	@Test
	public void testCase192(){assertFalse(bond.bondRegex("007)"));}
	@Test
	public void testCase193(){assertFalse(bond.bondRegex("07)"));}
	@Test
	public void testCase194(){assertFalse(bond.bondRegex("1)"));}
	@Test
	public void testCase195(){assertFalse(bond.bondRegex("1007)"));}
	@Test
	public void testCase196(){assertFalse(bond.bondRegex("107)"));}
	@Test
	public void testCase197(){assertFalse(bond.bondRegex("17)"));}
	@Test
	public void testCase198(){assertFalse(bond.bondRegex("2)"));}
	@Test
	public void testCase199(){assertFalse(bond.bondRegex("2007)"));}
	@Test
	public void testCase200(){assertFalse(bond.bondRegex("207)"));}
	@Test
	public void testCase201(){assertFalse(bond.bondRegex("27)"));}
	@Test
	public void testCase202(){assertFalse(bond.bondRegex("3)"));}
	@Test
	public void testCase203(){assertFalse(bond.bondRegex("3007)"));}
	@Test
	public void testCase204(){assertFalse(bond.bondRegex("307)"));}
	@Test
	public void testCase205(){assertFalse(bond.bondRegex("37)"));}
	@Test
	public void testCase206(){assertFalse(bond.bondRegex("4)"));}
	@Test
	public void testCase207(){assertFalse(bond.bondRegex("4007)"));}
	@Test
	public void testCase208(){assertFalse(bond.bondRegex("407)"));}
	@Test
	public void testCase209(){assertFalse(bond.bondRegex("47)"));}
	@Test
	public void testCase210(){assertFalse(bond.bondRegex("5)"));}
	@Test
	public void testCase211(){assertFalse(bond.bondRegex("5007)"));}
	@Test
	public void testCase212(){assertFalse(bond.bondRegex("507)"));}
	@Test
	public void testCase213(){assertFalse(bond.bondRegex("57)"));}
	@Test
	public void testCase214(){assertFalse(bond.bondRegex("6)"));}
	@Test
	public void testCase215(){assertFalse(bond.bondRegex("6007)"));}
	@Test
	public void testCase216(){assertFalse(bond.bondRegex("607)"));}
	@Test
	public void testCase217(){assertFalse(bond.bondRegex("67)"));}
	@Test
	public void testCase218(){assertFalse(bond.bondRegex("7)"));}
	@Test
	public void testCase219(){assertFalse(bond.bondRegex("7007)"));}
	@Test
	public void testCase220(){assertFalse(bond.bondRegex("707)"));}
	@Test
	public void testCase221(){assertFalse(bond.bondRegex("77)"));}
	@Test
	public void testCase222(){assertFalse(bond.bondRegex("8)"));}
	@Test
	public void testCase223(){assertFalse(bond.bondRegex("8007)"));}
	@Test
	public void testCase224(){assertFalse(bond.bondRegex("807)"));}
	@Test
	public void testCase225(){assertFalse(bond.bondRegex("87)"));}
	@Test
	public void testCase226(){assertFalse(bond.bondRegex("9)"));}
	@Test
	public void testCase227(){assertFalse(bond.bondRegex("9007)"));}
	@Test
	public void testCase228(){assertFalse(bond.bondRegex("907)"));}
	@Test
	public void testCase229(){assertFalse(bond.bondRegex("97)"));}


}
