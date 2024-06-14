package com.swarna.code;

import com.swarna.code.expectedImpl.SummationOfOdd;
import com.swarna.code.practiceImpl.PracticeSummationOfOdd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Stream;

class SummationOfOddTest {
    private static final Logger logger = Logger.getLogger(SummationOfOdd.class.getName());
    private SummationOfOdd summationOfOdd = new SummationOfOdd();
    private PracticeSummationOfOdd practiceSummationOfOdd = new PracticeSummationOfOdd();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void Test(ArrayList<Integer> integers) {
        int expected = summationOfOdd.executeOverrides(integers);
        int actual = practiceSummationOfOdd.executeOverrides(integers);
        logger.info(String.format("expected=%d, actual=%d", expected, actual));
        Assertions.assertEquals(expected, actual);
    }

    static Stream<ArrayList<Integer>> dataProvider() {
        return Stream.of(
                new ArrayList<>(Arrays.asList(0, 0, 6, 8)),
                new ArrayList<>(Arrays.asList(2, 4, 5, 9)),
                new ArrayList<>(Arrays.asList(2, 4, 3, 3)),
                new ArrayList<>(Arrays.asList(25, 45, 33, 33)),
                new ArrayList<>(Arrays.asList(5, 38, 0, 33))
        );
    }

}