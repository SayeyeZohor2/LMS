import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Tools.success("به سیستم جامع مدیریت یادگیری LMS خوش آمدید");


        LocalDate birthDay = LocalDate.of(1986, 11, 3);
        Tools.setBirthDate(birthDay);   //خروجی = 1986-11-03
        System.out.println("سن = " + Tools.calculateAge());

        StringBuffer sb = new StringBuffer();
        sb.append("sa");
        sb.append("asda");


        System.out.println(sb.toString());

//        System.exit(0);
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }



    }
}