import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteBook {
    public static void main(String[] args) {
        JSONObject BookDetails = new JSONObject();
        BookDetails.put("Id", "A01");
        BookDetails.put("name", "Java Core");
        BookDetails.put("price","10000");
        BookDetails.put("author","Ngoc Quy");

        JSONObject BookObject = new JSONObject();
        BookObject.put("book",BookDetails);

        JSONObject BookDetails2 = new JSONObject();
        BookDetails2.put("Id", "A02");
        BookDetails2.put("name", "PHP");
        BookDetails2.put("price","20000");
        BookDetails2.put("author","Ngoc Quy");

        JSONObject BookObject2 = new JSONObject();
        BookObject2.put("book",BookDetails2);

        JSONObject BookDetails3 = new JSONObject();
        BookDetails3.put("Id", "A03");
        BookDetails3.put("name", "Javascript");
        BookDetails3.put("price","30000");
        BookDetails3.put("author","Ngoc Quy");

        JSONObject BookObject3 = new JSONObject();
        BookObject3.put("book",BookDetails3);

        JSONArray BookList = new JSONArray();
        BookList.add(BookObject);
        BookList.add(BookObject2);
        BookList.add(BookObject3);

        try(FileWriter file = new FileWriter("book.json")){
            file.write(BookList.toJSONString());
            file.flush();
        }catch(IOException a){
            a.printStackTrace();
        }

    }
}
