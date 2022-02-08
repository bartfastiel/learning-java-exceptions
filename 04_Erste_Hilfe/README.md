## Erste Hilfe

Ist der "Erste Hilfe"-Kurs wichtig für den Führerschein? Ja, aber er macht Dich nicht zum guten Fahrer.

Es ist wichtig zu wissen, wie man mit Checked und Unchecked Exceptions richtig umgeht, um sich nicht zu lange damit
aufzuhalten. Aber man sollte nicht an Exceptions Spaß gewinnen und sie für Dinge nutzen, für die sie nicht gedacht
sind (zweiter Return-Type zum Beispiel).

## Was mache ich, wenn IntelliJs rote Ringellinie kommt?

### Beim Öffnen von Files

<span style="font-family: MONOSPACE">Files.<span style="text-decoration: underline wavy red;">readString</span>(Paths.get("gibtsnicht.txt"));

> Unhandled exception: java.io.IOException

Was soll passieren, wenn die Datei nicht gefunden wird?
* Hast Du einen Plan B? Super! Baue ihn in den `catch`-Block!

```
String text;
try {
   text = Files.readString(Paths.get("gibtsnicht.txt"));
} catch (IOException e) {
   text = /* Plan B - z.B. Daten von woanders her ermitteln */
}
```

* Soll das Programm komplett abbrechen? Schade. Wrappe die `IOException` in eine unchecked-Exception. Zum Beispiel `IllegalStateException`.

```
String text;
try {
   text = Files.readString(Paths.get("gibtsnicht.txt"));
} catch (IOException e) {
   throw new IllegalStateException("Ohne dieses File können wir nicht weiterarbeiten", e);
}
```


### Beim Warten in Sekunden

<span style="font-family: MONOSPACE">Thread.<span style="text-decoration: underline wavy red;">sleep</span>(1000)
;</span>

> Unhandled exception: java.lang.InterruptedException

1. ~~Die Exception per "throws" weiterreichen~~ <= Wäre eine saubere Lösung, ist aber sehr unpraktisch (unter Umständen müssen
   viele Methoden angepasst werden; beim Überschreiben von Methoden und in Lambda-Ausdrücke nicht möglich)
2. Im Catch-Block neu interrupten und dann dafür sorgen, dass der Ablauf zeitig beendet wird (z.B. durch eine neue RuntimeException)

```
try {
    Thread.sleep(10000);
} catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    throw new RuntimeException("Someone interrupted us", e);
}
```

[Hilfreich: baeldung-Dokumentation zum Thema](https://www.baeldung.com/java-interrupted-exception#how-to-handle-an-interruptedexception)

## Was mache ich bei Exceptions zu Laufzeit?

* Analysiere den Stacktrace
  * Wurden Exceptions eingepackt? ("caused by...")
  * Suche nach Zeilen, die von Dir geschrieben Source-Dateien referenzieren
* Schreibe Tests für genau diese Funktion
* Debugge und setze einen Breakpoint an dieser Zeile
* Google nach dem Fehler

```
java.lang.StackOverflowError
at Tunnelblick.run(Tunnelblick.java:3)
at Tunnelblick.run(Tunnelblick.java:3)
at Tunnelblick.run(Tunnelblick.java:3)
at Tunnelblick.run(Tunnelblick.java:3)
at Tunnelblick.run(Tunnelblick.java:3)
at Tunnelblick.run(Tunnelblick.java:3)
at Tunnelblick.run(Tunnelblick.java:3)
at Tunnelblick.run(Tunnelblick.java:3)
at Tunnelblick.run(Tunnelblick.java:3)
...
```
