package com.swarna.code;

import com.swarna.code.expectedImpl.SummationOfOdd;
import com.swarna.code.expectedImpl._200NumberOfIslandsSolved;
import com.swarna.code.practiceImpl._200NumberOfIslandsPractice;
import com.swarna.code.util.HardCopyUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.logging.Logger;
import java.util.stream.Stream;

class _200NumberOfIslandsTest {
    private static final Logger logger = Logger.getLogger(SummationOfOdd.class.getName());
    private static final HardCopyUtil hardCopyUtil = new HardCopyUtil();
    private _200NumberOfIslandsSolved solved = new _200NumberOfIslandsSolved();
    private _200NumberOfIslandsPractice practice = new _200NumberOfIslandsPractice();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void Test(char[][] grid) {
        char[][] hardCopy = hardCopyUtil.copy2dArray(grid);
        int expected = solved.numIslands(grid);
        int actual = practice.numIslands(hardCopy);
        logger.info("expected=" + expected + ", actual=" + actual);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of((Object) new char[][]{
                        {'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}
                }),
                Arguments.of((Object) new char[][]{
                        {'1','1','0','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}
                }),
                Arguments.of((Object) new char[][]{
                        {'1','0','1','0','1'},
                        {'0','1','0','1','0'},
                        {'1','0','1','0','1'}
                }),
                Arguments.of((Object) new char[][]{
                        {'0','0','0'},
                        {'0','0','0'},
                        {'0','0','0'}
                }),
                Arguments.of((Object) new char[][]{
                        {'1'}
                })
        );
    }
}