package cn.ebatech.imixpark.user;

import cn.ebatech.imixpark.common.model.user.User;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class SerializationOptimizerImpl implements SerializationOptimizer {

    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        classes.add(User.class);
        return classes;
    }
}
