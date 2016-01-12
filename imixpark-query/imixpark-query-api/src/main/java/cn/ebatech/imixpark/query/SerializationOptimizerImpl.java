/**
 * Copyright 1999-2014 dangdang.com.
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
package cn.ebatech.imixpark.query;

import cn.ebatech.imixpark.common.model.market.Activity;
import cn.ebatech.imixpark.common.model.market.Category;
import cn.ebatech.imixpark.common.model.market.Mall;
import cn.ebatech.imixpark.common.model.market.Store;
import cn.ebatech.imixpark.common.model.market.Shop;
import cn.ebatech.imixpark.common.model.user.PushSetting;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class SerializationOptimizerImpl implements SerializationOptimizer {

    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        classes.add(Mall.class);
        classes.add(Shop.class);
        classes.add(Activity.class);
        classes.add(Category.class);
        classes.add(Store.class);
        classes.add(PushSetting.class);
        return classes;
    }
}
