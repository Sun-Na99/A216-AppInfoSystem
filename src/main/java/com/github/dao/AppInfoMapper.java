package com.github.dao;

import com.github.pojo.AppInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppInfoMapper {
    int getTotalCount(QueryAppInfoVO queryAppInfoVO);

    List<AppInfo> findAppInfo(QueryAppInfoVO queryAppInfoVO);
    List<DataDictionary> findDictionaryList(String param);
}
