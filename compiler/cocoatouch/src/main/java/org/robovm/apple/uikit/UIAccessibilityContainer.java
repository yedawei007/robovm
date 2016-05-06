/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
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
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIAccessibilityContainer/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "accessibilityElements")
    NSArray<UIAccessibilityElement> getAccessibilityElements();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setAccessibilityElements:")
    void setAccessibilityElements(NSArray<UIAccessibilityElement> v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "accessibilityElementCount")
    @MachineSizedSInt long getAccessibilityElementCount();
    @Method(selector = "accessibilityElementAtIndex:")
    UIAccessibilityElement getAccessibilityElement(@MachineSizedSInt long index);
    @Method(selector = "indexOfAccessibilityElement:")
    @MachineSizedSInt long indexOfAccessibilityElement(UIAccessibilityElement element);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}