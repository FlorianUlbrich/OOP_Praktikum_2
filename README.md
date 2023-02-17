### Modul Praktikum Objektorientierte Programmierung ###

## Aufgabe 2.1: Mendel's Land
<br>

Beschreibung

In Mendel's Land gibt es eine fantastische Vielfalt von Schmetterlingen. Man sieht welche mit roten, schwarz sepunkteten Flügeln und gekrümmten Fühlern, andere sind schwarz gelb gestreift und haben gerade Fühler, usw.

Bei längerer Beobachtung können wir drei Typen von Merkmalen unterscheiden:

    Musterung: kein Muster, schwarze Punkte, schwarze Streifen
    Flügelfarbe: rot, gelb, grün, blau
    Fühlerform: gerade oder gekrümmt

Ein Schmetterlingskind erbt für jeden Merkmalstyp der Eltern zufällig jeweils eines derer Merkmale.

Zum Beispiel:

    Mutter: uni - rot - gerade
    Vater: uni - grün - gekrümmt
    Kind: uni - rot - gekrümmt

Ein Schmetterlingspaar legt 1000 < k ≤ 2000 Eier. Ein Lepidopterologe (Schmetterlingskundler) sammelt nur Schmetterlinge mit einem bestimmten Merkmal m. Von allen Schmetterlingen einer Brut fängt er die mit dem Merkmal m ein.

<br>

### Aufgabenstellung

Schreiben Sie ein Programm, welches

* zufällig 1000 ≤ k ≤ 2000 Kinder entsprechend der Vererbungsregeln erzeugt
* deren Merkmale vergleichen kann
* alle Kinder mit einem festgelegten Merkmal m ermittelt und
* diese Kinder mit Merkmal m in eine Sammeltrommel legt.

<br>

### Testprogramme

1. Starten Sie mehrere Testserien, welche für ein Elternpaar k Kinder erzeugt und Ähnlichkeiten analysiert. Ermitteln Sie für jede Kombination von Merkmalen, wie viele Kinder diese Merkmals-kombination haben (in Prozent).
    ### Eingabe
    Merkmale der Eltern

    ### Ausgabe
    Statistische Auswertung der Kinder in Bezug auf ihre Merkmale
    ### Abbruch
    Das Programm bricht ab, falls die Nutzer keine neue Berechnung wünscht.
    
<br>

2. Für jede Testserie werden alle Schmetterlinge mit Merkmal m eingesammelt. Ermitteln Sie für jede Kombination der verbleibenden Merkmale, wie viele eingesammelte Schmetterlinge diese
Merkmalskombination haben (in Prozent).

    ### Eingabe
    Merkmal m

    ### Ausgabe
    Statistische Auswertung der Kinder in Bezug auf ihre sonstigen Merkmale

    ### Abbruch
    Das Programm bricht ab, falls keine neue Berechnung gewünscht wird.
