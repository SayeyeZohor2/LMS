import java.time.LocalDate;
import java.time.Period;

/**
 * <div style="width: 300px; border-color: #2196F3 !important;   border-left: 5px solid #2196F3;  background-color: #ddffff !important; padding: 0.01em 16px; unicode-bidi: isolate;">
 *      <p style="font-family: 'Shabnam'; font-weight: bold; margin-top: 1.2em; margin-bottom: 1.2em; font-size: 12px;">موارد رعایت شده در این کلاس</p>
 * </div>
 *  <div style="font-family: 'Shabnam'; font-weight: bold; ">
 *  _________________________________________________________________________<br>
 *      <span>کار با انواع مختلف داده ها -02</span> - {@code Primitive and Wrapper Class}<br>
 *      <span>استفاده از عملگرها و ساختارهای تصمیم گیری -03</span> - {@code if-else, switch, ternary-operator}<br>
 *      <span>کار با متدها و کپسوله سازی -06</span> - {@code getter, setter, Encapsulation, builder design pattern}<br>
 *      <span>مدیریت خطا ها و استثناها -08</span> - {@code Exception Manager (throw)}<br>
 *      <span>سطوح دسترسی -13</span> - {@code Access Modifier}<br>
 *      <span>استغاده از کلمه کلیدی -20</span> - {@code static}<br>
 *      <span>استفاده از کلمه کلیدی -23</span> - {@code final IN (Variable - Method - Class)}<br>
 *      <span>آپشن های متد -00</span> - {@code Overloading}<br>
 *      <span>گامنت گذاری -00</span><br>
 *
 *      <br>
 *      Ctrl + Alt   + Q Toggle Rendered View<br>
 *      Ctrl + Shift + - Collapsed Code in IDE<br>
 *      <a href="https://www.geeksforgeeks.org/period-between-method-in-java-with-examples/">رفرنس استفاده شده برای کار با کتابخانه زمان</a><br>
 *      <a href="https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println">رفرنس استفاده شده برای رنگی کردن کنسول</a><br>
 *      <a href="http://www.aliarash.com/article/codemeli/codemeli.htm">رفرنس استفاده شده برای کار با</a><br>
 *      <a href="https://snippets.ir/1284/validation-of-the-national-code-in-java.html">رفرنس استفاده شده برای کار با</a><br>
 *  </div>
 *
 *  _________________________________________________________________________<br>
 *
 *  <div style="font-family: 'Shabnam'; font-weight: bold; ">
 *     final <span>انواع استفاده از کلمه کلیدی </span><br>
 *     <span> فقط یک بار می‌تواند تنظیم شود </span>- 01 final <span> مقدار یک متغیر </span> <br>
 *     <span> را بازنویسی کرد </span>- 02 override - final <span> نمی توان متد های </span> <br>
 *     <span> ارث بری کرد </span>- 03 inheritance - final <span> نمی توان از کلاس های </span> <br>
 *  </div>
 *
 *  @author Mohammad Ali Nikoei 😎
 *  @since      1.0
 */

public class Tools {
//region -- متد استاتیک برای رنگی کردن متن کنسول --
    // ANSI escape codes for text styles
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BOLD = "\u001B[1m";
    private static final String ANSI_UNDERLINE = "\u001B[4m";
    private static final String ANSI_REVERSED = "\u001B[7m";

    // ANSI escape codes for text colors
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    // ANSI escape codes for background colors
    private static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void println(String text) {
        System.out.println(text);
    }

    public static void println(String color, String text) {
        System.out.println(color + text + ANSI_RESET);
    }

    public static void println(String color, String style, String text) {
        System.out.println(color + style + text + ANSI_RESET);
    }

    public static void printlnWithStyle(String style, String text) {
        System.out.println(style + text + ANSI_RESET);
    }

    // Custom methods for alert, info, warning, etc.
    public static void alert(String text) {
        println(ANSI_RED_BACKGROUND, ANSI_BOLD, "  "+text+"  ");
    }

    public static void infoTitle(String text) {
        println(ANSI_REVERSED, ANSI_BOLD, "-  "+text+"  -");
    }

    public static void info(String text) {
        println(ANSI_REVERSED, ANSI_BOLD, "  "+text+"  ");
    }

    public static void warning(String text) {
        println(ANSI_YELLOW, ANSI_BOLD, "  "+text+"  ");
    }

    public static void success(String text) {
        println(ANSI_GREEN_BACKGROUND, ANSI_BOLD, "  "+text+"  ");
    }

    public static void custom(String color, String style, String text) {
        println(color, style, text);
    }
//endregion


//region -- متد استاتیک برای محاسبه سن --
    /**
     * <div style="font-family: 'Shabnam'; font-weight: bold; ">
     *  <span>گرفتیم </span>birthDate<span> به نام </span>LocalDate<span> یک پراپرپتی از نوع</span>
     */
    private static LocalDate birthDate;

    /**
     * <div style="font-family: 'Shabnam'; font-weight: bold; ">
     *  Encapsulation <span>گرفتیم برای رعایت </span>setBirthDate<span> به نام </span>Setter<span> یک</span><br>
     *  <span>تا زمانی که مقدار از پارامتر ورودی دریافت می شه رو بتونیم در </span><br>
     *  <span>صورت نیاز قبل از سپردن به بدنه اصلی متد، بررسی و پالایش کنیم</span>
     *  <blockquote><pre>
     *  private static LocalDate birthDate;
     *  </pre></blockquote>
     *
     *  <br>
     *
     *  <span> استفاده نشده چون متد استاتیک هست </span> this <span>از کلمه کلیدی </span><br>
     *  <span>به صورت مستقیم شدیم</span> (Tools) <span>و نمونه ای از آن گرفته نشده است و مجبور به استفاده از نام کلاس </span><br>
     *  <blockquote><pre>
     *  Tools.birthDate = birthDate;
     *  </pre></blockquote>
     * </div>
     */
    public static void setBirthDate(LocalDate birthDate) {
        Tools.birthDate = birthDate;
    }

    /**
     * <div style="font-family: 'Shabnam'; font-weight: bold; ">
     *      <span>کردیم، در متد اورلود شده </span>overload<span> را </span>calculateAge<span> متد</span><br>
     *      <blockquote><pre>
     *      public static int calculateAge()
     *      public static int calculateAge(LocalDate date)
     *      </pre></blockquote><br>
     *
     *      <span> یک پارامتر به عنوان ورودی گرفتیم که تاریخ تولد را بر مبنای آن تاریخ محاسبه کنیم نه صرفاً تاریخ روز</span><br>
     *      <blockquote><pre>(LocalDate date)</pre></blockquote>
     *      overload<span> که </span>calculateAge<span> در متد </span>date<span> نکته: توجه داشته باشید که </span><br>
     *      <span> شده، یک پارامتر موقتی است که برای محاسبه در لحظه استفاده می‌شود، </span><br>
     *      <span>ندارد </span>setter<span> قرار نیست به عنوان یک ویژگی دائمی یا داخلی در کلاس ذخیره شود و نیازی به ذخیره‌سازی یا </span>
     *<br><br>
     *
     *      <span style="padding: 5px; background-color: 'black'; color: 'white'">سن</span><span> را بر اساس تاریخ تولد ذخیره‌شده و تاریخ فعلی محاسبه می‌کند.</span><br>
     *      <span> این متد تعداد سال‌های بین تاریخ تولد ذخیره‌شده و تاریخ فعلی را محاسبه می‌کند.</span><br>
     *      <span>تنظیم نشده باشد.</span>{@code birthDate}<span>اگر تاریخ تولد تنظیم نشده باشد، یک</span>
     * </div>
     *
     * @return  <span style="font-size: 9px; font-family: 'Shabnam'; font-weight: bold; ">سن محاسبه‌شده به سال</span>
     * @throws IllegalStateException <span style="font-size: 9px; font-family: 'Shabnam'; font-weight: bold; "> اگر {@code birthDate} تنظیم نشده باشد </span>
     */
    public static int calculateAge() {
        if (birthDate == null) {
            throw new IllegalStateException("تاریخ تولد وارد نشده است");
        }

        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public static int calculateAge(LocalDate date) {
        if (birthDate == null) {
            throw new IllegalStateException("تاریخ تولد وارد نشده است");
        }

        if (date == null) {
            throw new IllegalStateException("تاریخ روز وارد نشده است");
        }

        return Period.between(birthDate, date).getYears();
    }
//endregion


//import java.util.Scanner;
//
//    public class Main {
//        private static boolean validationNationalCode(String code){
//            //check length
//            if (code.length() != 10)
//                return false;
//
//            long nationalCode = Long.parseLong(code);
//            byte[] arrayNationalCode = new byte[10];
//
//            //extract digits from number
//            for (int i = 0; i < 10 ; i++) {
//                arrayNationalCode[i] = (byte) (nationalCode % 10);
//                nationalCode = nationalCode / 10;
//            }
//
//            //Checking the control digit
//            int sum = 0;
//            for (int i = 9; i > 0 ; i--)
//                sum += arrayNationalCode[i] * (i+1);
//            int temp = sum % 11;
//            if (temp < 2)
//                return arrayNationalCode[0] == temp;
//            else
//                return arrayNationalCode[0] == 11 - temp;
//        }
//
//
//        public static void main(String[] args) {
//            // snippets.ir
//
//            Scanner scanner = new Scanner(System.in);
//            String code = scanner.next();
//            if (validationNationalCode(code))
//                System.out.println("valid");
//            else
//                System.out.println("Not valid");
//            scanner.close();
//        }
//    }
}
