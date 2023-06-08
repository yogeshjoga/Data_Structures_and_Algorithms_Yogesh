public class Stream {
    public static void main(String[] args) {
        var text = """
                Hello, World!
                my name is yogesh
                i am a java developer
                """;
                var lines = text
                           .lines().filter(l -> l.contains("yogesh"))
                            .findAny().orElse("Not found");
                System.out.println(lines);

        var i = 10;
        var j = 30;
        var sum = i+j;
        var name = "yogesh joga";
        System.out.println(sum);
        System.out.println(name);

}
}