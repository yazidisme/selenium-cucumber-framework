package managers;

import dataproviders.ConfigFileReader;
import dataproviders.JsonReader;

public class FileReaderManager {

    private static final FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;
    private static JsonReader jsonReader;

    private FileReaderManager() {}

    public static FileReaderManager getInstance() {
        return fileReaderManager;
    }

    public ConfigFileReader getConfigFileReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }

    public JsonReader getJsonReader() {
        return (jsonReader == null) ? new JsonReader() : jsonReader;
    }
}
