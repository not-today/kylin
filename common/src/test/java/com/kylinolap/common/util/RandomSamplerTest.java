/*
 * Copyright 2013-2014 eBay Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kylinolap.common.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.io.Text;
import org.junit.Test;

/**
 * @author ysong1
 *
 */
public class RandomSamplerTest {

    @Test
    public void test() {
        RandomSampler<Text> s = new RandomSampler<Text>();
        List<Text> data = new ArrayList<Text>();
        for (int i = 0; i < 1000; i++) {
            data.add(new Text(String.valueOf(i)));
        }

        List<Text> result = s.sample(data, 50);
        System.out.println(result);
        assertEquals(50, result.size());
    }

}
