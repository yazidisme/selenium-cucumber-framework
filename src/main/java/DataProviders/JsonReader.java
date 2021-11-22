package dataproviders;

import com.google.gson.Gson;
import datatypes.User;
import managers.FileReaderManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonReader {

    private final String userFilePath = FileReaderManager.getInstance().getConfigFileReader().getTestDataResources() + "Users.json";
    private final List<User> userList;

    public JsonReader() {
        userList = getUserList();
    }

    private List<User> getUserList() {
        Gson gson = new Gson();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(userFilePath));
            User[] users = gson.fromJson(bufferedReader, User[].class);
            return Arrays.asList(users);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("JSON file not found at " + userFilePath + ". ");
        } finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final User getUserByName(String userName) {
        for(User user : userList)
            if(user.name.equalsIgnoreCase(userName)) return user;
        return null;
    }
}
