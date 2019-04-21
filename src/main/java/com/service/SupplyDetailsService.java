package com.service;

import com.entity.Supply;
import com.entity.SupplyDetails;

public interface SupplyDetailsService {
    //增加一个供需
    int addSupplyDetails(SupplyDetails supply);
    //删除一个供需
    int deleteSupplyDetailsById(String id);
    //更新一个供需
    int updateSupplyDetails(SupplyDetails supply);
    //查找一个供需
    SupplyDetails querySupplyDetailsById(String id);
}
