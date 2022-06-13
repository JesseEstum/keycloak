/*
 * Copyright 2022. Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.models.map.credential;

import org.keycloak.credential.CredentialInput;

import java.util.List;
import java.util.stream.Stream;

/**
 * Standard implementation for a {@link MapSingleEntityCredentialManagerEntity} where the store doesn't provide
 * validation of credentials.
 *
 * @author Alexander Schwartz
 */
public class DefaultMapSingleEntityCredentialManagerEntity implements MapSingleEntityCredentialManagerEntity {
    @Override
    public void validateCredentials(List<CredentialInput> inputs) {
    }

    @Override
    public boolean updateCredential(CredentialInput input) {
        return false;
    }

    @Override
    public boolean isConfiguredFor(String type) {
        return false;
    }

    @Override
    public Stream<String> getDisableableCredentialTypesStream() {
        return Stream.empty();
    }
}