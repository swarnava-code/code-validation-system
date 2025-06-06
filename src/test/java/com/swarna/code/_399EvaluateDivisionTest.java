package com.swarna.code;

import com.swarna.code.expectedImpl.SummationOfOdd;
import com.swarna.code.expectedImpl._207CourseScheduleSolved;
import com.swarna.code.practiceImpl._207CourseSchedulePractice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.logging.Logger;
import java.util.stream.Stream;

class _399EvaluateDivisionTest {
    private static final Logger logger = Logger.getLogger(SummationOfOdd.class.getName());
    private _207CourseScheduleSolved solved = new _207CourseScheduleSolved();
    private _207CourseSchedulePractice practice = new _207CourseSchedulePractice();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void Test(int n, int[][] preReq) {
        boolean expected = solved.canFinish(n, preReq);
        boolean actual = practice.canFinish(n, preReq);
        logger.info("expected=" + expected + ", actual=" + actual);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(2, new int[][]{{1, 0}}),
                Arguments.of(2, new int[][]{{1, 0}, {0, 1}}),
                Arguments.of(4, new int[][]{{1, 0}, {2, 1}, {3, 2}}),
                Arguments.of(3, new int[][]{}),
                Arguments.of(5, new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}})
        );
    }

}