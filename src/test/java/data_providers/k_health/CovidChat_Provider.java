package data_providers.k_health;

import org.testng.annotations.DataProvider;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class CovidChat_Provider {

    @DataProvider(name = "Covid-19 Chat")
    public Iterator<Object[]> chat() {
        LinkedHashMap<String, String> data = new LinkedHashMap<>();

        data.put("האם היית במגע קרוב עם אדם שעלול להיות חולה בקורונה?", "אני לא בטוח");
        data.put("האם אתה סובל מאחת או יותר ממחלות הלב הבאות?", "אף אחד מאלה");
        data.put("האם אתה סובל מאחת או יותר מהמחלות הכרוניות הבאות?", "אסתמה");
        data.put("סיום", "סיום");
        data.put("אלו מהדברים הבאים נכונים לגבי מצבך הרפואי?", "אף אחד מאלה");
        data.put("אלו מהדברים הבאים נכונים לגבי מצבך הרפואי?", "אף אחד מאלה");
        data.put("האם אתה סובל מחולשה וסחרחורות שמונעות ממך לעמוד או להסתובב בחופשיות?", "לא");
        data.put("האם אתה סובל מקוצר נשימה המקשה עליך לדבר ברצף או לסיים משפטים?", "כן");
        data.put("האם אתה חווה כאב או לחץ משמעותי בחזה (למשל כזה המקשה עליך לנשום כרגיל)?", "לא");
        data.put("האם עשית בדיקה לנגיף הקורונה?", "לא נבדקתי");
        data.put("האם נבדקת לשפעת או לנגיף נשימתי אחר?", "לא");
        data.put("האם חוש הריח שלך התדרדר, השתנה או נעלם לאחרונה?", "לא");
        data.put("האם יש לך כאב עמום או דוקר מאחורי העין?", "לא");
        data.put("האם העיניים שלך יבשות מהרגיל?", "לא");
        data.put("האם אתה חווה כאב חדש במפרקים (כאב שאינו כרוני)?", "לא");
        data.put("האם יש לך תחושת גרד בגרון?", "לא");
        data.put(" האם הבחנת באדמומיות כלשהי או שינוי צבע באצבעות הרגליים?", "לא");
        data.put("האם אתה חווה נימול או אובדן תחושה באיבר כלשהו בגוף?", "לא");
        data.put("האם אתה משלשל?", "קרה מספר פעמים");
        data.put("דלג", "דלג");
        data.put("האם אתה סובל מאחד מהתסמינים הבאים? (במידה ויש יותר מתסמין אחד, בחר את זה שתרצה לדבר עליו קודם).", "אין לי תסמינים");
        data.put("מצויין, מה לגבי אחד מאלה? (שוב, במידה ויש יותר מאחד, בחר את זה שתרצה לדבר עליו קודם).", "לא");
        data.put("הצגת התוצאות", "הצגת התוצאות");

        return data.entrySet().stream().map(input -> new Object[]{input.getKey(), input.getValue()}).iterator();
    }

    //Expected
    //הסימפטומים שלך דורשים הערכה רפואית מיידית.

    @DataProvider(name = "data-provider")
    public Object[][] data() {
        Object[][] data = new Object[3][3];

        data[0][0] = "FName1";
        data[0][1] = "LName1";
        data[0][2] = "Email1";

        data[1][0] = "FName2";
        data[1][1] = "LName2";
        data[1][2] = "Email2";

        data[2][0] = "FName3";
        data[2][1] = "LName3";
        data[2][2] = "Email3";

        return data;
    }

}
