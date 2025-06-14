# 📚 Altklausur 2023ST – Bücher & Kategorien mit Visitor

Dieses Projekt enthält eine vollständige Umsetzung der Aufgaben aus der **Altklausur 2023ST** (Objektorientierte Programmierung, UniBw München). Es wird eine Baumstruktur zur Verwaltung von Büchern und Kategorien modelliert – inklusive PrettyPrinter und Factory-Methode.

## 📁 Projektstruktur

Der relevante Code liegt im Verzeichnis `src/`:

- **`Book`** – Repräsentiert ein einzelnes Buch mit Autor und Titel.
- **`Category`** – Beinhaltet beliebig viele `Component`-Elemente (z. B. Bücher oder Unterkategorien).
- **`Component`** – Gemeinsames Interface für `Book` und `Category`.
- **`Visitor`** – Interface mit den Methoden `visit(Book)` und `visit(Category)`.
- **`PrettyPrinter`** – Implementiert den Visitor und gibt die Baumstruktur leserlich aus.
- **`Indentor`** – Hilfsklasse zur Steuerung der Einrückung im PrettyPrinter.
- **`ComponentFactory`** – Erzeugt komplexe Baumstrukturen in nur einem Statement.
- **`Main`** – Beispielhafte Anwendung aus der Klausur zur Ausgabe des Buch-Baums.
- **Testklassen**:
    - `BookTest` – Prüft Konstruktorvalidierung und `toString()`.
    - `ComponentFactoryTest` – Testet die Factory-Methoden.
    - `PrettyPrinterTest` – Vergleicht die formattierte Konsolenausgabe mit der erwarteten Struktur.

## ✅ Hinweise zur Bearbeitung

- Führt **`BookTest`**, **`ComponentFactoryTest`** und **`PrettyPrinterTest`** aus, um die Korrektheit zu prüfen.
- Die Factory erlaubt das flexible Erzeugen verschachtelter Strukturen mit `createCategory(...)` und `createBook(...)`.
- Das Visitor-Pattern trennt die Traversierung vom konkreten Verhalten (hier: Ausgabe).

## 🧩 Verwendete Entwurfsmuster

- **Composite Pattern** – für die Struktur aus Kategorien und Büchern.
- **Visitor Pattern** – zur Verarbeitung der Baumstruktur (z. B. Druckausgabe).
- **Factory Method Pattern** – zur vereinfachten Erstellung komplexer Strukturen.

## 🧪 Beispielausgabe

Die PrettyPrinter-Ausgabe des Beispielbaums sieht so aus:

