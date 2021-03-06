/*
 * #%L
 * ACS AEM Commons Bundle
 * %%
 * Copyright (C) 2014 Adobe
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
package com.adobe.acs.commons.images.impl;

import com.adobe.acs.commons.images.NamedImageTransformer;
import com.day.image.Layer;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.wrappers.ValueMapDecorator;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmptyNamedImageTransformer implements NamedImageTransformer {

    @Override
    public Layer transform(final Layer layer) {
        return layer;
    }

    @Override
    public Map<String, ValueMap> getImageTransforms() {
        final Map<String, ValueMap> transforms = new LinkedHashMap<String, ValueMap>();

        return transforms;
    }

}
