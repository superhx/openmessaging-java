/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.openmessaging;

import java.util.Properties;

public class MessageAccessor {
    public static Properties getSystemProperties(final Message msg) {
        return msg.systemProperties;
    }


    public static void setSystemProperties(final Message msg, Properties systemProperties) {
        msg.systemProperties = systemProperties;
    }


    public static void putSystemProperties(final Message msg, final String key, final String value) {
        msg.putSystemProperties(key, value);
    }


    public static String getSystemProperties(final Message msg, final String key) {
        return msg.getSystemProperties(key);
    }
}
