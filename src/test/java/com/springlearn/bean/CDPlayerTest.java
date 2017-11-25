package com.springlearn.bean;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springbeans.xml")

public class CDPlayerTest {
//    @Rule
//   public final SystemOutRule systemOutRule=new SystemOutRule().enableLog();
    @Autowired
    private CompactDisc cd;
    @Autowired
    private TrackCounter trackCounter;
//    @Autowired
//    @Qualifier("cDPlayer")
//    private MediaPlayer player;
//    @Autowired
//    @Qualifier("cdPlayer")
//    private MediaPlayer player2;

//    @Test
//    public void cdShouldNotBeNull(){
//        cd.play();
////        System.out.println("a");

//    @Test
//    public void play(){
//        player.play();
//        player2.play();
//        System.out.println(player.hashCode());
//
//        System.out.println(player2.hashCode());
////        assertEquals("PlayingSgtbythe beatles\n",systemOutRule.getLog());

//    }
   @Test
    public void play(){
       cd.playTrack(0);
       cd.playTrack(0);
   }
}
