package com.swarna.code;

import com.swarna.code.expectedImpl.SummationOfOdd;
import com.swarna.code.expectedImpl._15ThreeSumSolved;
import com.swarna.code.practiceImpl._15ThreeSumPractice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

class _15ThreeSumTest {
    private static final Logger logger = Logger.getLogger(SummationOfOdd.class.getName());
    private _15ThreeSumSolved solved = new _15ThreeSumSolved();
    private _15ThreeSumPractice practice = new _15ThreeSumPractice();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void Test(int[] nums) {
        List<List<Integer>> expected = solved.threeSum(nums);
        List<List<Integer>> actual = practice.threeSum(nums);
        logger.info("expected=" + expected + ", actual=" + actual);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(new int[]{-1,0,1,2,-1,-4}),
                Arguments.of(new int[]{0,1,1}),
                Arguments.of(new int[]{0,0,0})
        );
    }

}