# FAQ

## Ich verwende eine andere Java-Version, wie kann ich das in den Beispielprojekten umstellen?
> In der pom.xml findest du die Properties `maven.compiler.source` und `maven.compiler.target`. Ändere den Wert z.B. auf 17 um Java 17 zu verwenden.

## Ich starte ein ganz neues Projekt und habe nichtmal die Anfangsstruktur.
> Initiale Erzeugung der Standard-Maven Verzeichnisstruktur

**Mac/Linux**
```bash
mkdir -p src/main/java src/main/resources src/test/java src/test/resources
```

**Windows**
```bash
mkdir src\main\java src\main\resources src\test\java src\test\resources
``

## Wo finde ich die Koordinaten für Maven Dependencies?
> Gehe auf `https://mvnrepository.com/` und trage in der Suchleiste den Namen der Library ein.