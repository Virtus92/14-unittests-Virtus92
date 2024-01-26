# Problemstellung

In der Softwareentwicklung geht es nicht immer darum, etwas Neues zu schreiben. Sehr oft muss man bestehende Methoden ändern, um sich an neue Anforderungen anzupassen oder einen Bug zu fixen, allerdings muss die Rückwärtskompatibilität gegeben sein. Wie stelle ich sicher, dass die Rückwärtskompatibilität trotz der Änderungen immer sichergestellt ist?

In einer Firma entwickelt man nicht alleine und man arbeitet in der Regel an größeren Programmen, sodass nicht jeder Entwickler einen Überblick über alle Anforderungen hat, die den Code erfüllen soll.

Du wirst sagen, ich kann es manuell testen? Ja, stimmt, allerdings ist das je größer das Programm immer aufwändiger und kennt nicht jeder Entwickler alle Anwendungsfälle. 

Weiters geht es in der Welt der Softwareentwicklung immer mehr in Richtung Automatisierung und Beschleunigung. Die Begriffe DevOps bzw. DevSecOps sollte ein jeder Softwareentwickler bereits kennen. Automatisierung in der Softwareentwicklung bedeutet in erster Linie, dass nach Fertigstellung der Software (Pull Request), diese möglichst vollautomatisiert kompiliert, getestet und deployt wird. Hier sind manuelle Tests erstens langsam, zweitens kostenintensiv (Mitarbeiter kosten wesentlich mehr als ein Server).

Mittlerweile sind Unittests so wichtig geworden, dass man sogar mit den Unittests anfängt zu entwickeln, bevor man die eigentlichen Methoden des Programms implementiert. Warum man das tut? Wenn die Tests alle zuerst entwickelt sind, kann man laufend vollautomatisiert überprüfen, wie die eigene Entwicklung vorankommt. Nach jedem Entwicklungsschritt kannst du schauen, welche Tests erfolgreich durchlaufen und welche noch fehlschlagen. Das gibt dir einen Hinweis darüber, wo in deiner Entwicklung noch etwas fehlt. Am Anfang laufen alle Tests auf Fehler und je weiter du in deiner Entwicklung bist, desto mehr Tests laufen erfolgreich durch. Du fragst dich sicherlich, wie das geht. Das erklären wir später in diesem Kapitel. Diese Art der Entwicklung nennt man **Test driven development**.

Für alle diese Anwendungsfälle sind Unittests geschaffen. Sie sorgen dafür, dass:
- die Rückwärtskompatibilität gegeben ist
- ALLE Anwendungsfälle bei jedem Durchlauf geprüft werden, die das Programm abdecken soll
- sie helfen während der Entwicklung, den Fortschritt zu tracken

Zurück zur [Startseite](README.md)