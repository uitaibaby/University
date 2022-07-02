import java.util.List;

public class Program {
    public static void main(String[] args) {
        String PATH = "C:\\Users\\Hatch\\Downloads\\universityInfo.xlsx";// тут надо вбить свой адрес
        int page = 1;

        List<University> universities =
                ExcelReader.ExlReader(PATH, page);
        for (University university : universities) {
            System.out.println(university);
        }
    }
}
/* у меня всегда выпадает исключение NullPointerException, которое, как я понял появляется из-за ссылки на пустую строку, но
вот как решить этк проблему я не понял, потому что условие на строку создает бесконечный цикл, а условие на ячейку
бесконечно выводит одну строку. Если будет возможнось: напишите, пожалуйста, в ответе. Спасибо! */

