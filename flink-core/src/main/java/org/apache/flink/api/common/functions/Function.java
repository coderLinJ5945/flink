/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.api.common.functions;

import org.apache.flink.annotation.Public;

/**
 * The base interface for all user-defined functions.
 *
 * <p>This interface is empty in order to allow extending interfaces to
 * be SAM (single abstract method) interfaces that can be implemented via Java 8 lambdas.</p>
 *
 * 可序列化函数大类父接口，强调目前function的所有父接口
 *
 * 空接口函数，用于所有用户自定义函数定义实现，具有序列化属性
 */
@Public
public interface Function extends java.io.Serializable {
}
