/*
 * (c) Copyright 2022 Palantir Technologies Inc. All rights reserved.
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
package com.palantir.gradle.jakartapackagealignment;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import org.apache.maven.artifact.versioning.ComparableVersion;
import org.gradle.api.artifacts.component.ModuleComponentSelector;

final class VersionMappings {

    private static final Map<String, VersionMapping> mappings = ImmutableMap.<String, VersionMapping>builder()
            .put(
                    "com.sun.activation:jakarta.activation",
                    new VersionMapping(
                            new MavenCoordinate("com.sun.activation", "jakarta.activation", "1.2.2"),
                            new MavenCoordinate("com.sun.activation", "javax.activation", "1.2.0")))
            .put(
                    "com.sun.mail:jakarta.mail",
                    new VersionMapping(
                            new MavenCoordinate("com.sun.mail", "jakarta.mail", "1.6.7"),
                            new MavenCoordinate("com.sun.mail", "javax.mail", "1.6.2")))
            .put(
                    "jakarta.activation:jakarta.activation-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.activation", "jakarta.activation-api", "1.2.2"),
                            new MavenCoordinate("javax.activation", "javax.activation-api", "1.2.0")))
            .put(
                    "jakarta.annotation:jakarta.annotation-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.annotation", "jakarta.annotation-api", "1.3.5"),
                            new MavenCoordinate("javax.annotation", "javax.annotation-api", "1.3.2")))
            .put(
                    "jakarta.batch:jakarta.batch-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.batch", "jakarta.batch-api", "1.0.2"),
                            new MavenCoordinate("javax.batch", "javax.batch-api", "1.0.1")))
            .put(
                    "jakarta.ejb:jakarta.ejb-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.ejb", "jakarta.ejb-api", "3.2.6"),
                            new MavenCoordinate("javax.ejb", "javax.ejb-api", "3.2.2")))
            .put(
                    "jakarta.el:jakarta.el-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.el", "jakarta.el-api", "3.0.3"),
                            new MavenCoordinate("javax.el", "javax.el-api", "3.0.0")))
            .put(
                    "jakarta.enterprise.concurrent:jakarta.enterprise.concurrent-api",
                    new VersionMapping(
                            new MavenCoordinate(
                                    "jakarta.enterprise.concurrent", "jakarta.enterprise.concurrent-api", "1.1.2"),
                            new MavenCoordinate(
                                    "javax.enterprise.concurrent", "javax.enterprise.concurrent-api", "1.1")))
            .put(
                    "jakarta.faces:jakarta.faces-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.faces", "jakarta.faces-api", "2.3.2"),
                            new MavenCoordinate("javax.faces", "javax.faces-api", "2.3")))
            .put(
                    "jakarta.inject:jakarta.inject-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.inject", "jakarta.inject-api", "1.0.5"),
                            new MavenCoordinate("javax.inject", "javax.inject", "1")))
            .put(
                    "jakarta.interceptor:jakarta.interceptor-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.interceptor", "jakarta.interceptor-api", "1.2.5"),
                            new MavenCoordinate("javax.interceptor", "javax.interceptor-api", "1.2.2")))
            .put(
                    "jakarta.jms:jakarta.jms-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.jms", "jakarta.jms-api", "2.0.3"),
                            new MavenCoordinate("javax.jms", "javax.jms-api", "2.0.1")))
            .put(
                    "jakarta.json.bind:jakarta.json.bind-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.json.bind", "jakarta.json.bind-api", "1.0.2"),
                            new MavenCoordinate("javax.json.bind", "javax.json.bind-api", "1.0")))
            .put(
                    "jakarta.json:jakarta.json-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.json", "jakarta.json-api", "1.1.6"),
                            new MavenCoordinate("javax.json", "javax.json-api", "1.1.4")))
            .put(
                    "jakarta.jws:jakarta.jws-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.jws", "jakarta.jws-api", "2.1.0"),
                            new MavenCoordinate("javax.jws", "javax.jws-api", "1.1")))
            .put(
                    "jakarta.mail:jakarta.mail-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.mail", "jakarta.mail-api", "1.6.7"),
                            new MavenCoordinate("javax.mail", "javax.mail-api", "1.6.2")))
            .put(
                    "jakarta.persistence:jakarta.persistence-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.persistence", "jakarta.persistence-api", "2.2.3"),
                            new MavenCoordinate("javax.persistence", "javax.persistence-api", "2.2")))
            .put(
                    "jakarta.resource:jakarta.resource-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.resource", "jakarta.resource-api", "1.7.4"),
                            new MavenCoordinate("javax.resource", "javax.resource-api", "1.7.1")))
            .put(
                    "jakarta.security.enterprise:jakarta.security.enterprise-api",
                    new VersionMapping(
                            new MavenCoordinate(
                                    "jakarta.security.enterprise", "jakarta.security.enterprise-api", "1.0.2"),
                            new MavenCoordinate("javax.security.enterprise", "javax.security.enterprise-api", "1.0")))
            .put(
                    "jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.servlet.jsp.jstl", "jakarta.servlet.jsp.jstl-api", "1.2.7"),
                            new MavenCoordinate("javax.servlet.jsp.jstl", "javax.servlet.jsp.jstl-api", "1.2.2")))
            .put(
                    "jakarta.servlet.jsp:jakarta.servlet.jsp-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.servlet.jsp", "jakarta.servlet.jsp-api", "2.3.6"),
                            new MavenCoordinate("javax.servlet.jsp", "javax.servlet.jsp-api", "2.3.3")))
            .put(
                    "jakarta.servlet:jakarta.servlet-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.servlet", "jakarta.servlet-api", "4.0.4"),
                            new MavenCoordinate("javax.servlet", "javax.servlet-api", "4.0.1")))
            .put(
                    "jakarta.transaction:jakarta.transaction-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.transaction", "jakarta.transaction-api", "1.3.3"),
                            new MavenCoordinate("javax.transaction", "javax.transaction-api", "1.3")))
            .put(
                    "jakarta.validation:jakarta.validation-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.validation", "jakarta.validation-api", "2.0.2"),
                            new MavenCoordinate("javax.validation", "validation-api", "2.0.1.Final")))
            .put(
                    "jakarta.websocket:jakarta.websocket-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.websocket", "jakarta.websocket-api", "1.1.2"),
                            new MavenCoordinate("javax.websocket", "javax.websocket-api", "1.1")))
            .put(
                    "jakarta.ws.rs:jakarta.ws.rs-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.ws.rs", "jakarta.ws.rs-api", "2.1.6"),
                            new MavenCoordinate("javax.ws.rs", "javax.ws.rs-api", "2.1.1")))
            .put(
                    "jakarta.xml.bind:jakarta.xml.bind-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.xml.bind", "jakarta.xml.bind-api", "2.3.3"),
                            new MavenCoordinate("javax.xml.bind", "jaxb-api", "2.3.1")))
            .put(
                    "jakarta.xml.soap:jakarta.xml.soap-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.xml.soap", "jakarta.xml.soap-api", "1.4.2"),
                            new MavenCoordinate("javax.xml.soap", "javax.xml.soap-api", "1.4.0")))
            .put(
                    "jakarta.xml.ws:jakarta.xml.ws-api",
                    new VersionMapping(
                            new MavenCoordinate("jakarta.xml.ws", "jakarta.xml.ws-api", "2.3.3"),
                            new MavenCoordinate("javax.xml.ws", "jaxws-api", "2.3.1")))
            .buildOrThrow();

    private VersionMappings() {}

    static Optional<String> getReplacement(ModuleComponentSelector selector) {
        String key = selector.getGroup() + ":" + selector.getModule();
        VersionMapping mapping = mappings.get(key);

        if (mapping != null) {
            ComparableVersion requestedVersion = new ComparableVersion(selector.getVersion());
            if (requestedVersion.compareTo(mapping.getMaxJakartaVersionWithJavaxNamespace()) <= 0) {
                return Optional.of(mapping.getMappedJavaeeCoord());
            }
        }

        return Optional.empty();
    }
}
