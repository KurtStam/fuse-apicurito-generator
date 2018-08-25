/*
 * Copyright (C) 2018 Red Hat, Inc.
 *
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
 */
package com.redhat.fuse.apicurio.jaxrs;

import org.apache.cxf.annotations.Provider;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;

/**
 * Enables the Swagger2Feature so that the /swagger.json endpoint is
 * exposed.
 */
@Provider(value = Provider.Type.Feature, scope = Provider.Scope.Server)
public class OpenAPIFeature extends Swagger2Feature {
}
