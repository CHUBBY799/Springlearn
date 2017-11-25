package soundsystem;

import concert.Audience;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration

//@PropertySource("classpath:app.properties")
//@ComponentScan(basePackageClasses = Audience.class)
//@ImportResource("classpath:springbeans.xml")
@EnableAspectJAutoProxy
public class CDConfig {
//    @Autowired
//    org.springframework.core.env.Environment env;
//    @Bean
//    public CompactDisc disc(){
//        return new BlankDisc(env.getProperty("wisc.title"),env.getProperty("disc.artist"));
//    }
    @Bean
    public CompactDisc disc(){
        String[] str={"a","b","c","d"};
        List a = Arrays.asList(str);
        return new BlankDisc("blank","jack",a);
    }
    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
