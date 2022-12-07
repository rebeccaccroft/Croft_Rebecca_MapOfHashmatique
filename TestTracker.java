import java.util.HashMap;
public class TestTracker{
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
            trackList.put("12 Days of Christmas","Five golden rings");  
            trackList.put("Oh Holy Night","the stars are brightly shining");  
            trackList.put("Rudolph the Red-Nosed Reindeer","had a shiny nose");  
            trackList.put("I'll be Home for Christmas","you can count on me."); 

            System.out.println(trackList);
            System.out.println(trackList.get("Oh Holy Night")) ;
    }
}