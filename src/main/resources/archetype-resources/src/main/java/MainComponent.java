package ${package};

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {MainModule.class})
interface MainComponent {
    MainCli mainCli();
}
