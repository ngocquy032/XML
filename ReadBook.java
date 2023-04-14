import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadBook {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("book.json")){
            Object obj = jsonParser.parse(reader);

            JSONArray bookList = (JSONArray) obj;
            System.out.println(bookList);

            bookList.forEach(emp -> parseBookObject((JSONObject) emp) );

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    private static void parseBookObject(JSONObject book){
        JSONObject BookObject = (JSONObject) book.get("book");

        String id = (String) BookObject.get("Id");

        String name = (String) BookObject.get("name");
        System.out.println(name);

        String price = (String) BookObject.get("price");
        System.out.println(price);

        String author = (String) BookObject.get("name");
        System.out.println(author);

    }
}
