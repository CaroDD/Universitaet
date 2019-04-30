package koenigreich;

public class Koenigreich {

	public static void main(String[] args) {

		steuerbescheid(new Koenig(), 20);
        steuerbescheid(new Adel(), 20);
        steuerbescheid(new Bauer(), 20);
        steuerbescheid(new Leibeigener(), 20);
	}

	static void steuerbescheid(Einwohner einwohner, int einkommen) {
        einwohner.setEinkommen(einkommen);
        System.out.println(einwohner.getClass().getName() +
           ": Einkommen " + einkommen +
           ", zu versteuerndes Einkommen " +
           einwohner.zuVersteuerndesEinkommen() +
           ", Steuer " + einwohner.steuer());
    }
}

KÖNIG: package Koenigreich; 
public class Koenig extends Einwohner {
 	@Override 
	public int steuer()  {return 0;}}

EINWOHNER: package Koenigreich;
-- throw new IllegalArgumentException("Einkommen darf nicht < 0 sein!");
public class Einwohner {
protected int einkommen;
public void setEinkommen(int eink) {
if (einkommen < 0) {
throw}
this.einkommen = einkommen;}

publ int zuVersteuerndesEinkommen() {
return einkommen;}

publ int steuer() {
int steuer = zuVerEink() / 10;
if (steuer > 1) {
steuer = 1;
}
return steuer;
}
}

TESTS:
package tests;
import junit.framework.*;
import koenigreich.Einwohner;

public class EinwohnerTest extends TestCase {
protected Einwohner einwohner;

//wird vor jedem Test ausgeführt
@override
public void setUp() {
einwohner = new Einwohner;
}

//wird nach jedem Test ausgeführt
@override
public void tearDown() {
}

public void testE1() {
//Einwohner einwohner = new Einwohner();
try {
einwohner.setEinkommen(-1);
fail("Einkommen muss auf negative Werte getestet werden.");
} catch (Exception e) {
	//absichtlich leer
assertEquals("Einkommen
	}
}
}

public void testE2() {
//Einwohner einwohner = new Einwohner();
einwohner.setEinkommen(0);
assertEquals(1, einwohner.steuer());
}
}

TEST Adel:
package tests;

import junit.framework.*;
import koenigreich.Adel;

public class AdelTest extends TestCase {
protected Adel adliger;

@override
public void setUp() {
	adliger = new Adel();
	}

public void testA1() {
	adliger.setEinkommen(19);
	assertEquals(20, adliger.steuer());
	}
}

TEST SUITE 
package tests;
import framework.* und junit.textui.TestRunner;

public class AlleTests() {
	main() {TestRunner.run(suite());}

private static Test suite() {
	TestSuite suite = new Test.Suite();
	suite.addTestSuite(EinwohnerTest.class);
	suite.addTestSuite(AdelTest.class);
	return suite;
	}
}


Ausführen: tests.AlleTests


Ausführen: javac -cp .../junit.jar tests/EinwohnerTest 
java -cp .:$..../junit.jar junit.swingui.TestRunner test.EinwohnerTest (Oder junit.textui.TestRunner)


zu ergänzen: Bauer/Leibeigener
//assertion = Werte vergleichen (equal)

Testfall Tabelle für Methode Steuer() (Beispiel Einwohner)
Testfall	| erwarteter Status		Klasse		| int einkommen (Parameter expected)	| Ausgabe (Parameter actual)
E1				Exception			Einwohner		-1										Einkommen darf nicht <0 sein!
E2				Okay				Einwohner		0										1
E3				Okay				Einwohner		14										1
E4				Okay				Einwohner		20										2
E5				Okay				Einwohner		29										2

Testfall	| erwarteter Status		Klasse		| int einkommen (Parameter expected)	| Ausgabe (Parameter actual)
A1				Exception			Adel			-1										Einkommen darf nicht <0 sein!
A2				Okay				Adel			0										20
A3				Okay				Adel			19										20
A4				Okay				Adel			405										40

