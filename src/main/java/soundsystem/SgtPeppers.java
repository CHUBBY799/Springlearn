package soundsystem;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SgtPeppers implements CompactDisc {
    private String title="Sgt";
    private String artist="the beatles";
    public void play(){
        System.out.println("Playing"+title+"by"+artist);
        System.out.println(this.hashCode());

    }

    @Override
    public void playTrack(int i) {

    }
}
