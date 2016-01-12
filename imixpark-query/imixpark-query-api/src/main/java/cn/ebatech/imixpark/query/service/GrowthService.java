package cn.ebatech.imixpark.query.service;

import java.util.List;
import java.util.Map;

import cn.ebatech.imixpark.common.model.user.Growth_Value;

public interface GrowthService {

    List<Growth_Value> search(Map<String, Object> parameters);
}
