import com.google.gson.Gson;
import java.io.FileReader;

public class Parser {
    public Root parse() {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("peoples.json")){
            Root root = gson.fromJson(reader, Root.class);
            return root;
        }catch (Exception e){
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}