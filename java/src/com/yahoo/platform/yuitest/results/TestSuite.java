/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */

package com.yahoo.platform.yuitest.results;

import java.util.List;

/**
 *
 * @author Nicholas C. Zakas
 */
public class TestSuite {

    private String name;
    private int duration;
    private int passed;
    private int failed;
    private int ignored;
    private List<TestCase> testCases;
    private List<TestSuite> testSuites;

    protected TestSuite(String name, int duration, int passed, int failed, int ignored) {
        this.name = name;
        this.duration = duration;
        this.passed = passed;
        this.failed = failed;
        this.ignored = ignored;
    }

    protected void addTestSuite(TestSuite suite){
        testSuites.add(suite);
    }

    protected void addTestCase(TestCase testCase){
        testCases.add(testCase);
    }

    public int getDuration() {
        return duration;
    }

    public int getFailed() {
        return failed;
    }

    public String getName() {
        return name;
    }

    public int getPassed() {
        return passed;
    }

    public int getIgnored() {
        return ignored;
    }

    public TestSuite[] getTestSuites(){
        return testSuites.toArray(new TestSuite[testSuites.size()]);
    }

    public TestCase[] getTestCasees(){
        return testCases.toArray(new TestCase[testCases.size()]);
    }

}