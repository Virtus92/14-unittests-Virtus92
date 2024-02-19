# Problemstellung

In der Softwareentwicklung geht es nicht immer darum, etwas Neues zu schreiben. Sehr oft muss man bestehende Methoden ändern, um sich an neuen Anforderungen anzupassen oder, um einen Bug zu fixen, allerdings muss die Rückwärtskompatibilität gegeben sein. Wie stelle ich sicher, dass die Rückwärtskompatibilität trotz der Änderungen immer sichergestellt ist?

In einer Firma entwickelt man nicht alleine und man arbeitet in der Regel an größeren Programmen, sodass nicht jeder Entwickler einen Überblick über alle Anforderungen hat, die den Code erfüllen soll.

Du wirst sagen, ich kann den Code manuell testen? Ja, stimmt, allerdings ist das, je größer das Programm ist, immer aufwändiger. Weiters kennt nicht jeder Entwickler alle Anwendungsfälle. 

Außerdem geht es in der Softwareentwicklung immer mehr in Richtung Automatisierung und Beschleunigung. Die Begriffe DevOps bzw. DevSecOps sollte ein jeder Softwareentwickler bereits kennen. Automatisierung in der Softwareentwicklung bedeutet in erster Linie, dass nach Umsetzung einer Anforderung (Pull Request), die Software möglichst automatisiert kompiliert, getestet und deployt wird. Hier sind manuelle Tests erstens sehr langsam, zweitens sehr kostenintensiv (Mitarbeiter kosten wesentlich mehr als ein Server).

Mittlerweile sind Unittests so wichtig geworden, dass man sogar mit den Unittests anfängt zu entwickeln, bevor man die eigentlichen Methoden des Programms implementiert. 

Warum man das tut? Wenn die Tests alle zuerst entwickelt sind, kann man laufend vollautomatisiert überprüfen, wie die eigene Entwicklung vorankommt. Nach jedem Entwicklungsschritt kann man schauen, welche Tests erfolgreich durchlaufen und welche noch fehlschlagen. Das gibt einen Hinweis darüber, wo in der Entwicklung noch etwas fehlt. Am Anfang laufen alle Tests auf Fehler und je weiter man in der Entwicklung ist, desto mehr Tests laufen erfolgreich durch. Diese Art der Entwicklung nennt man **Test driven development**.

Für all diese Anwendungsfälle sind Unittests geschaffen. Sie sorgen dafür, dass:
- die Rückwärtskompatibilität gegeben ist
- ALLE Anwendungsfälle bei jedem Durchlauf geprüft werden, die das Programm abdecken soll
- sie helfen während der Entwicklung, den Fortschritt zu tracken
- sie reduzieren die Durchlaufzeit der Tests massiv

Zurück zur [Startseite](README.md)