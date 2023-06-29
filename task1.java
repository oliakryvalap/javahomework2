//Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
// "city":"Moscow", "age":"null"}

    import java.sql.*;
 
public class task1{
    public static void main(String args[]) {
   select 
from 
where  and STUDENT_ID = (select ID from STUDENTS where NAME = 'Ivanov' || COUNTRY = 'Russia' CITY = 'Moskow' AGE = 'NULL' );

    }
