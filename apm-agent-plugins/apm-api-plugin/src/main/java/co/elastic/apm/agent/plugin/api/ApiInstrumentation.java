/*-
 * #%L
 * Elastic APM Java agent
 * %%
 * Copyright (C) 2018 - 2019 Elastic and contributors
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package co.elastic.apm.agent.plugin.api;

import co.elastic.apm.agent.bci.ElasticApmInstrumentation;

import java.util.Collection;
import java.util.Collections;

import static co.elastic.apm.agent.plugin.api.ElasticApmApiInstrumentation.PUBLIC_API_INSTRUMENTATION_GROUP;

public abstract class ApiInstrumentation extends ElasticApmInstrumentation {
    @Override
    public boolean includeWhenInstrumentationIsDisabled() {
        return true;
    }

    @Override
    public Collection<String> getInstrumentationGroupNames() {
        return Collections.singleton(PUBLIC_API_INSTRUMENTATION_GROUP);
    }
}
