import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {
    // 範例 : 查找 "w3schools" 關鍵字串
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        // 案例說明 , Pattern 的 compile() 方法 , 第一個參數代表要被查找的 pattern , 第二個則表示要搜索的參數 "大小寫不區分"
        // 第二個參數的 option 的
        // matcher() 方法代表被查找的字符串
        // find() 返回 true/false 代表查找結果 boolean 值
        // 比較詳細的說明 (這感覺有用到再來看= =)
        // https://www.w3schools.com/java/java_regex.asp
    }
}