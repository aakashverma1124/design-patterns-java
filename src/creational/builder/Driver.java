package creational.builder;

public class Driver {
    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient.HttpClientBuilder().method("GET")
                .url("https://innoskrit.in/courses")
                .secure("userName", "password")
                .body("{courseId = 101}")
                .build();
        System.out.println(httpClient);
    }
}
