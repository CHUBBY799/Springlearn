package soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
//@Component
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String>  tracks;
//    public BlankDisc(
//            @Value("#{setting['wisc.title']}") String title,
////           @Value("#{setting['disc.artist']}") String artist
////    )
//    {
//        this.artist=artist;
//        this.title=title;
////        this.tracks=tracks;
//    }
public BlankDisc(
            String title,
            String artist,
            List<String> tracks
    )
    {
        this.artist=artist;
        this.title=title;
        this.tracks=tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing"+title+"by"+artist);
        for(String s:tracks){
            System.out.println("-Track: "+s);
        }
    }
    public void playTrack(int i){
        System.out.println(tracks.get(i));
    }
}
