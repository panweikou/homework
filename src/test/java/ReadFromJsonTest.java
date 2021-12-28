import com.epam.week4.JsonCommand;
import com.epam.week4.ReadJson;

public class ReadFromJsonTest {
    public static void main(String[] args) {
        JsonCommand jc = new ReadJson();
        String str = jc.getJson("flower.json");
        jc.readJson(str);


    }
}
