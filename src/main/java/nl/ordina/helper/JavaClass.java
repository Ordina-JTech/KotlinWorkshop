/*
 * Copyright 2018 Ivo Woltring <WebMaster@ivonet.nl>
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

package nl.ordina.helper;

public class JavaClass {

    private final String str;

    private final boolean bool;

    public JavaClass(String arg1, boolean arg2) {
        this.str = arg1;
        this.bool = arg2;
    }

    public String getStr() {
        return this.str;
    }

    public boolean isBool() {
        return this.bool;
    }

    public String getJavaFunction() {
        return "Argument 1 has value: " + this.str + " and argument 2 has value: " + this.bool;
    }

    public int getJavaFunctionWithParameters(int x, int y) {
        return x + y;
    }

}
