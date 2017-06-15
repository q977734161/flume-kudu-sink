/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.flume.sink.kudu;

/**
 * Constants used for configuration of KuduSink
 */
public class KuduSinkConfigurationConstants {
  /**
   * The Kudu master host address.
   */
  public static final String CONFIG_MASTER_HOST = "master";
  /**
   * The Kudu table which the sink should write to.
   */
  public static final String CONFIG_TABLE = "table";
  /**
   * The fully qualified class name of the serializer the sink should use.
   */
  public static final String CONFIG_SERIALIZER = "serializer";
  /**
   * Configuration to pass to the serializer.
   */
  public static final String CONFIG_SERIALIZER_PREFIX = CONFIG_SERIALIZER + ".";
  /**
   * Maximum number of events the sink should take from the channel per
   * transaction, if available.
   */
  public static final java.lang.String CONFIG_BATCH_SIZE = "batchSize";

  public static final java.lang.String CONFIG_TIMEOUT_MILLIS = "timeoutMillis";
}
