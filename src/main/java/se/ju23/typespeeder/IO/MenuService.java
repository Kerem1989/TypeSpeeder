package se.ju23.typespeeder.IO;

import org.springframework.stereotype.Service;
import se.ju23.typespeeder.enums.Status;

@Service
public interface MenuService {
    Status setStatus(Status status);
    void displayLoginMenu();
    Status displayMenu();
    int selectMenuOptions();
    Status displayMenuEnglish();
    Status getStatus();
    int setMenuInput();
    public int selectNewsOptions();
    void displayNewsMenu();
    int selectEditPlayerMenuOptions();
    void displayEditPlayersMenu();

}