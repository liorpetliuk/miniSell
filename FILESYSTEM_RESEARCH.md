שאלה 1 - איך יוצרים תיקייה בגאווה ?     בגאווה כדי ליצור מחלקה חדשה משתמשים במחלקת

File   -נותנים שם לתיקייה ומפעילים עליה פעולות 

דוגמא
```java
import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File dir = new File("NewFolder");
        if (dir.mkdir()) {
            System.out.println("Directory created: " + dir.getName());
        } else {
            System.out.println("Directory already exists.");
        }
    }
}
    
```
קישור למקור : https://www.w3schools.com/java/java_files_create.asp 


שאלה 2 -איך יוצרים קובץ- כדי ליצור קובץ צריך לבחור איפה הקובץ יהיה ושם אחרי זה מבקשים מהתוכנית ליצור אותו, אם הקובץ כבר קיים-לא יקרה כלום,ואם לא-הוא יווצר. 

דוגמא
```java
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
    }
}

```
קישור למקור:
https://www.w3schools.com/java/java_files_create.asp

שאלה 3-איך בודקים אם הקובץ .תיקייה קיימים?
בגאווה יש פעולה בשם שבודקת אם קובץ התיקייה קיימים,אם כן היא תחזיר טרו ואם לא תחזיר פולס, זה בודק אם צריך ליצור את הקובץ או שזה קיים כבר.
לפעולה הזאת קוראים:

exists()

דוגמא:
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("file.txt");
        if (file.exists()) {
            System.out.println("Exists");
        } else {
            System.out.println("Not found");
        }
    }    
    }
```
הוא בעצם בודק כאן האם הקובץ נמצא .

קישור למקור:
https://docs.oracle.com/javase/8/docs/api/java/io/File.html#exists–


 שאלה 4-איך מציגים את תוכן תיקייה?  כדי לראות איזה קבצים יש בתוך התיקייה ב גאווה משתמשים בפקוצה שנקראת 

list()-פקודה זה מחזירה רק את השם של כל קובץ או תיקייה שנמצאים בתוך התיקייה
 
דוגמא:
```java
import java.io.File;

public class Main {
    public static void main(String[] args) {
        File folder = new File("myFolder");
        String[] list = folder.list();

        if (list != null) {
            for (String item : list) {
                System.out.println(item);
            }
        } else {
            System.out.println("Folder not found or empty.");
        }
    }
}

```
קישור למקור:
https://docs.oracle.com/javase/8/docs/api/java/io/File.html#listFiles–







