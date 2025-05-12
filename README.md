תיאור כללי של הפרוקיט :

## תיאור הפרויקט
הפרויקט כולל פיתוח תוכנה בסיסית המדמה סביבה של שורת פקודה (Terminal או CMD) באמצעות Java.  
המשתמש יכול להקליד פקודות, לנווט בין תיקיות, ולבצע פעולות פשוטות על קבצים ותיקיות.

## הוראות הרצה
הוראות הרצה והפעלת פקודות
pwd – מציג את הנתיב הנוכחי במבנה התיקיות.

ls – מציג את כל הקבצים והתיקיות במיקום הנוכחי.

cd [שם תיקייה] – מעבר לתיקייה אחרת במבנה התיקיות.

mkdir [שם תיקייה] – יצירת תיקייה חדשה בשם הנתון.

touch [שם קובץ] – יצירת קובץ ריק חדש.

help – מציג רשימה של כל הפקודות הזמינות במערכת.

exit – סוגר את התוכנית ומסיים את ההרצה


דוגמת להצגת הפקודות##


Welcome to MiniShell! Type 'help' for a list of commands.

/Users/lior/Documents > help
Available commands:
pwd - Print the current working directory
ls - List files and directories in the current directory.
cd [dir] - Change to the specific directory (use .. to move up)
mkdir [dir] - Create new directory.
touch [file] - Create new empty file.
help - Show this help message
exit - Exit the program

/Users/lior/Documents > pwd
/Users/lior/Documents

/Users/lior/Documents > ls
[DIR] Projects
[FILE] notes.txt
[FILE] todo.txt

/Users/lior/Documents > mkdir testFolder
Directory created: testFolder

/Users/lior/Documents > cd testFolder

/Users/lior/Documents/testFolder > touch hello.txt
File created: hello.txt

/Users/lior/Documents/testFolder > ls
[FILE] hello.txt

/Users/lior/Documents/testFolder > cd ..
/Users/lior/Documents > exit
Goodbye!

