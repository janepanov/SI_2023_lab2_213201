package mk.ukim.finki;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class SILab2Test{
    @Test
    void testEveryBranch(){
        assertFalse(SILab2.function(new User("null", "test", "si@lab2.com"), new ArrayList<>(List.of(
                new User("nikolagruevski", "budapestKing", "gruevski@vmro.mk"),
                new User("sasomijalkov", "stanovi#50", "mijalkov@vmro.mk")
        ))));

        assertFalse(SILab2.function(new User("bubokarov", "trotinet 69", "bubokarov@gmail.com"), new ArrayList<>(List.of(
                new User("janepanov", "randomPassword", "panovjane@finki.ukim.mk"),
                new User("bubokarov", "trotinet69#", "bubokarov@gmail.com")
        ))));

        assertFalse(SILab2.function(new User("milepanika", "tocak123", "milepanika@yahoo.com"), new ArrayList<>(List.of(
                new User("bezimenko10", "goldeneagle7", "goldeneagle@gmail.com"),
                new User("bezimenko99", "malomakijato#100!", "bezimenko99@gradle.com")
        ))));

        assertFalse(SILab2.function(new User("toshomalerot", "r#wed9xwZ", "toshomalerotgmailcom"), new ArrayList<>(List.of(
                new User("bezimenko15", "bigalbania", "bigalbania@goal.al"),
                new User("bzeimenko55", "sakimajbliki#7", "bezimenko55@gradle.com")
        ))));

        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Java", null, "java@cat.tmf"), new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    @Test
    void testMultipleCondition(){
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>(List.of(new User("Tinki", "teletabis1!", "tinki@teletabisi.com")))));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Vinki", null, "vinki@teletabisi.com"), new ArrayList<>(List.of(new User("Vinki", "u7i82C#zpa", "vinki@teletabisi.com")))));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Lala", "la7la4#zi", null), new ArrayList<>(List.of(new User("Lala", "la7la4#zi", "lala@teletabisi.com")))));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        assertTrue(() -> SILab2.function(new User("Po", "p9o6zz!cMa", "po@teletabisi.com"), new ArrayList<>(List.of(new User("bezimenko1000", "bin!bin888", "bezimenko1000@gradle.com")))));
    }
}