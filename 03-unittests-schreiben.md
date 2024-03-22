# Unittests - wie schreibt man diese?

Was macht aus einer Methode einen UnitTest?

Die Unittest-Klasse gehört zum Package/Namespace der zu testenden Klasse. Ab hier unterscheiden sich die Programmiersprachen:

## Java

Bisher haben wir unsere Klassen unter `src/main` implementiert. Dort befinden sich die Programmklassen. Unittest-Klassen hingegen befinden sich immer unter `src/test`.

Zuerst werden folgende Klassen importiert:
- `import org.junit.jupiter.api.Test;` Diese Klasse braucht man, um Methoden mit der Annotation `@Test` versehen zu können und damit die Methode als UnitTest zu definieren
- `import static org.junit.jupiter.api.Assertions.assertEquals;`
- `import static org.junit.jupiter.api.Assertions.assertThrows;`

In einem UnitTest wird geprüft, ob die aufgerufene Methode das gewünschte Ergebnis für die mitgegebenen Parameter liefert:
- `assertEquals` prüft, ob der Rückgabewert dem entspricht, was erwartet wird. 
- `assertThrows` prüft, ob die gewünschte Exception ausgeworfen wird.
- Weitere Assert-Methoden findet ihr in der [JUnit-Dokumentation](https://junit.org/junit5/docs/5.9.1/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html)

Meist ist auch z.B. folgende Klasse sinnvoll:
- `import org.junit.jupiter.api.BeforeEach`
Mit der Annotation `@BeforeEach` definiert man, dass die betroffene Methode vor jedem Test ausgeführt wird.
- `import org.junit.jupiter.api.BeforeAll`
Mit der Annotation `@BeforeAll` definiert man, dass die betroffene Methode vor dem ersten Test des Testdurchlaufs ausgeführt wird.
- `import org.junit.jupiter.api.AfterEach`
Mit der Annotation `@AfterEach` definiert man, dass die betroffene Methode nach jedem Test ausgeführt wird.
- `import org.junit.jupiter.api.AfterAll`
Mit der Annotation `@AfterAll` definiert man, dass die betroffene Methode nach dem letzten Test des Testdurchlaufs ausgeführt wird.

[Nähere Informationen zu JUnit](https://junit.org/junit5/docs/current/user-guide/)

Hier ein Beispiel zur Veranschaulichung:

```java
// Java 
package com.cb.square;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SquareTest {
    private Square square;

    @BeforeEach //This Method will be executed before each other test method
    void setUp(){
        square = new Square();
    }

    @Test //Tests for squared Values
    void calculateTest(){
        //expected Value is 4 when we calculate 2*2
        assertEquals(4, square.calculate(2));
        //expected Value is 9 when we calculate 3*3
        assertEquals(9, square.calculate(3));
        //expected Value is 1 when we calculate 1*1
        assertEquals(1, square.calculate(1));
    }

    @Test //Test for an IllegalArgument
    void calculateTestException(){
        //When we call the Method with -1, we expect that an IllegalArgumentException is thrown
        assertThrows(IllegalArgumentException.class, () -> square.calculate(-1));
    }
}
```


## C#

In .Net gibt es mehrere Möglichkeiten Unit-Tests zu schreiben. Hier eine Möglichkeit mit einem Pendant zu JUnit: NUnit.

```csharp
// C# 
using NUnit.Framework;

namespace com.cb.square
{
    [TestFixture]
    public class SquareTest
    {
        private Square square;

        [SetUp] // This Method will be executed before each other test method
        public void SetUp()
        {
            square = new Square();
        }

        [Test] // Tests for squared Values
        public void CalculateTest()
        {
            // expected Value is 4 when we calculate 2*2
            Assert.AreEqual(4, square.Calculate(2));
            // expected Value is 9 when we calculate 3*3
            Assert.AreEqual(9, square.Calculate(3));
            // expected Value is 1 when we calculate 1*1
            Assert.AreEqual(1, square.Calculate(1));
        }

        [Test] // Test for an ArgumentException
        public void CalculateTestException()
        {
            // When we call the Method with -1, we expect that an ArgumentException is thrown
            Assert.Throws<ArgumentException>(() => square.Calculate(-1));
        }
    }
}
```

## Was gehört in ein Unittest hinein? Und wie sollen diese benannt werden?

Grundsätzlich benennt man die Testmethode nach der zu testenden Methode. Also nach dem Schema:
`methodennameTestAnwendungsfall`
Wobei `methodenname` ein Platzhalter für den Methodennamen ist und `Anwendungsfall` ein Platzhalter für den spezifischen Fall ist, den man testet. 

In vielen Fällen reicht ein `assertEquals`, um den Test durchzuführen. Oft muss man aber dennoch ein Paar Testspezifische Vorbereitungen vornehmen:
- Daten in die Objekte speichern
- Vorberechnungen durchführen

Wichtig ist, das Ziel nicht aus den Augen zu verlieren: 
> [!IMPORTANT]
> ***Man möchte genau die eine und nur die eine Methode testen!***

Der Test erfolgt dann durch den `assert[...]`-Befehl.

Zurück zur [Startseite](README.md)