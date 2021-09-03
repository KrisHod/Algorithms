
import java.util.HashMap;
import java.util.Map;

// Map<String, String> variables = new HashMap<>();
// variables.put(“firstName”, “Ara”);
// variables.put(“lastName”, “Livingstone”);
// renderTemplate(“Hi, I am {{firstName}} {{lastName}}“, variables);
// -> “Hi, I am Ara Livingstone”
//public String renderTemplate(String template, Map<String, String>     variables) {}

public class Test1 {

    public static String renderTemplate(String template, Map <String,String> variables){
        while (template.contains("{{")) {
            int index = template.indexOf("{" ) + 2;
            int index2 = template.indexOf("}");
            String Key = template.substring(index, index2);
            template = template.replace("{{" + Key + "}}", variables.get(Key));
        }
        return template;
    }
    public static void main(String[] args) {

        Map<String, String> variables = new HashMap<>();
        variables.put("firstName", "Ara");
        variables.put("lastName", "Livingstone");
        variables.put("middleName", "Richard");
        variables.put("city", "London");
        System.out.println(renderTemplate("Hello, my name is {{firstName}} {{middleName}} {{lastName}}. I live in {{city}}", variables));
    }
}
