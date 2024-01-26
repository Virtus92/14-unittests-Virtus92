# Unittests - Anwendungsfälle

## Wieviele Unittests soll ich je Klasse schreiben?

Es gilt grundsätzlich: soviele wie notwendig!

Zur besseren Leserlichkeit der Unittests wäre die Empfehlung:

> in einem Test wird nur ein Anwendungsfall getestet

## Wie finde ich heraus, für welche Anwendungsfälle ich Unittests schreiben soll?

Unter Anwendungsfall versteht man Fälle, die denselben Code durchlaufen:
- **Normalfall**: bei unserem Beispiel werden mehrere Werte getestet, die sich im gewünschten Wertebereich befinden.
- **Grenzfall/Spezialfall**: Je Grenzfall ein Test, da hierfür eine besondere Behandlung erfolgt
- **Fehlerfall**: Je Exception, die ausgeworfen werden kann, ein Test. Bei verschiedenen Anwendungsfälle, welche dieselbe Exception auswerfen, unbedingt jeweils 1 Test.

Zurück zur [Startseite](README.md)