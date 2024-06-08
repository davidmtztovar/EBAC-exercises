package exercises;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BiosHashChecker {
    public static void main(String[] args) {
        String biosHash = getBiosHash();
        if (biosHash != null) {
            System.out.println("BIOS Hash: " + biosHash);
        }
    }

    public static String getBiosHash() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("wmic", "bios", "get", "SMBIOSBIOSVersion", "/value");
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("SMBIOSBIOSVersion=")) {
                    String biosVersion = line.substring(line.indexOf('=') + 1);
                    return biosVersion.trim();  // Return the BIOS version directly
                }
            }

            System.out.println("Failed to retrieve BIOS hash.");
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    private static String getHashFromVersion(String biosVersion) {
        // Extract hash from the version string
        Pattern pattern = Pattern.compile("\\[([a-zA-Z0-9]+)\\]");
        Matcher matcher = pattern.matcher(biosVersion);
        if (matcher.find()) {
            return matcher.group(1);
        }

        System.out.println("Failed to extract BIOS hash from version: " + biosVersion);
        return null;
    }
}
