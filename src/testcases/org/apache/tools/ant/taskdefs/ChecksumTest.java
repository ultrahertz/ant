/*
 * Copyright  2001,2003-2005 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildFileTest;

import java.io.IOException;
import java.io.File;

/**
 */
public class ChecksumTest extends BuildFileTest {

    public ChecksumTest(String name) {
        super(name);
    }

    public void setUp() {
        configureProject("src/etc/testcases/taskdefs/checksum.xml");
    }

    public void tearDown() {
        executeTarget("cleanup");
    }

    public void testCreateMd5() throws IOException {
        executeTarget("createMd5");
    }

    public void testCreateMD5SUMformat() throws IOException {
        executeTarget("createMD5SUMformat");
    }
    
    public void testCreateSVFformat() throws IOException {
        executeTarget("createSVFformat");
    }
    
    public void testCreatePattern() throws IOException {
        executeTarget("createPattern");
    }

    public void testSetProperty() {
        executeTarget("setProperty");
    }

    public void testVerifyTotal() {
        executeTarget("verifyTotal");
    }

    public void testVerifyTotalRC() {
        executeTarget("verifyTotalRC");
    }

    public void testVerifyChecksumdir() {
        executeTarget("verifyChecksumdir");
    }

    public void testVerifyAsTask() {
        executeTarget("verifyAsTask");
    }

    public void testVerifyMD5SUMAsTask() {
        executeTarget("verifyMD5SUMAsTask");
    }

    public void testVerifyAsCondition() {
        executeTarget("verifyAsCondition");
    }

    public void testVerifyFromProperty() {
        executeTarget("verifyFromProperty");
    }

    public void testVerifyChecksumdirNoTotal() {
        executeTarget("verifyChecksumdirNoTotal");
    }

}
