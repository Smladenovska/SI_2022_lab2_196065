import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {


    @Test
    void everyBranchTest(){
        List<String> case1 = List.of();
        List<String> case2 = List.of();

        IllegalArgumentException illegalGrater, illegalPerfect;

        illegalGrater = assertThrows(IllegalArgumentException.class, () ->SILab2.function(case1));
        assertTrue(illegalGrater.getMessage().contains("List length should be greater than 0"));

        illegalPerfect = assertThrows(IllegalArgumentException.class, () ->SILab2.function(case2));
        assertTrue(illegalPerfect.getMessage().contains("List length should be a perfect square"));



    }

}
