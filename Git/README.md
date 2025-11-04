# 🚀 Git-Übung: Praktische Prüfung der Git-Kenntnisse

## Aufgabenstellung für Studierende

**Liebe Studierende,**

Diese Übung prüft Ihre praktischen Git-Kenntnisse. Sie arbeiten ausschließlich in der **Kommandozeile/Terminal** 💻 und dokumentieren wesentliche Schritte durch Screenshots.

--

## **Wichtige Hinweise**
-   Arbeiten Sie ausschließlich in der Kommandozeile (Terminal/Git Bash).
-   Die Abgabe erfolgt im Hauptbranch `main`.
 
- **Wichtige Hinweise zu den Screenshots:**
-   Die Screenshots kommen direkt (ohne Unterordner) in den `Git`-Ordner in ihrem persönlichen Semester-Repo.
-   Screenshot-Benennung: `Git-Teil[X]-Schritt[Y]-[IhrNachname].png` z.B. `Git-Teil1-Schritt5-Klemmer.png`
-   Screenshots müssen chronologisch und lesbar hochgeladen werden.
-   Jeder Screenshot muss die verwendeten Befehle UND deren Ausgabe zeigen. 
-   🥳🥳🥳 Idealerweise sind alle Befehle auf einem Screenshot sichtbar. 🥳🥳🥳

**Wichtige Hinweise zum Umgang mit der Konsole:**
-   Der Befehl zur Anzeige der Commit-Historie lautet einheitlich: `git log --oneline --graph --all`.
-   Verwenden Sie den Editor `nano` in der Konsole, wenn Sie Dateien beareiten müssen, z.B. mit `nano projekt-info.md`.
-   Über den Befehl `cat dateiname.xyz` kann der Inhalt einer Datei direkt in die Konsole ausgegeben werden.

**Bei Problemen:** Melden Sie sich sofort, falls Befehle nicht funktionieren 🆘.

---

## **Was wird bewertet:**

✅ **Korrekte Git-Befehle** (sichtbar in Screenshots)
✅ **Richtige Terminal-Ausgaben** (Repository-Status, Logs, Dateiinhalte)
✅ **Vollständige Dokumentation** (alle geforderten Screenshots)
✅ **Saubere Commit-Historie** (aussagekräftige Commit-Nachrichten)
✅ **Korrekte Benennung von Files** (exakt wie in der Beschreibung angegeben)

Viel Erfolg bei der Übung! 🎉

---

## **Ihre Aufgabe: Ein persönliches Projekt-Repository erstellen**

Sie sollen ein Git-Repository für ein fiktives "Studienplaner"-Projekt anlegen und verschiedene Entwicklungsschritte simulieren.

--

### **Teil 1: Repository-Grundlagen**

**Szenario:** Sie starten ein neues Projekt für einen digitalen Studienplaner.

**Ihre Schritte:**
1.  📂 Erstellen Sie einen Ordner `studienplaner-[IhrNachname]` auf Ihrem Desktop.
2.  Navigieren Sie in diesen Ordner.
3.  Initialisieren Sie ein Git-Repository.
4.  Konfigurieren Sie Git mit Ihrem Namen und Ihrer E-Mail-Adresse.
5.  ✍️ Erstellen Sie eine Datei `projekt-info.md` mit folgendem Inhalt:
    ```
    # Studienplaner-Projekt
    
    **Ersteller:** [Ihr vollständiger Name]
    **E-Mail:** [Ihre E-Mail] 
    **Startdatum:** 04.10.2025
    **Projektbeschreibung:** Digitaler Planer für das Studium
    ```
6.  Fügen Sie die Datei zur Versionskontrolle hinzu.
7.  Erstellen Sie Ihren ersten Commit mit der Nachricht "01: Projektstart: Grundinformationen hinzugefügt".

**📸 Abgabe:** Screenshot nach jedem Terminal-Befehl + finaler Screenshot der `git log --oneline --graph --all` Ausgabe.

---

### **Teil 2: Funktionen entwickeln**

**Szenario:** Sie entwickeln die ersten Funktionen Ihres Studienplaners.

**Ihre Schritte:**
1.  ✨ Erstellen Sie eine Datei `module.txt` und listen Sie 5 Module Ihres aktuellen Semesters auf.
2.  ✍️ Bearbeiten Sie die `projekt-info.md` und fügen Sie eine neue Zeile hinzu: `Status: In Entwicklung`.
3.  Prüfen Sie den aktuellen Status Ihres Repositories.
4.  Fügen Sie **nur** die geänderte `projekt-info.md` zur Staging Area hinzu.
5.  Erstellen Sie einen Commit mit der Nachricht "02: Status-Update: Projekt in Entwicklung".
6.  Fügen Sie nun die `module.txt` zur Staging Area hinzu und committen Sie mit "03: Feature: Modulliste hinzugefügt".
7.  Zeigen Sie die gesamte Commit-Historie an.

**📸 Abgabe:** Screenshots der `git status` Ausgaben nach Schritt 3 + finaler Screenshot der `git log --oneline --graph --all` Ausgabe.

---

### **Teil 3: Fehlerkorrektur und Rückgängigmachen**

**Szenario:** Sie haben einen Fehler gemacht und müssen Änderungen rückgängig machen.

**Ihre Schritte:**
1.  ✍️ Fügen Sie eine 6. Zeile zu `module.txt` hinzu: "Zusatzmodul XYZ".
2.  Fügen Sie diese Änderung zur Staging Area hinzu.
3.  🛑 **STOPP!** Sie merken, das Zusatzmodul ist falsch. Entfernen Sie die Datei aus der Staging Area mit `git reset HEAD module.txt`.
4.  Prüfen Sie den Repository-Status.
5.  🔧 Machen Sie die Änderung in der Datei komplett rückgängig mit `git checkout -- module.txt`.
6.  Erstellen Sie nun eine andere Änderung: Fügen Sie zu `projekt-info.md` eine Zeile hinzu: "Version: 0.1".
7.  Committen Sie diese Änderung mit "04: Version 0.1 gesetzt.".
8.  🤔 **Ups, falscher Commit!** Machen Sie den letzten Commit rückgängig mit `git reset --soft HEAD~1`.

    > 💡 **Info:** Wir nutzen `--soft`, damit nur der Commit entfernt wird, Ihre Änderungen aber erhalten bleiben. `--mixed` (der Standard) würde die Änderungen nur ins Arbeitsverzeichnis verschieben und `--hard` würde sie komplett und endgültig löschen!
9.  Prüfen Sie den Repository-Status.
**📸 Abgabe:** Screenshots nach den Schritten 3, 4, 5, 8 und 9.

---

### **Teil 4: Teamarbeit simulieren**

**Szenario:** Sie arbeiten an einem neuen Feature in einem separaten Branch.

**Ihre Schritte:**
1.  🌱 Erstellen Sie einen neuen Branch namens `kalender-feature`.
2.  Wechseln Sie zu diesem Branch.
3.  Erstellen Sie eine Datei `kalender.txt` mit folgendem Inhalt:
    ```
    Kalender-Feature für Studienplaner:
    - Terminverwaltung
    - Erinnerungen
    - Prüfungsdaten
    ```
4.  Committen Sie diese neue Datei mit "05: Feature: Kalender-Grundfunktionen".
5.  Wechseln Sie zurück zum Haupt-Branch (`main`).
6.  ✍️ Bearbeiten Sie `projekt-info.md` und ändern Sie den Status auf "Status: Feature-Entwicklung".
7.  Committen Sie diese Änderung mit der Nachricht "07: Status: Feature-Entwicklung".
8.  🤝 Führen Sie den `kalender-feature` Branch in den Hauptbranch zusammen (Befehl: `git merge`).
9.  Lösen Sie den Merge-Konflikte.
10. 🗑️ Löschen Sie den `kalender-feature` Branch.
11. Zeigen Sie die finale Commit-Historie mit Verzweigungsdarstellung an.

**📸 Abgabe:** Screenshots der Branch-Wechsel, des Merges, der Konfliktlösung + finaler Screenshot der `git log --oneline --graph --all` Ausgabe.

---

### **Teil 5: Dateien ignorieren**

**Szenario:** Sie möchten bestimmte Dateien und Ordner von der Versionskontrolle ausschließen.

**Ihre Schritte:**
1. 🙈 Erstellen Sie eine `.gitignore` Datei im Hauptverzeichnis. 
2. Fügen Sie Regeln hinzu, um folgende Elemente zu ignorieren:
    * Alle `.backup` Dateien (Achtung: wirklich alle!)
    * Den Ordner `temp/`
    * Die Datei `debug.log`
3. Erstellen Sie zu Testzwecken eine Datei `notizen.backup` und einen Ordner `temp`.
4. Zeigen Sie den Inhalt des Verzeichnisses über `ls -la`.
5. Prüfen Sie mit `git status`, ob die neuen Elemente korrekt ignoriert werden.
6. Fügen Sie die `.gitignore` Datei zur Staging Area hinzu.
7. Committen Sie die `.gitignore` mit der Nachricht "08: Feat: .gitignore für Projektdateien hinzugefügt".

**📸 Abgabe:** Screenshots, die den Inhalt der `.gitignore` zeigen, die `git status` Ausgabe nach Schritt 4 und die finale `git log --oneline --graph --all` Ausgabe.