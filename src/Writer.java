/*
* File: Writer.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II/N
* Date: 2026-10-08
* Github: https://github.com/CWGSkyStone/
*/

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Writer implements Writable {
    @Override
    public void writeContent(String content) {
        try {
            tryWriteContent(content);
            System.out.println("A szöveg a szoveg.txt fájlba került.");
        } catch (IOException e) {
            System.err.println("Hiba a fájl írása közben: " + e.getMessage());
        }
    }

    private void tryWriteContent(String content) throws IOException {
        try (BufferedWriter fileWriter = Files.newBufferedWriter(
                Paths.get("szoveg.txt"), StandardCharsets.UTF_8)) {
            fileWriter.write(content);
        }
    }
}
