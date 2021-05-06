package TestPckage;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromJSONFile {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonparser = new JSONParser();
 File input = new File("C:\\Users\\Dell\\IdeaProjects\\TestNGSampleProject\\src\\main\\resources\\TestRegistrationData.json");
        //FileReader filereader = new FileReader("C:\\Users\\Dell\\IdeaProjects\\TestNGSampleProject\\src\\main\\java\\DataResources\\TestRegistrationData.json");
        Object obj = jsonparser.parse(new FileReader(input));

        JSONObject objJSON = (JSONObject)obj;
      String fName=  objJSON.get("FirstName").toString();

      System.out.println(fName);

    }
}
