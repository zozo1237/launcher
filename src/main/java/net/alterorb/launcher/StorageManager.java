package net.alterorb.launcher;

import net.alterorb.launcher.alterorb.AlterorbGame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StorageManager {

    private static final Path BASE_DIRECTORY = Paths.get(System.getProperty("user.home"), ".alterorb");
    private static final Path GAMEPACKS_DIRECTORY = BASE_DIRECTORY.resolve("gamepacks");

    public void initializeDirectories() throws IOException {

        if (!Files.exists(BASE_DIRECTORY)) {
            Files.createDirectories(BASE_DIRECTORY);
        }

        if (!Files.exists(GAMEPACKS_DIRECTORY)) {
            Files.createDirectories(GAMEPACKS_DIRECTORY);
        }
    }

    public boolean gamepackExists(AlterorbGame alterorbGame) {
        return Files.exists(getGamepackPath(alterorbGame));
    }

    public boolean gamepackExists(String alterorbGameName) {
        return Files.exists(getGamepackPath(alterorbGameName));
    }

    public Path getGamepackPath(AlterorbGame alterorbGame) {
        return getGamepackPath(alterorbGame.getInternalName());
    }

    public Path getGamepackPath(String alterorbGameName) {
        return GAMEPACKS_DIRECTORY.resolve(alterorbGameName + ".jar");
    }
}
