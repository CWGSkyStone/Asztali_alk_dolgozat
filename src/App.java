/*
* File: App.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft II/N
* Date: 2026-10-08
* Github: https://github.com/CWGSkyStone/
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            System.out.println("Fájlba írás");
            System.out.print("Írja be a szöveget: ");
            String content = scanner.nextLine();

            Writable writer = new Writer();
            writer.writeContent(content);
        }
    }
}
