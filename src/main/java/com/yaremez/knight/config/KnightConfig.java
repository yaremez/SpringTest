package com.yaremez.knight.config;

import com.yaremez.knight.BraveKnight;
import com.yaremez.knight.Knight;
import com.yaremez.knight.quest.Quest;
import com.yaremez.knight.quest.SlayDragonQuest;
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