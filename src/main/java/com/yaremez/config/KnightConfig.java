package com.yaremez.config;

import com.yaremez.knight.BraveKnight;
import com.yaremez.knight.Knight;
import com.yaremez.quest.Quest;
import com.yaremez.quest.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}