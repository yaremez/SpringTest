package com.yaremez.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        BlankDisc cd = new BlankDisc();
        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        cd.setArtist("The Beatles");

        cd.setTracks(List.of("Sgt. Pepper's Lonely Hearts Club Band", "With a Little Help from My Friends", "Lucy in the Sky with Diamonds", "Getting Better", "Fixing a Hole", "Fixing a Hole2", "Fixing a Hole3", "Fixing a Hole4", "Fixing a Hole5", "Fixing a Hole6"));
        return cd;
    }
}