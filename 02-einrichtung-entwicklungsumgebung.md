# Einrichtung der Entwicklungsumgebung

Um Unittest schreiben zu können müssen zuerst die richtigen Libraries eingebunden werden.

## Java

### Dependencies registrieren

In MAVEN-Projekten werden die Abhängigkeiten in ein sogenanntes **pom.xml**-File zusammengestellt. Diese Datei ist Root-Ordner des Projekts zu finden.

![Projektstruktur mit POM-File](img/projektstruktur.png)

> [!IMPORTANT]
> Bei jeder Änderung im **pom.xml**-File müssen die Dependencies neu geladen werden. Das erkennt man in IntelliJ daran, dass die neu eingetragenen Dependencies in roter Schrift dargestellt werden. 
> Im IntelliJ-Fenster des **pom.xml**-Files oben rechts erscheint folgendes Icon: ![Maven-Dependencies aktualisieren](img/maven-dependencies-aktualisieren.png)

Diese Datei muss man editieren und folgende Dependency im Block <dependencies> hinzufügen:


```xml
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.9.2</version>
            <scope>test</scope>
        </dependency>
```

Ein einfaches **pom.xml**-File für Unittests würde in folgendem Beispiel aussehen:

![POM-File-Beispiel](img/pom-file.png)

> [!IMPORTANT]
> Die Versionsnummern sind natürlich entsprechend der benötigten Version anzupassen

## C#

