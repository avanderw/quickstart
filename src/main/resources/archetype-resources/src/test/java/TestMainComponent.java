package ${package};

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {TestMainModule.class})
public interface TestMainComponent extends MainComponent {
}
