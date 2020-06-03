import java.util.Arrays;
import java.util.List;

public class ApiCall {
  public static void main(String... args) {
    RestClient client = new RestClient();
    Object obj = client.call(
      "http://dominio:port/hola/{1}",
      Arrays.asList("param01"),
      (uri, param, puerto) -> {
        System.out.println("Paso por aquiiiiiii");
        return uri.replace("{1}", param).replace("port", "8080");
      }
    );
    // http://dominio/hola/param01
    System.out.println(obj);

    // http://dominio/hola/?param01
    Object obj2 = client.call(
      "http://dominio:port/hola/{1}",
      Arrays.asList("param01"),
      (String uri, String param, int puerto) -> uri.replace("{1}", "?")
                                                  .concat(param)
                                                  .replace("port", String.valueOf(puerto))
    );
    System.out.println(obj2);
  }
}
@FunctionalInterface
interface BuildUri {
  String build(String uri, String parameter, int port);
}
class RestClient {
  Object call(String uri, List<String> parametros, BuildUri builder) {
    // Llamar a API REST
    System.out.println(builder.build(uri, parametros.get(0), 9000));
    return "[{resultado}]";
  }
}