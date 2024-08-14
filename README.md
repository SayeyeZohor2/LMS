# University
سیستم جامع دانشگاهی به زبان جاوا


![Lovely Programming Language => java](https://github.com/SayeyeZohor2/University/blob/main/picture/pexels-photo-4017430.webp)



```java
import java.util.Arrays;
import java.util.List;

public class JavaFun {
    public static void main(String[] args) {
        List<String> favoriteThings = Arrays.asList("Code", "Coffee", "Challenges");

        favoriteThings.stream()
            .map(String::toUpperCase)
            .forEach(thing -> System.out.println("I love " + thing + "!"));

        new JavaFun().doSomethingCool();
    }

    private void doSomethingCool() {
        System.out.println("Let’s keep exploring the world of Java!");
    }
}

```
