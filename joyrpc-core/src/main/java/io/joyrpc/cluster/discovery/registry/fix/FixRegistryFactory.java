package io.joyrpc.cluster.discovery.registry.fix;

/*-
 * #%L
 * joyrpc
 * %%
 * Copyright (C) 2019 joyrpc.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import io.joyrpc.cluster.discovery.registry.AbstractRegistryFactory;
import io.joyrpc.cluster.discovery.registry.Registry;
import io.joyrpc.extension.Extension;
import io.joyrpc.extension.URL;

/**
 * 固定注册中心工厂类
 */
@Extension(value = "fix")
public class FixRegistryFactory extends AbstractRegistryFactory {
    @Override
    protected Registry createRegistry(URL url) {
        return new FixRegistry(url);
    }
}
