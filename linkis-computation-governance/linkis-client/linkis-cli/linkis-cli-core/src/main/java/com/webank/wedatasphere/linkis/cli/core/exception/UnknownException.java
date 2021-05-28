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

package com.webank.wedatasphere.linkis.cli.core.exception;

import com.webank.wedatasphere.linkis.cli.common.exception.LinkisClientRuntimeException;
import com.webank.wedatasphere.linkis.cli.common.exception.error.ErrorLevel;
import com.webank.wedatasphere.linkis.cli.common.exception.error.ErrorMsg;

/**
 * @program: linkis-cli
 * @description: unknown exception
 * @author: shangda
 * @create: 2020/11/09 17:06
 */
public class UnknownException extends LinkisClientRuntimeException {
    private static final long serialVersionUID = 974159L;

    public UnknownException(String code, ErrorLevel level, ErrorMsg errMsg, String param[], String... extMsg) {
        super(code, level, errMsg, param, extMsg);
    }

    public UnknownException(String code, ErrorLevel level, ErrorMsg errMsg, Object... paramsList) {
        super(code, level, errMsg, paramsList);
    }
}