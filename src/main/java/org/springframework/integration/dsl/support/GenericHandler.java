/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.dsl.support;

import java.util.Map;

/**
 * A functional interface to specify {@link org.springframework.messaging.MessageHandler}
 * logic with Java 8 Lambda expression:
 * <pre class="code">
 * {@code
 *  .<Integer>handle((p, h) -> p / 2)
 * }
 * </pre>
 *
 * @param <P> the expected {@code payload} type.
 *
 * @author Artem Bilan
 */
public interface GenericHandler<P> {

	Object handle(P payload, Map<String, Object> headers);

}
