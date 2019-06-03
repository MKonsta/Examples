package core.patterns.abstractfactory.wegbsite;

import core.patterns.abstractfactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website pm manajes website project...");
    }
}
