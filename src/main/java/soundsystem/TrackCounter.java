package soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;

//@Aspect
public class TrackCounter {
    private  HashMap<Integer,Integer> map=new HashMap<>();
    public int getPlayCount(int i){
        return map.containsKey(i)?map.get(i):0;
    }
//    @Pointcut("execution(* soundsystem.BlankDisc.playTrack(int))"+"&& args(w)")
//    public void trackPlayer(int w){}
//    @Before("trackPlayer(w)")
    public void countTrack(int w){
        int i=getPlayCount(w);
        map.put(w,++i);
    }
}
