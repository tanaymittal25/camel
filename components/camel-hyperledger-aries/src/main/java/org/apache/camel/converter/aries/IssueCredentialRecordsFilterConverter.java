/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.converter.aries;

import java.util.Map;

import com.google.gson.JsonObject;
import org.apache.camel.Converter;
import org.hyperledger.aries.api.issue_credential_v1.IssueCredentialRecordsFilter;

@Converter(generateLoader = true)
public final class IssueCredentialRecordsFilterConverter extends AbstractAriesConverter {

    @Converter
    public static IssueCredentialRecordsFilter toAries(JsonObject jsonObj) {
        return toAries(jsonObj, IssueCredentialRecordsFilter.class);
    }

    @Converter
    public static IssueCredentialRecordsFilter toAries(String json) {
        return toAries(json, IssueCredentialRecordsFilter.class);
    }

    @Converter
    public static IssueCredentialRecordsFilter toAries(Map<String, Object> map) {
        return toAries(map, IssueCredentialRecordsFilter.class);
    }
}
