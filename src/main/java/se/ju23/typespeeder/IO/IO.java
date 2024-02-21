package se.ju23.typespeeder.IO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Scanner;

@Repository
public interface IO {
    String getValidStringInput();
    int getValidIntegerInput(Scanner input, int minValue, int maxValue);
    String getString();
    Scanner returnScanner();
    public ArrayList<String> getInGameMessages();
    public String inputUserString();
}
