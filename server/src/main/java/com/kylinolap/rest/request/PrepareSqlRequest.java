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

package com.kylinolap.rest.request;

/**
 * @author xduo
 *
 */
public class PrepareSqlRequest extends SQLRequest {

    public PrepareSqlRequest() {
        super();
    }

    private StateParam[] params;

    public StateParam[] getParams() {
        return params;
    }

    public void setParams(StateParam[] params) {
        this.params = params;
    }

    public static class StateParam {
        private String className;
        private String value;

        public StateParam() {
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
