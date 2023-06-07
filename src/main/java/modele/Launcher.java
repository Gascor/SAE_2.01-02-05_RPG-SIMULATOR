package modele;

import java.io.File;

public class Launcher {
    public static Scenario[] listeScenario = new Scenario[11];
    public static void scenarioLoader() {
        for (int i = 0; i < 11; i++) {
            String nomScenario = "scenario_" + i + ".txt";
            File file = new File("scenario" + File.separator + nomScenario);
            Scenario scenario = LectureFichierTexte.lecture(file);
            listeScenario[i] = scenario;
        }
    }
}
