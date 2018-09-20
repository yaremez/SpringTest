package com.yaremez;

import com.yaremez.knight.BraveKnight;
import com.yaremez.knight.quest.Quest;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}