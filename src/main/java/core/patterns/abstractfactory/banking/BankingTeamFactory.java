package core.patterns.abstractfactory.banking;

import core.patterns.abstractfactory.Developer;
import core.patterns.abstractfactory.ProjectManager;
import core.patterns.abstractfactory.ProjectTeamFactory;
import core.patterns.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
