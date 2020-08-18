/**
 * Copyright (C) 2020 Mike Hummel (mh@mhus.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.mhus.rest.core.api;

import java.util.List;

import de.mhus.rest.core.CallContext;
import de.mhus.rest.core.RestSocket;

public interface Node {

    String ACTION = "_action";

    String PUBLIC_NODE_NAME = "public";

    String ROOT_PARENT = "";

    Node lookup(List<String> parts, CallContext callContext) throws Exception;

    RestResult doRead(CallContext callContext) throws Exception;

    RestResult doAction(CallContext callContext) throws Exception;

    RestResult doCreate(CallContext callContext) throws Exception;

    RestResult doUpdate(CallContext callContext) throws Exception;

    RestResult doDelete(CallContext callContext) throws Exception;

    boolean streamingAccept(RestSocket socket);

    void streamingText(RestSocket socket, String message);

    void streamingBinary(RestSocket socket, byte[] payload, int offset, int len);

}
