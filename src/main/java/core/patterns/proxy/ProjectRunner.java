package core.patterns.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com.bla-bla-bla/superProject");
        project.run();
    }
}
