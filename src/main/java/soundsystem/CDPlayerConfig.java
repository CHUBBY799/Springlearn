package soundsystem;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan

public class CDPlayerConfig {
//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    public CompactDisc sgtPeppers(){
//        return new SgtPeppers();
//    }


    @Bean
    public CDPlayer cDPlayer(CompactDisc compactDisc){

        return new CDPlayer(compactDisc);
    }
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

}
