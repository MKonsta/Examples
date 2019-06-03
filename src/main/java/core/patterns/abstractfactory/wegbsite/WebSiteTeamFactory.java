package core.patterns.abstractfactory.wegbsite;

import core.patterns.abstractfactory.Developer;
import core.patterns.abstractfactory.ProjectManager;
import core.patterns.abstractfactory.ProjectTeamFactory;
import core.patterns.abstractfactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
