/*
 * Copyright 2019 WeBank
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.linkis.cli.common.entity.command;

import java.util.List;
import java.util.Map;

/**
 * @program: linkis-cli
 * @description:
 * @author: shangda
 * @create: 2021/02/26 18:42
 */
public interface CmdTemplate extends Cloneable {
    CmdType getCmdType();

    List<CmdOption<?>> getOptions();

    /**
     * Mapping from option name -> option
     */
    Map<String, CmdOption<?>> getOptionsMap();

    void checkParams();

    CmdTemplate getCopy();

}